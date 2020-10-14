package pe.unjfsc.daw.spring5.entity;

public class CEEntity {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEEntity [id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
}
