package pe.bbva.architecture.business;

import pe.bbva.architecture.business.impl.CMNotEnoughException;
import pe.bbva.architecture.entity.CEPortion;

public interface CIContainer {
	public boolean getPortion(CEPortion portion) throws CMNotEnoughException;
    public int getCurrentVolume();
    public int getTotalVolume();
    public void refillContainer();
}
