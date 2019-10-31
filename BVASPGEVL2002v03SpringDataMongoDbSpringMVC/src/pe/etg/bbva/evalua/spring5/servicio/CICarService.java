package pe.etg.bbva.evalua.spring5.servicio;

import java.util.List;

import pe.etg.bbva.evalua.spring5.entidad.CECar;

public interface CICarService {
	public void create(CECar car);
	public void update(CECar car);
    public void delete(CECar car);
    public void deleteAll();
    public CECar find(CECar car);
    public List < CECar > findByBrand(String brand);
    public CECar findByModel(String model);
    public List < CECar > findAll();	
}
