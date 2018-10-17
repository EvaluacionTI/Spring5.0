package pe.bbva.spring.batch.dto;

import java.math.BigDecimal;
import java.util.Date;

public class Report{
    private int id;
    private BigDecimal precio;
    private int cantidad;
    private String nombre;
    private Date fechaNacimiento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Report{");
        sb.append("id=").append(id);
        sb.append(", precio=").append(precio);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append('}');
        return sb.toString();
    }
}





