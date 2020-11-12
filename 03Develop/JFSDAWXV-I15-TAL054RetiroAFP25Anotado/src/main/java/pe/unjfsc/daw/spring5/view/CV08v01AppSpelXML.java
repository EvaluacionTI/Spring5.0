package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEAddress;
import pe.unjfsc.daw.spring5.entity.CEAfiliado;
import pe.unjfsc.daw.spring5.entity.CEConfigExpression;
import pe.unjfsc.daw.spring5.entity.CESaldoAfiliado;

public class CV08v01AppSpelXML {
	private static final Logger LOG = LoggerFactory.getLogger("CV08v01AppSpelXML");

	public static void main(String[] args) {
		LOG.info("[EVL] Revision Spel Expression");
		AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext();
		LOG.info("[DAW] Instancia de la Annotacion : {}", oCntx);
		
		LOG.info("[DAW] Registro de la Annotacion : {}");
		oCntx.register(CEConfigExpression.class);
		oCntx.refresh();
		LOG.info("[DAW] Instancia de la clase CEConfigExpression : {}", oCntx);
		
		CESaldoAfiliado oCESaldo = oCntx.getBean(CESaldoAfiliado.class);
		LOG.info("[EVL] CESaldoAfiliado : {}", oCESaldo);
		
		CEAfiliado oCEAfiliado = (CEAfiliado) oCntx.getBean("idCEAfiliado");
		LOG.info("[EVL] CEAfiliado : {}", oCEAfiliado);
		
		CEAddress oCEAddress = (CEAddress) oCntx.getBean("idDirecion");
		LOG.info("[EVL] CEAddress : {}", oCEAddress);
		
		LOG.info("[EVL] CEAfiliado : {}", oCEAfiliado.getEmpId());
		LOG.info("[EVL] CEAfiliado : {}", oCEAfiliado.getOfficeAddress().getCity());
		LOG.info("[EVL] CEAfiliado : {}", oCEAfiliado.getOfficeAddress().getAddress(null));
		
		((ConfigurableApplicationContext) oCntx).close();

	}
}
