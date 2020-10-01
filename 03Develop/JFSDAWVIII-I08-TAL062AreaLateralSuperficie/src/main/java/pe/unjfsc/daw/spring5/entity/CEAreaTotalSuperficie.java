package pe.unjfsc.daw.spring5.entity;

public class CEAreaTotalSuperficie {
	private CEAreaSuperficieLateral oCELsa;
	private double tsa;
	private double ate;
	
	public CEAreaSuperficieLateral getoCELsa() {
		return oCELsa;
	}
	public void setoCELsa(CEAreaSuperficieLateral oCELsa) {
		this.oCELsa = oCELsa;
	}
	public double getTsa() {
		return tsa;
	}
	public void setTsa(double tsa) {
		this.tsa = tsa;
	}
	public double getAte() {
		return ate;
	}
	public void setAte(double ate) {
		this.ate = ate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEAreaTotalSuperficie [oCELsa=");
		builder.append(oCELsa);
		builder.append(", tsa=");
		builder.append(tsa);
		builder.append(", ate=");
		builder.append(ate);
		builder.append("]");
		return builder.toString();
	}
	
}
