package pe.etg.bbva.spring.business;

import pe.etg.bbva.spring.business.impl.CMNotEnoughException;
import pe.etg.bbva.spring.entity.CEPortion;

public interface CICoffeeMachine {
	public boolean makeCoffee(CEPortion portion) throws CMNotEnoughException;
    public CIContainer getCoffeeContainer();
    public CIContainer getWaterContainer();
}
