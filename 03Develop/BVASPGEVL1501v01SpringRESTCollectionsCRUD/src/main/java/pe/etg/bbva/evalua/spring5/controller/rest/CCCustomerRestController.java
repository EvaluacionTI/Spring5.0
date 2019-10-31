package pe.etg.bbva.evalua.spring5.controller.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.etg.bbva.evalua.spring5.entity.CECustomer;
import pe.etg.bbva.evalua.spring5.model.CDCustomerCollection;

@RestController
public class CCCustomerRestController {
	private static final Logger MOLOG = LoggerFactory.getLogger(CCCustomerRestController.class);
	
	@Autowired
	private CDCustomerCollection customerDAO;

	@GetMapping("/customers")
	public List<?> getCustomers() {
		
		MOLOG.info(" CDCustomerCollection : {}", customerDAO);
		
		return customerDAO.list();
	}

	@GetMapping("/customers/{id}")
	public ResponseEntity<CECustomer> getCustomer(@PathVariable("id") Long id) {
		
		CECustomer customer = customerDAO.get(id);
		if (customer == null) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}
		
		MOLOG.info("[EVL]  CECustomer : {} ", customer);
		
		return new ResponseEntity<CECustomer>(customer, HttpStatus.OK);
	}

	@PostMapping(value = "/customers")
	public ResponseEntity<CECustomer> createCustomer(@RequestBody CECustomer customer) {

		customerDAO.create(customer);
		MOLOG.info("[EVL]  CECustomer : {} ", customer);
		
		return new ResponseEntity<CECustomer>(customer, HttpStatus.OK);
	}

	@PutMapping("/customers/{id}")
	public ResponseEntity<CECustomer> updateCustomer(@PathVariable Long id, @RequestBody CECustomer customer) {

		customer = customerDAO.update(id, customer);

		MOLOG.info("[EVL] CECustomer : {}", customer);
		
		if (null == customer) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<CECustomer>(customer, HttpStatus.OK);
	}

	@DeleteMapping("/customers/{id}")
	public ResponseEntity<Long> deleteCustomer(@PathVariable Long id) {
	
		if (null == customerDAO.delete(id)) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Long>(id, HttpStatus.OK);
	}	
}
