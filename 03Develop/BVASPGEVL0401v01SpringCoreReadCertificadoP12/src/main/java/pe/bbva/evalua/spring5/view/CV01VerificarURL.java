package pe.bbva.evalua.spring5.view;

import java.net.MalformedURLException;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CV01VerificarURL {
	private static final Logger LOG = LoggerFactory.getLogger("CV02VerificarCertificadoP12");
	private static final String URL_DESTINO = "https://serviciosapxcal.pe.igrupobbva:8180/BBVAGesDocCorporativoWS/rest/v1/logical-folders?q={rsql}";
	
	public static void main(String[] args){
		try {
			URL oUrl = new URL(URL_DESTINO);
			LOG.info("[EVL] Instancia Url : {}", oUrl);
			LOG.info("[EVL] String Url : {}", oUrl.toString());
			LOG.info("[EVL] Protocol Url : {}", oUrl.getProtocol());
			LOG.info("[EVL] Host Url : {}", oUrl.getHost());
			LOG.info("[EVL] Path Url : {}", oUrl.getPath());
			LOG.info("[EVL] Port Url : {}", oUrl.getPort());
			LOG.info("[EVL] Query Url : {}", oUrl.getQuery());
			LOG.info("[EVL] Ref Url : {}", oUrl.getRef());
			
		}catch(MalformedURLException ex) {
			LOG.error("[EVL] Error de URL {}", ex.getLocalizedMessage());
			ex.printStackTrace();
		}
	}
}
