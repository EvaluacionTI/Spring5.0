package pe.etg.bbva.evalua.spring5.entity;

public class CEContacto {
	private String email;
	private String nickEmail;
	private String celular;
	private String urlLinkedIn;
	private String nickLinkedIn;
	private String urlGitHub;
	private String nickGitHub;
	private String urlTwitter;
	private String nickTwitter;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickEmail() {
		return nickEmail;
	}
	public void setNickEmail(String nickEmail) {
		this.nickEmail = nickEmail;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getUrlLinkedIn() {
		return urlLinkedIn;
	}
	public void setUrlLinkedIn(String urlLinkedIn) {
		this.urlLinkedIn = urlLinkedIn;
	}
	public String getNickLinkedIn() {
		return nickLinkedIn;
	}
	public void setNickLinkedIn(String nickLinkedIn) {
		this.nickLinkedIn = nickLinkedIn;
	}
	public String getUrlGitHub() {
		return urlGitHub;
	}
	public void setUrlGitHub(String urlGitHub) {
		this.urlGitHub = urlGitHub;
	}
	public String getNickGitHub() {
		return nickGitHub;
	}
	public void setNickGitHub(String nickGitHub) {
		this.nickGitHub = nickGitHub;
	}
	public String getUrlTwitter() {
		return urlTwitter;
	}
	public void setUrlTwitter(String urlTwitter) {
		this.urlTwitter = urlTwitter;
	}
	public String getNickTwitter() {
		return nickTwitter;
	}
	public void setNickTwitter(String nickTwitter) {
		this.nickTwitter = nickTwitter;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEContacto [email=");
		builder.append(email);
		builder.append(", nickEmail=");
		builder.append(nickEmail);
		builder.append(", celular=");
		builder.append(celular);
		builder.append(", urlLinkedIn=");
		builder.append(urlLinkedIn);
		builder.append(", nickLinkedIn=");
		builder.append(nickLinkedIn);
		builder.append(", urlGitHub=");
		builder.append(urlGitHub);
		builder.append(", nickGitHub=");
		builder.append(nickGitHub);
		builder.append(", urlTwitter=");
		builder.append(urlTwitter);
		builder.append(", nickTwitter=");
		builder.append(nickTwitter);
		builder.append("]");
		return builder.toString();
	}
	
	
}
