package pe.etg.bbva.spring.controller.sesion01;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import pe.etg.bbva.spring.component.sesion01.CCGreetingService;

public class CCGreetingController {
    private final CCGreetingService greetingService;

    @Autowired
    public CCGreetingController(CCGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/hello")
    public ResponseEntity sayHello() {
        return ResponseEntity.ok(greetingService.helloWorld());
    }
}
