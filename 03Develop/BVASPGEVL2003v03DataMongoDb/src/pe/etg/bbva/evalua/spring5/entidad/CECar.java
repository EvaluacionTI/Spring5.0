package pe.etg.bbva.evalua.spring5.entidad;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="DESt04_vehiculo")
public class CECar {
	@Id
	private String id;
	private String brand;
	private String model;

	public CECar(String psBrand, String psModel) {
		super();
		this.brand = psBrand;
		this.model = psModel;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	@Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Id:- " + getId() + ", Brand:- " + getBrand() + ", Model:- " + getModel());
        return str.toString();
    }	
}
