package pe.bbva.evalua.spring5.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class CEWebInitializer implements WebApplicationInitializer {

	private static final Logger LOG = LoggerFactory.getLogger("CEWebInitializer");

	public void onStartup(ServletContext servletContext) throws ServletException {
		LOG.info("[EVL] =====[ onStartup ]=====");

		LOG.info("[EVL] ServletContext : {}", servletContext);

		AnnotationConfigWebApplicationContext oCntx = new AnnotationConfigWebApplicationContext();
		LOG.info("[EVL] Intance AnnotationConfigWebApplicationContext : {}", oCntx);
		oCntx.setConfigLocation("pe.bbva.evalua.spring5.config.CEConfigWeb");
		LOG.info("[EVL] New value Context : {}", oCntx);

		ServletRegistration.Dynamic oDispatcher = servletContext.addServlet("tal030ArrayList", new DispatcherServlet(oCntx));
		LOG.info("[EVL] ServletRegistration.Dynamic : {}", oDispatcher);
		
		oDispatcher.setLoadOnStartup(1);
		oDispatcher.addMapping("*.ea");
		LOG.info("[EVL] New value ServletRegistration.Dynamic : {}", oDispatcher);
	}
}
