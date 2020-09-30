package pe.bbva.evalua.spring5.entity;

public class CE05AfiliadoAutowire {
	public int id;
	public String nameAfiliado;
	public String codeAfiliado;

	public CE0201Pais pais;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameAfiliado() {
		return nameAfiliado;
	}

	public void setNameAfiliado(String nameAfiliado) {
		this.nameAfiliado = nameAfiliado;
	}

	public String getCodeAfiliado() {
		return codeAfiliado;
	}

	public void setCodeAfiliado(String codeAfiliado) {
		this.codeAfiliado = codeAfiliado;
	}

	public CE0201Pais getPais() {
		return pais;
	}

	public void setPais(CE0201Pais pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CE05AfiliadoAutowire [id=");
		builder.append(id);
		builder.append(", nameAfiliado=");
		builder.append(nameAfiliado);
		builder.append(", codeAfiliado=");
		builder.append(codeAfiliado);
		builder.append(", pais=");
		builder.append(pais);
		builder.append("]");
		return builder.toString();
	}

}
