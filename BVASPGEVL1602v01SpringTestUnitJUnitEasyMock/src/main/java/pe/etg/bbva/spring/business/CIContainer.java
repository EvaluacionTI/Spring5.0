package pe.etg.bbva.spring.business;

import pe.etg.bbva.evalua.spring5.entity.CEPortion;
import pe.etg.bbva.spring.business.impl.CMNotEnoughException;

public interface CIContainer {
	public boolean getPortion(CEPortion portion) throws CMNotEnoughException;
    public int getCurrentVolume();
    public int getTotalVolume();
    public void refillContainer();
}
