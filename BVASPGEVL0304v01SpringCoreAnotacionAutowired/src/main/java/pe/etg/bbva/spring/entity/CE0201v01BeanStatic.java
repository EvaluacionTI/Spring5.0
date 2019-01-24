package pe.etg.bbva.spring.entity;

public class CE0201v01BeanStatic {
	private static CE0201v01BeanStatic oCEBeanStatic = new CE0201v01BeanStatic();
	
	private CE0201v01BeanStatic() {}
	
	@SuppressWarnings("unused")
	private static CE0201v01BeanStatic createInstance() {
		return oCEBeanStatic;
	}
}
