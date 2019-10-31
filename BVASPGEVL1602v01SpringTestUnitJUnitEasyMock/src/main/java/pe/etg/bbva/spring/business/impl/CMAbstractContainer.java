package pe.etg.bbva.spring.business.impl;

import pe.etg.bbva.evalua.spring5.entity.CEPortion;
import pe.etg.bbva.spring.business.CIContainer;

public abstract class CMAbstractContainer implements CIContainer{
	private int containerTotalVolume;
    private int currentVolume;

    public CMAbstractContainer(int volume) {
        if (volume < 1)
            throw new IllegalArgumentException("Container's value must be greater then 0.");
        containerTotalVolume = volume;
        currentVolume = volume;
    }
 
    @Override
    public boolean getPortion(CEPortion portion) throws CMNotEnoughException {
        int delta = currentVolume - portion.size();
        if (delta > -1) {
            currentVolume -= portion.size();
            return true;
        } else
            throw new CMNotEnoughException("Refill the "
                    + this.getClass().getName());
    }
 
    @Override
    public int getCurrentVolume() {
        return currentVolume;
    }
 
    @Override
    public int getTotalVolume() {
        return containerTotalVolume;
    }
 
    @Override
    public void refillContainer() {
        currentVolume = containerTotalVolume;
    }    
}
