package pe.unjfsc.daw.spring.entidad;

import org.springframework.beans.factory.annotation.Value;

public class CECurso {
	
	private Long id;
	
	@Value("4059")
	private String codigo;
	
	@Value("Desarrollo de Aplicaciones Web")
	private String curso;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CECurso [id=").append(id).append(", codigo=").append(codigo).append(", curso=").append(curso)
				.append("]");
		return builder.toString();
	}
}
