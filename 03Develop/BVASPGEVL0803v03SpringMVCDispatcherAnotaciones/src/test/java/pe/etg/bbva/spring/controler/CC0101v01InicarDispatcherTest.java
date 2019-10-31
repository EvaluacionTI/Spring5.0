package pe.etg.bbva.spring.controler;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import javax.servlet.ServletException;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;

public class CC0101v01InicarDispatcherTest {
	private static Logger MOLOG = LoggerFactory.getLogger(CC0101v01InicarDispatcherTest.class);

	@Test
	public void testHandleRequestView() throws IOException {
		MOLOG.info("[EVL] Start ");
		CC0101v01InicarDispatcher oCCControlador = new CC0101v01InicarDispatcher();
		try {
			ModelAndView oModeloVista = oCCControlador.handleRequest(null, null);
			String lsObjetoEsperado = "/WEB-INF/views/jsp0201v01MostrarFecha.jsp";
			String lsObjetoReal = oModeloVista.getViewName();
			
			MOLOG.info("[EVL] JSP Esperado : {} " + lsObjetoEsperado);
			MOLOG.info("[EVL] JSP Real     : {} " + lsObjetoReal);

			assertEquals(lsObjetoEsperado, lsObjetoReal);
			MOLOG.info("[EVL] Finish ");
		} catch (ServletException oSEX) {
			MOLOG.info("ServletException : {}", oSEX.getMessage());
		}

	}
}
