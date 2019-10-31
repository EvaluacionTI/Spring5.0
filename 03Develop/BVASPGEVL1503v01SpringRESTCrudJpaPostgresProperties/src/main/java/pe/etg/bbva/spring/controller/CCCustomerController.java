package pe.etg.bbva.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.etg.bbva.spring.entity.CECustomerAuto;
import pe.etg.bbva.spring.model.CDCustomer;

@RestController
@RequestMapping("/customer")
public class CCCustomerController {

	@Autowired
	private CDCustomer oCDCustomer;
	
	@RequestMapping("/grabar")
	public String grabarCustormer() {
		oCDCustomer.save(new CECustomerAuto("A","B"));
		return "Done";
	}
}
