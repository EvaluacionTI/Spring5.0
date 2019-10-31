package pe.etg.bbva.spring.business.impl;

import pe.etg.bbva.evalua.spring5.entity.CEPortion;
import pe.etg.bbva.spring.business.CICoffeeMachine;
import pe.etg.bbva.spring.business.CIContainer;

public class CMCoffeeMachine implements CICoffeeMachine{

	private CIContainer coffeeContainer;
    private CIContainer waterContainer;
    
    public CMCoffeeMachine(CIContainer cContainer, CIContainer wContainer) {
        coffeeContainer = cContainer;
        waterContainer = wContainer;
    }
    
	@Override
	public boolean makeCoffee(CEPortion portion) throws CMNotEnoughException {
		boolean isEnoughCoffee = coffeeContainer.getPortion(portion);
        boolean isEnoughWater = waterContainer.getPortion(portion);
         
        if (isEnoughCoffee && isEnoughWater) {
            return true;
        } else {
            return false;
        }
	}

	@Override
	public CIContainer getCoffeeContainer() {
		return coffeeContainer;
	}

	@Override
	public CIContainer getWaterContainer() {
		return waterContainer;
	}
	

}
