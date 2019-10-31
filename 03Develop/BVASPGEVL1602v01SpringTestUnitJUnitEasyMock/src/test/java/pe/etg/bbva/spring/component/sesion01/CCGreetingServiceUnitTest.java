package pe.etg.bbva.spring.component.sesion01;


import org.junit.Assert;
import org.junit.Test;

public class CCGreetingServiceUnitTest {
    private CCGreetingService greetingService = new CCGreetingService();

    @Test
    public void testItShouldSayHolaMundo() {
        Assert.assertEquals("Hola Mundo", greetingService.helloWorld());
    }
}
