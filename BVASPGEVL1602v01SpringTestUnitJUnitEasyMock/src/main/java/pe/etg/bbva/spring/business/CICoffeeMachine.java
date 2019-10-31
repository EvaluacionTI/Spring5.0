package pe.etg.bbva.spring.business;

import pe.etg.bbva.evalua.spring5.entity.CEPortion;
import pe.etg.bbva.spring.business.impl.CMNotEnoughException;

public interface CICoffeeMachine {
	public boolean makeCoffee(CEPortion portion) throws CMNotEnoughException;
    public CIContainer getCoffeeContainer();
    public CIContainer getWaterContainer();
}
