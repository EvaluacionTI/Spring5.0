package pe.etg.bbva.spring.controller;

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

import pe.etg.bbva.spring.entity.CECustomer;
import pe.etg.bbva.spring.model.CDCustomerCollection;

@RestController
public class CCCustomerRestController {
	private static final Logger MOLOG = LoggerFactory.getLogger(CCCustomerRestController.class);
	
	@Autowired
	private CDCustomerCollection customerDAO;

	@GetMapping("/customers")
	public List<?> getCustomers() {
		MOLOG.info("=====> [CCCustomerRestController] Start method :getCustomers() <===== ");
		
		MOLOG.info("=> CDCustomerCollection : {}", customerDAO);
		
		MOLOG.info("=====> [CCCustomerRestController] End method : getCustomer(@PathVariable(\"id\") Long id) <===== ");
		return customerDAO.list();
	}

	@GetMapping("/customers/{id}")
	public ResponseEntity getCustomer(@PathVariable("id") Long id) {
		MOLOG.info("=====> [CCCustomerRestController] Start method : getCustomer(@PathVariable(\"id\") Long id) <===== ");
		
		CECustomer customer = customerDAO.get(id);
		if (customer == null) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}
		
		MOLOG.info("=> CECustomer : {} ", customer);
		
		MOLOG.info("=====> [CCCustomerRestController] End method : getCustomer(@PathVariable(\"id\") Long id) <===== ");
		
		return new ResponseEntity(customer, HttpStatus.OK);
	}

	@PostMapping(value = "/customers")
	public ResponseEntity createCustomer(@RequestBody CECustomer customer) {
		MOLOG.info("=====> [CCCustomerRestController] Start method : getCustomer(@PathVariable(\"id\") Long id) <===== ");
		customerDAO.create(customer);
		MOLOG.info("=> CECustomer : {} ", customer);
		
		MOLOG.info("=====> [CCCustomerRestController] Start method : getCustomer(@PathVariable(\"id\") Long id) <===== ");
		
		return new ResponseEntity(customer, HttpStatus.OK);
	}

	@DeleteMapping("/customers/{id}")
	public ResponseEntity deleteCustomer(@PathVariable Long id) {
		MOLOG.info("=====> [CCCustomerRestController] Start method : deleteCustomer(@PathVariable Long id) <===== ");
		
		if (null == customerDAO.delete(id)) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		MOLOG.info("=====> [CCCustomerRestController] End method : deleteCustomer(@PathVariable Long id) <===== ");
		return new ResponseEntity(id, HttpStatus.OK);
	}

	@PutMapping("/customers/{id}")
	public ResponseEntity updateCustomer(@PathVariable Long id, @RequestBody CECustomer customer) {
		MOLOG.info("=====> [CCCustomerRestController] Start method : updateCustomer(@PathVariable Long id, @RequestBody CECustomer customer) <===== ");
		customer = customerDAO.update(id, customer);

		MOLOG.info("=> CECustomer : {}", customer);
		
		if (null == customer) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}
		MOLOG.info("=====> [CCCustomerRestController] End method : updateCustomer(@PathVariable Long id, @RequestBody CECustomer customer) <===== ");
		
		return new ResponseEntity(customer, HttpStatus.OK);
	}	
}
