package pe.bbva.evalua.spring5.entity;

public class CE01Afiliado {
	public int id;
	public String nameAfiliado;
	public String codeAfiliado;

	public CE01Afiliado(int pId) {
		this.id = pId;
	}

	public CE01Afiliado(int pId, String pNameAfiliado) {
		this.id = pId;
		this.nameAfiliado = pNameAfiliado;
	}

	public CE01Afiliado(int pId, String pNameAfiliado, String pCodeAfiliado) {
		this.id = pId;
		this.nameAfiliado = pNameAfiliado;
		this.codeAfiliado = pCodeAfiliado;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CE01Afiliado [id=");
		builder.append(id);
		builder.append(", nameAfiliado=");
		builder.append(nameAfiliado);
		builder.append(", codeAfiliado=");
		builder.append(codeAfiliado);
		builder.append("]");
		return builder.toString();
	}


}
