package pe.etg.bbva.spring.entity;

public class CE06BeanStatic {
	private static CE06BeanStatic oCEBeanStatic = new CE06BeanStatic();
	
	private CE06BeanStatic() {}
	
	private static CE06BeanStatic createInstance() {
		return oCEBeanStatic;
	}
}
