package pe.unjfsc.daw.spring5.entity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("idCEAfiliadoListMap")
public class CEAfiliadoListMap {
	
	@Value("#{idCEListMap.map['afiliado1']}")
	private String afiliado;
	
	@Value("#{idCEListMap.list[0]}")
	private String lista;
	
	@Value("#{'250' matches '\\d+'}")
	private boolean validarNumero;

	public String getAfiliado() {
		return afiliado;
	}

	public void setAfiliado(String afiliado) {
		this.afiliado = afiliado;
	}

	public String getLista() {
		return lista;
	}

	public void setLista(String lista) {
		this.lista = lista;
	}

	public boolean isValidarNumero() {
		return validarNumero;
	}

	public void setValidarNumero(boolean validarNumero) {
		this.validarNumero = validarNumero;
	}
}
