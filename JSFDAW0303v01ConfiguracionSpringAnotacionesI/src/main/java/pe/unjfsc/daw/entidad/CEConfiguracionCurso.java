package pe.unjfsc.daw.entidad;

import org.springframework.context.annotation.Configuration;

@Configuration
public class CEConfiguracionCurso {

	// Cambiamos sólo a disponer de una sola confiuración aunque se puede tener este tambien.
	public CECurso oCECurso() {
		return new CECurso();
	}
}
