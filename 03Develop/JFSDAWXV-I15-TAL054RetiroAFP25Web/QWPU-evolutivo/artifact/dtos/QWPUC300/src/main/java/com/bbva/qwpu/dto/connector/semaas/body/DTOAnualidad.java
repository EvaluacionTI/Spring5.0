package com.bbva.qwpu.dto.connector.semaas.body;

import com.bbva.qwpu.dto.connector.Entity;

public class DTOAnualidad extends Entity {
    private double tasaEfectivAnual;
    private double plazoDias;
    private double capital;

    public double getTasaEfectivAnual() {
        return tasaEfectivAnual;
    }

    public void setTasaEfectivAnual(double tasaEfectivAnual) {
        this.tasaEfectivAnual = tasaEfectivAnual;
    }

    public double getPlazoDias() {
        return plazoDias;
    }

    public void setPlazoDias(double plazoDias) {
        this.plazoDias = plazoDias;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CEAnualidad{");
        sb.append("tasaEfectivAnual=").append(tasaEfectivAnual);
        sb.append(", plazoDias=").append(plazoDias);
        sb.append(", capital=").append(capital);
        sb.append('}');
        return sb.toString();
    }
}
