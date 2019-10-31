package pe.etg.bbva.spring.controller.sesion01;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import pe.etg.bbva.spring.component.sesion01.CCGreetingService;
import pe.etg.bbva.spring.controller.sesion01.CCGreetingController;

public class CCGreetingControllerUnitTest {
    private CCGreetingController controller;
    private CCGreetingService greetingService;

    @Before
    public void setUp() {
        greetingService = Mockito.mock(CCGreetingService.class);
        controller = new CCGreetingController(greetingService);
    }

    @Test
    public void TestItShouldReturnTheServiceValueWith200StatusCode() {
        Mockito.when(greetingService.helloWorld()).thenReturn("Saludos");
        ResponseEntity<String> httpResponse = controller.sayHello();

        Assert.assertEquals(httpResponse.getStatusCode(), HttpStatus.OK);
        Assert.assertEquals("Saludos", httpResponse.getBody());
    }
}
