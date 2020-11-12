package pe.unjfsc.daw.spring5.logical.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import pe.unjfsc.daw.spring5.logical.CITarifa;

//@Service("servicioImpuestos")
public class CMTarifa implements CITarifa {

	@Value("#{impuestos.igv}")
	private int igv;
	
	@Value("#{new Integer(impuestos.retencion)+3}")
	private int retencion;

	@Override
	public int importeImpuestoVentas() {
		// TODO Auto-generated method stub
		return igv;
	}

	@Override
	public int importeRetencion() {
		// TODO Auto-generated method stub
		return retencion;
	}

	public int getIgv() {
		return igv;
	}

	public void setIgv(int igv) {
		this.igv = igv;
	}

	public int getRetencion() {
		return retencion;
	}

	public void setRetencion(int retencion) {
		this.retencion = retencion;
	}

}
