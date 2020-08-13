package pe.bbva.evalua.spring5.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"pe.bbva.evalua"})
public class CESpringConfiguration extends WebMvcConfigurationSupport{
	private static final Logger LOG = LoggerFactory.getLogger("CESpringConfiguration");

	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver() {
		LOG.info("[EVL] =====[ InternalResourceViewResolver ]=====");
		
		InternalResourceViewResolver oResolver = new InternalResourceViewResolver();
		LOG.info("[EVL] Instance InternalResourceViewResolver : {}", oResolver);
		
		oResolver.setPrefix("/WEB-INF/view/");
		oResolver.setSuffix(".jsp");
		LOG.info("[EVL] +[ Assing value of Intance : {} ", oResolver);
		return oResolver;
		
	}
}
