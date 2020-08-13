package pe.bbva.evalua.spring5.view;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CV05ContextSSL {
	private static final Logger LOG = LoggerFactory.getLogger("CV05ContextSSL");
	private static final String URL_DESTINO = "https://serviciosapxcal.pe.igrupobbva:8180/BBVAGesDocCorporativoWS/rest/v1/logical-folders?q={rsql}";
	private static final String KEY_P12 = "BN3t0!21!";

	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("/pe/bbva/evalua/spring5/context-SSL.xml");
		LOG.info("[EVL] Instancia Context : {}", oCntx);

		try {
			// 1. Cargamos el archivo
			InputStream oFileCertificadoConfianza = new FileInputStream(new File(
					"D:\\BBVA2020\\08Spring5.0\\03Develop\\BVASPGEVL0401v01SpringCoreReadCertificadoP12\\src\\main\\resources\\pe\\bbva\\evalua\\spring5\\certificadoP12\\servicio-apx-cotiza.p12"));
			LOG.info("[EVL] Instancia InputStream : {}", oFileCertificadoConfianza);

			KeyStore oKsCertificado = KeyStore.getInstance(KeyStore.getDefaultType());
			LOG.info("[EVL] Instancia KeyStore : {}", oKsCertificado);

			oKsCertificado.load(oFileCertificadoConfianza, KEY_P12.toCharArray());
			LOG.info("[EVL] Instancia getProvider : {}", oKsCertificado.getDefaultType());
			LOG.info("[EVL] Instancia getProvider : {}", oKsCertificado.getProvider());
			LOG.info("[EVL] Instancia getProvider : {}", oKsCertificado.getType());

			oFileCertificadoConfianza.close();

			// 2. Poner el contenido en el manager de certificados
			TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
			LOG.info("[EVL] Instancia TrustManagerFactory : {}", tmf);

			tmf.init(oKsCertificado);
			LOG.info("[EVL] Instancia Update TrustManagerFactory : {}", tmf);

			// 3. Creamos un contexto SSL con nuestro manager de certificados en los
			// que confiamos.
			SSLContext contextSSL = SSLContext.getInstance("TLS");
			LOG.info("[EVL] Instancia SSLContext : {}", contextSSL);

			contextSSL.init(null, tmf.getTrustManagers(), null);
			LOG.info("[EVL] Instancia SSLContext : {}", contextSSL);
			SSLSocketFactory sslSocketFactory = contextSSL.getSocketFactory();
			LOG.info("[EVL] Instancia SSLSocketFactory : {}", sslSocketFactory);

	
		} catch (IOException ex) {
			LOG.error("[EVL]  IOException : {}", ex.getLocalizedMessage());
			ex.printStackTrace();
		} catch (KeyStoreException ex) {
			LOG.error("[EVL]  KeyStoreException : {}", ex.getLocalizedMessage());
			ex.printStackTrace();
		} catch (NoSuchAlgorithmException ex) {
			LOG.error("[EVL]  NoSuchAlgorithmException : {}", ex.getLocalizedMessage());
			ex.printStackTrace();
		} catch (CertificateException ex) {
			LOG.error("[EVL]  NoSuchAlgorithmException : {}", ex.getLocalizedMessage());
			ex.printStackTrace();
		} catch (KeyManagementException ex) {
			LOG.error("[EVL]  KeyManagementException  : {}", ex.getLocalizedMessage());
			ex.printStackTrace();
		}

		((ConfigurableApplicationContext) oCntx).close();
	}
}
