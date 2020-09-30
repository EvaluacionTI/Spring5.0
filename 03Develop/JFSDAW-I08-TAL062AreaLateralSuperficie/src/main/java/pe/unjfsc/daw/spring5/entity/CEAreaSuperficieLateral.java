
package pe.unjfsc.daw.spring5.entity;

public class CEAreaSuperficieLateral {
    private double radio;
    private String radioLetra;
    private double altura;
    private double lsa;

    private double diametro;
    private String diametroLetra;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getRadioLetra() {
        return radioLetra;
    }

    public void setRadioLetra(String radioLetra) {
        this.radioLetra = radioLetra;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLsa() {
        return lsa;
    }

    public void setLsa(double lsa) {
        this.lsa = lsa;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public String getDiametroLetra() {
        return diametroLetra;
    }

    public void setDiametroLetra(String diametroLetra) {
        this.diametroLetra = diametroLetra;
    }

    @Override
    public String toString() {
        return "CEAreaSuperficieLateral{" + "radio=" + radio + ", radioLetra=" + radioLetra + ", altura=" + altura + ", lsa=" + lsa + ", diametro=" + diametro + ", diametroLetra=" + diametroLetra + '}';
    }
    
}
