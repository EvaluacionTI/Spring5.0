package pe.etg.bbva.evalua.spring5.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.etg.bbva.evalua.spring5.entidad.CECar;
import pe.etg.bbva.evalua.spring5.repositorio.CICarRepositorio;
import pe.etg.bbva.evalua.spring5.servicio.CICarService;

@Service("carService")
public class CMCarServiceImpl implements CICarService{
	@Autowired
    CICarRepositorio carRepo;
	
	@Override
	public void create(CECar car) {
		CECar c = carRepo.insert(car);
        System.out.println("Created:- " + c);
		
	}

	@Override
	public void update(CECar car) {
		CECar c = carRepo.save(car);
        System.out.println("Updated:- " + c);
		
	}

	@Override
	public void delete(CECar car) {
		carRepo.delete(car);
        System.out.println("Deleted:- " + car.getId());
		
	}

	@Override
	public void deleteAll() {
		carRepo.deleteAll();
		
	}

	@Override
	public CECar find(CECar car) {
		 return carRepo.findOne(car.getId());
	}

	@Override
	public List<CECar> findByBrand(String brand) {
		 return carRepo.findByBrand(brand);
	}

	@Override
	public CECar findByModel(String model) {
		return carRepo.findByModel(model);
	}

	@Override
	public List<CECar> findAll() {
		return carRepo.findAll();
	}

}
