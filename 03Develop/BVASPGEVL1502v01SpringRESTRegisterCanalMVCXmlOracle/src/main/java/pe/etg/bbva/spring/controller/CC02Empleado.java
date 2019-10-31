package pe.etg.bbva.spring.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pe.etg.bbva.spring.entity.CE01Canal;
import pe.etg.bbva.spring.model.CD01Canal;

@Component
public class CC02Empleado {

	private static final Logger MOLOG = LoggerFactory.getLogger(CC02Empleado.class);
	
    @Autowired
	private CD01Canal oCDEmpleado;//will inject dao from xml file

    /*It displays a form to input data, here "command" is a reserved request attribute
     *which is used to display object data into form
     */
	@RequestMapping("/empform")
	public ModelAndView showform(){
		MOLOG.info("=====> Start method : setUp() <===== ");
		
		return new ModelAndView("empform","command",new CE01Canal());
	}
	/*It saves object into database. The @ModelAttribute puts request data
	 *  into model object. You need to mention RequestMethod.POST method 
	 *  because default request is GET*/
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp") CE01Canal emp){
		MOLOG.info("=====> Start method : setUp() <===== ");
		oCDEmpleado.grabaCanal(emp);
		return new ModelAndView("redirect:/viewemp");//will redirect to viewemp request mapping
	}
	/* It provides list of employees in model object */
	@RequestMapping("/viewemp")
	public ModelAndView viewemp(){
		List<CE01Canal> list=oCDEmpleado.getEmployees();
		return new ModelAndView("viewemp","list",list);
	}
	/* It displays object data into form for the given id. 
	 * The @PathVariable puts URL data into variable.*/
	@RequestMapping(value="/editemp/{id}")
	public ModelAndView edit(@PathVariable int id){
		CE01Canal emp=oCDEmpleado.getCanalById(id);
		return new ModelAndView("empeditform","command",emp);
	}
	/* It updates model object. */
	@RequestMapping(value="/editsave",method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("emp") CE01Canal emp){
		oCDEmpleado.actualizaCanal(emp);
		return new ModelAndView("redirect:/viewemp");
	}
	/* It deletes record for the given id in URL and redirects to /viewemp */
	@RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id){
		oCDEmpleado.eliminaCanal(id);
		return new ModelAndView("redirect:/viewemp");
	}    
}
