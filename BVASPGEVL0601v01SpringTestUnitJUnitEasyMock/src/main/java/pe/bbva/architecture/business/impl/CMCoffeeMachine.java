package pe.bbva.architecture.business.impl;

import pe.bbva.architecture.business.CICoffeeMachine;
import pe.bbva.architecture.business.CIContainer;
import pe.bbva.architecture.entity.CEPortion;

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
