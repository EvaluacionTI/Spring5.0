package pe.bbva.spring.batch.vista;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.bbva.spring.batch.configuracion.CEBeanConfiguracion;
import pe.bbva.spring.batch.entidad.CEBeanMensaje;

public class CVBeanWithAnnotation {
	private static Logger MOLOG = LogManager.getLogger(CVBeanWithAnnotation.class);
	
	public static void main(String[] args) {
		try {
		    AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext();
		    oCntx.register(CEBeanConfiguracion.class);
		    oCntx.refresh();  // SI se quita este refresh no se visualiza el contenedor.
		    CEBeanMensaje bean = oCntx.getBean(CEBeanMensaje.class);
		    bean.setsMensaje("Manejo de Bean con Anotaciones");
		    System.out.println(bean.getsMensaje());
		    oCntx.close();
			
		}catch(Exception ex) {
			ex.getMessage();
		}
	}
}
