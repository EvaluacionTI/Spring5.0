package pe.etg.bbva.evalua.spring5.vista;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import pe.etg.bbva.evalua.spring5.entidad.CECar;
import pe.etg.bbva.evalua.spring5.servicio.CICarService;

public class CV0201v01MongoRepository {

	public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(CV0201v01MongoRepository.class);
        CICarService carService = (CICarService) context.getBean("carService");
        // Delete All cars
        carService.deleteAll();
 
        CECar polo = new CECar("Volkswagen", "Polo");
        carService.create(polo);
 
        CECar jetta = new CECar("Volkswagen", "Jetta");
        carService.create(jetta);
 
        CECar swift = new CECar("Maruti Suzuki", "Swift");
        carService.create(swift);
 
        CECar ertiga = new CECar("Maruti Suzuki", "Ertiga");
        carService.create(ertiga);
 
        CECar i10 = new CECar("Hyundai", "i10");
        carService.create(i10);
 
        CECar i20 = new CECar("Hyundai", "i20");
        carService.create(i20);
 
        System.out.println("\nFind One:- " + carService.find(swift));
 
        System.out.println("\nFind All!!");
 
        List <CECar> cars = carService.findAll();
        for (CECar car: cars) {
            System.out.println(car);
        }
        System.out.println();
        carService.delete(swift);
 
        System.out.println();
        i10.setModel("i10 Nxt");
        carService.update(i10);
 
        System.out.println("\nFind By Brand = 'Volkswagen'");
        cars = carService.findByBrand("Volkswagen");
        for (CECar car: cars) {
            System.out.println(car);
        }
 
        System.out.println("\nFind By Model = 'Ertiga'");
        System.out.println(carService.findByModel("Ertiga"));
 
        System.out.println("\nFind All!!");
 
        cars = carService.findAll();
        for (CECar car: cars) {
            System.out.println(car);
        }
 
        context.close();

	}

}
