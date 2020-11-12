package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEAfiliadoListMap;
import pe.unjfsc.daw.spring5.entity.CEConfigExpression;

public class CV09v01AppListMap {
	private static final Logger LOG = LoggerFactory.getLogger("CV09v01AppListMap");

	public static void main(String[] args) {
		LOG.info("[EVL] Revision Spel Expression");
		AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext();
		LOG.info("[DAW] Instancia de la Annotacion : {}", oCntx);
		
		LOG.info("[DAW] Registro de la Annotacion : {}");
		oCntx.register(CEConfigExpression.class);
		oCntx.refresh();
		LOG.info("[DAW] Instancia de la clase CEConfigExpression : {}", oCntx);
		
		CEAfiliadoListMap oCEAfiliado = (CEAfiliadoListMap) oCntx.getBean("idCEAfiliadoListMap");
		LOG.info("[EVL] CEAfiliado : {}", oCEAfiliado);

		LOG.info("[EVL] Map[afiliado1] : {}", oCEAfiliado.getAfiliado());
		LOG.info("[EVL] List[0] : {}", oCEAfiliado.getLista());
		LOG.info("[EVL] Es numero : {}", oCEAfiliado.isValidarNumero());
		
		((ConfigurableApplicationContext) oCntx).close();

	}
}
