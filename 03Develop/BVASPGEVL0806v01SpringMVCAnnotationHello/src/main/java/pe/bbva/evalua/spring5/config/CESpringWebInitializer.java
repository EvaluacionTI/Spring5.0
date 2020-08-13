package pe.bbva.evalua.spring5.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class CESpringWebInitializer implements WebApplicationInitializer {
	private static final Logger LOG = LoggerFactory.getLogger("CESpringWebInitializer");

	public void onStartup(ServletContext servletContext) throws ServletException {
		LOG.info("[EVL] =====[ onStartup ]=====");
		
		LOG.info("[EVL] ServletContext : {}", servletContext);
		
		AnnotationConfigWebApplicationContext oCntx = new AnnotationConfigWebApplicationContext();
		LOG.info("[EVL] Intance AnnotationConfigWebApplicationContext : {}", oCntx);
		
		oCntx.setConfigLocation("pe.bbva.evalua.spring5.config.CESpringConfiguration");
		LOG.info("[EVL] New value Context : {}", oCntx);
		
        ServletRegistration.Dynamic registration = servletContext.addServlet("springmvc", new DispatcherServlet(oCntx));
        LOG.info("[EVL] ServletRegistration.Dynamic : {}", registration);
        
        registration.setLoadOnStartup(1);
        registration.addMapping("*.ea");
        LOG.info("[EVL] New value ServletRegistration.Dynamic : {}", registration);
	}

}
