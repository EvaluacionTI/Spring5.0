package pe.bbva.architecture.business;

import pe.bbva.architecture.business.impl.CMNotEnoughException;
import pe.bbva.architecture.entity.CEPortion;

public interface CICoffeeMachine {
	public boolean makeCoffee(CEPortion portion) throws CMNotEnoughException;
    public CIContainer getCoffeeContainer();
    public CIContainer getWaterContainer();
}
