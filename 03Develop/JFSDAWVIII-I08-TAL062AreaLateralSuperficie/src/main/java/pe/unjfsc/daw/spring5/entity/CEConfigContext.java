package pe.unjfsc.daw.spring5.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pe.unjfsc.daw.spring5.utility.CUConvert;

@Configuration
@ComponentScan("pe.bbva.evalua")
public class CEConfigContext {
	
	@Bean
	public CEAreaSuperficieLateral idCEAreaSuperficieLateral() {
		return new CEAreaSuperficieLateral();
	}
	
	@Bean
	public CEAreaTotalSuperficie idCEAreaTotalSuperficie() {
		return new CEAreaTotalSuperficie();
	}
	
	@Bean
	public CEMostrarDatos idCEMostrarDatos() {
		return new CEMostrarDatos();
	}
	
	@Bean
	public CUConvert idCUConvert() {
		return new CUConvert();
	}
}
