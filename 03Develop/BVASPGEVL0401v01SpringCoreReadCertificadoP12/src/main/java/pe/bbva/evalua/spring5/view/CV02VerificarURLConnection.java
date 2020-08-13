package pe.bbva.evalua.spring5.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CV02VerificarURLConnection {
	private static final Logger LOG = LoggerFactory.getLogger("CV02VerificarURLConnection");
	private static final String URL_DESTINO = "https://serviciosapxcal.pe.igrupobbva:8180/BBVAGesDocCorporativoWS/rest/v1/logical-folders?q={rsql}";
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("/pe/bbva/evalua/spring5/context-SSL.xml");
		LOG.info("[EVL] Instancia Context : {}", oCntx);
        
		try {
			URL oUrl = new URL(URL_DESTINO);
			LOG.info("[EVL] Instancia Url : {}", oUrl);
			URLConnection oURLCxn = oUrl.openConnection();
			
			LOG.info("[EVL] URLConnection Url : {}", oURLCxn);
			oURLCxn.connect();
	        
		}catch(MalformedURLException  ex) {
			LOG.error("[EVL] MalformedURLException : {}", ex.getLocalizedMessage());
			ex.printStackTrace();
		}catch(IOException ex) {
			LOG.error("[EVL]  IOException : {}", ex.getLocalizedMessage());
			ex.printStackTrace();
		}
		
		((ConfigurableApplicationContext) oCntx).close();
	}
}
