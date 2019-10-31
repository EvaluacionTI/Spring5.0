package pe.etg.bbva.spring.business;

import pe.etg.bbva.spring.business.impl.CMNotEnoughException;
import pe.etg.bbva.spring.entity.CEPortion;

public interface CIContainer {
	public boolean getPortion(CEPortion portion) throws CMNotEnoughException;
    public int getCurrentVolume();
    public int getTotalVolume();
    public void refillContainer();
}
