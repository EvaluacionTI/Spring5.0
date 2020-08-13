package pe.bbva.evalua.spring5.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CV10VerificarCertificadoP12 {
	private static final Logger LOG = LoggerFactory.getLogger("CV10VerificarCertificadoP12");
	private static final String URL_DESTINO = "https://serviciosapxcal.pe.igrupobbva:8180/BBVAGesDocCorporativoWS/rest/v1/logical-folders?q={rsql}";
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("/pe/bbva/evalua/spring5/context-SSL.xml");
		LOG.info("[EVL] Instancia Context : {}", oCntx);
		System.setProperty("javax.net.debug", "ssl,handshake");
		System.setProperty("javax.net.ssl.keyStoreType", "pkcs12");
		
        System.setProperty("javax.net.ssl.keyStore", "/pe/bbva/evalua/spring5/certificadoP12/servicio-apx-cotiza.p12");
        System.setProperty("javax.net.ssl.keyStorePassword", "BN3t0!21!");
        
		try {
			final URL oUrl = new URL(URL_DESTINO);
			LOG.info("[EVL] Instancia Url : {}", oUrl);
			
			HttpURLConnection oCxnHttp = (HttpURLConnection) oUrl.openConnection();
			LOG.info("[EVL] HttpURLConnection Url : {}", oCxnHttp);
			
			final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(oCxnHttp.getInputStream()));
	        String inputLine;
	        final StringBuffer response = new StringBuffer();
	        LOG.info("[EVL] response {}", response.toString());
	        
	        while ((inputLine = bufferedReader.readLine()) != null) {
	            response.append(inputLine);
	        }
	        bufferedReader.close();
	        LOG.info("[EVL] final del while {}", response.toString());
		}catch(Exception ex) {
			LOG.error("[EVL] {}", ex.getLocalizedMessage());
		}

		
		((ConfigurableApplicationContext) oCntx).close();
	}
}
