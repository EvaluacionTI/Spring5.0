package pe.etg.bbva.evalua.spring5.controller;

import org.apache.coyote.http2.HpackEncoder.State;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.etg.bbva.evalua.spring5.entity.CEContacto;
import pe.etg.bbva.evalua.spring5.utility.CUGeneraHilo;

@RestController
@CrossOrigin
@RequestMapping("v0")
public class CC03AwsMitoCode {
	@GetMapping(value="status")
	String checkStatus() {
		return "ok";
	}
	
	@GetMapping(value="info")
	CEContacto getInfo() {
		long inicio=System.currentTimeMillis();
		
		CEContacto contacto = new CEContacto();
		
		contacto.setEmail("adiaz08@gmail.com");
		contacto.setNickEmail("adiaz08");
		contacto.setCelular("98494");
		contacto.setUrlLinkedIn("https://www.linkedin.com/in/adiaz08/");
		contacto.setNickLinkedIn("linkedin.com/in/adiaz08");
		contacto.setUrlGitHub("https://www.github.com/in/adiaz08/");
		contacto.setNickGitHub("github.com/in/adiaz08");
		contacto.setUrlTwitter("https://www.twitter.com/in/adiaz08/");
		contacto.setNickTwitter("twitter.com/in/adiaz08");
		
		CUGeneraHilo hilo = new CUGeneraHilo();
		hilo.start();
		
		while(true) {
			if (hilo.getState().equals(State.COMPLETE)) {
				break;
			}
		}
		
		System.out.println("Fin : " + (System.currentTimeMillis()-inicio) + "ms");
		return contacto;
	}
}
