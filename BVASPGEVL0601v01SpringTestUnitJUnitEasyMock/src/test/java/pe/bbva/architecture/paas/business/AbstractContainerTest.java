package pe.bbva.architecture.paas.business;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pe.bbva.architecture.business.CIContainer;
import pe.bbva.architecture.business.impl.CMNotEnoughException;
import pe.bbva.architecture.controller.CCWaterContainer;
import pe.bbva.architecture.entity.CEPortion;

public class AbstractContainerTest {
    CIContainer waterContainer;
    private final static int VOLUME = 10;
 
    @Before
    public void beforeTest() {
        waterContainer = new CCWaterContainer(VOLUME);
    }
 
    @After
    public void afterTest() {
        waterContainer = null;
    }
 
    @Test(expected = IllegalArgumentException.class)
    public void testAbstractContainer() {
        waterContainer = new CCWaterContainer(0);
    }
 
    @Test
    public void testGetPortion() throws CMNotEnoughException {
        int expCurVolume = VOLUME;
 
        waterContainer.getPortion(CEPortion.SMALL);
        expCurVolume -= CEPortion.SMALL.size();
        assertEquals("Calculation for the SMALL portion is incorrect",
                expCurVolume, waterContainer.getCurrentVolume());
 
        waterContainer.getPortion(CEPortion.MEDIUM);
        expCurVolume -= CEPortion.MEDIUM.size();
        assertEquals("Calculation for the MEDIUM portion is incorrect",
                expCurVolume, waterContainer.getCurrentVolume());
 
        waterContainer.getPortion(CEPortion.LARGE);
        expCurVolume -= CEPortion.LARGE.size();
        assertEquals("Calculation for the LARGE portion is incorrect",
                expCurVolume, waterContainer.getCurrentVolume());
 
    }
 
    @Test(expected = CMNotEnoughException.class)
    public void testNotEnoughException() throws CMNotEnoughException {
        waterContainer.getPortion(CEPortion.LARGE);
        waterContainer.getPortion(CEPortion.LARGE);
        waterContainer.getPortion(CEPortion.LARGE);
        waterContainer.getPortion(CEPortion.LARGE);
    }
 
    @Test
    public void testGetCurrentVolume() {
        assertEquals("Current volume has incorrect value.", VOLUME,
                waterContainer.getCurrentVolume());
    }
 
    @Test
    public void testGetTotalVolume() {
        assertEquals("Total volume has incorrect value.", VOLUME,
                waterContainer.getTotalVolume());
    }
 
    @Test
    public void testRefillContainer() throws CMNotEnoughException {
        waterContainer.getPortion(CEPortion.SMALL);
        waterContainer.refillContainer();
        assertEquals("Refill functionality works incorectly.", VOLUME,
                waterContainer.getCurrentVolume());
    }
}
