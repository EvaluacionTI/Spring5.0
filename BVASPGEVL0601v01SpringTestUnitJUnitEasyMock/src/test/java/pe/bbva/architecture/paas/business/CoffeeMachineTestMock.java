package pe.bbva.architecture.paas.business;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import pe.bbva.architecture.business.CICoffeeMachine;
import pe.bbva.architecture.business.CIContainer;
import pe.bbva.architecture.business.impl.CMCoffeeMachine;
import pe.bbva.architecture.business.impl.CMNotEnoughException;
import pe.bbva.architecture.entity.CEPortion;

@RunWith(MockitoJUnitRunner.class)
public class CoffeeMachineTestMock {
    CICoffeeMachine coffeeMachine;
    
    @Mock
    CIContainer coffeeContainer;
    @Mock
    CIContainer waterContainer;
 
    @Before
    public void setUp() {
        coffeeMachine = new CMCoffeeMachine(coffeeContainer, waterContainer);
    }
 
    @After
    public void tearDown() {
        coffeeContainer = null;
        waterContainer = null;
        coffeeMachine = null;       
    }
 
    @Test
    public void testMakeCoffe() throws CMNotEnoughException {
         
        when(coffeeContainer.getPortion(CEPortion.LARGE)).thenReturn(true);
        when(waterContainer.getPortion(CEPortion.LARGE)).thenReturn(true);
         
        assertTrue(coffeeMachine.makeCoffee(CEPortion.LARGE));
    }
     
    @Test
    public void testNotEnoughException() throws CMNotEnoughException {
         
        when(coffeeContainer.getPortion(CEPortion.SMALL)).thenReturn(false);
        when(waterContainer.getPortion(CEPortion.SMALL)).thenReturn(true);
 
        assertFalse(coffeeMachine.makeCoffee(CEPortion.SMALL));
         
    }
}
