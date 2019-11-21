package pe.etg.bbva.evalua.spring5.logica;

public interface CI0202v01ServicioMultiplica {
	public CI0201v01ServicioSumar getServiceA();
	public void setServiceA(CI0201v01ServicioSumar servicioSumar);
	
	public int multiplicarSumar(int a, int b, int multiplicador);
	
	public int multiplicar(int a, int b);
	
}
