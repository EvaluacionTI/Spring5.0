package pe.etg.bbva.evalua.spring5.controller.rest;

import java.net.URI;
import java.util.Collection;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import pe.etg.bbva.evalua.spring5.entity.CEStudent;
import pe.etg.bbva.evalua.spring5.model.CMStudentRepository;

@RestController
@RequestMapping("/students")
public class CCStudentController {
	private static final Logger MOLOG = LoggerFactory.getLogger(CCStudentController.class);
	
	private CMStudentRepository oCRrepository = null;
	
	/*
	 * 1. INYECTAR EL REPOSITORIO : Esta se realiza en modo constructor
	 */
	@Autowired
	public CCStudentController(CMStudentRepository poCRrepository) {
		MOLOG.info("=====> [CCStudentController] Start method : CCStudentController(CMStudentRepository poCRrepository) <===== ");
		
		MOLOG.info("=> CMStudentRepository : {} ", poCRrepository);
		
		this.oCRrepository = poCRrepository;
		MOLOG.info("=====> [CCStudentController] End method : CCStudentController(CMStudentRepository poCRrepository) <===== ");
	}
	
	/*
	 * 2. CLASE DE EXCEPCION PERSONALIZADA
	*     Para manejar casos donde no se encuentra el estudiante
	 * 	  Agregamos una @ResponseStatus(HttpStatus.NOT_FOUND) anotación a la clase para que la excepción devuelva un código de estado 404 No encontrado
	 * 	  en la respuesta
	 */
	@SuppressWarnings("serial")
	@ResponseStatus(HttpStatus.NOT_FOUND)
	class StudentNotFoundException extends RuntimeException{
		public StudentNotFoundException() {
			super("Student does not exist");
		}
	}
	
	/*
	 * 3. OPERACION DE LECTURA 
	 * 		
	 * @GetMappinges un RequestMapping especializado. 
	 * Especifica que las solicitudes HTTP GET a / estudiantes se asignan al readStudents() método.
	 */
	@GetMapping
	public Collection<CEStudent> readStudents(){
		MOLOG.info("=====> [CCStudentController] Start method : readStudents() <===== ");
		
		MOLOG.info("=> Collection<CEStudent> : {} ", oCRrepository);
		
		MOLOG.info("=====> [CCStudentController] End method : readStudents() <===== ");
		return this.oCRrepository.findAll();
		
	}
	
	/*
	 *  @GetMapping("/{id}"especifica que las solicitudes HTTP GET a /students/"{/id}"se asignan al readStudent() método.
	 * 	El token {/ id} en la ruta es una variable de ruta. Usamos @PathVariablepara enlazar la variable de ruta "id" al parámetro de métodoLong id.
	 * 	Entonces, ¿cuál es este orElseThrowmétodo al final de la llamada findById y qué hace? Es parte de la java.util.OptionalAPI.
	 * 	Devuelve el objeto Student envuelto si está presente, de lo contrario arroja la excepción proporcionada por el proveedor de excepción
	 */
	@GetMapping("/{id}")
//	public CEStudent readStudent(@PathVariable Long pId) { -- Con esto se visualiza un error del tipo de dato
	public CEStudent readStudent(@PathVariable("id") Long pId) {
		MOLOG.info("=====> [CCStudentController] Start method : readStudent(@PathVariable Long pId) <===== ");
		
		MOLOG.info("=> @PathVariable Long pId) : {} ", pId);
		
		MOLOG.info("=====> [CCStudentController] End method : readStudent(@PathVariable Long pId) <===== ");
		return this.oCRrepository.findById(pId).orElseThrow(StudentNotFoundException::new);
	}
	
	/*
	 * 4. OPERACION CREAR
	 * 	  Podemos implementar esto devolviendo un objeto ResponseEntity. 
	 *    @PostMappinges una especializada RequestMapping. 
	 *    Especifica que las solicitudes HTTP POST a / students deben mapearse al addStudent() método.
	 *    
	 *    ResponseEntity encapsula una respuesta HTTP y nos permite configurar el encabezado, el código de estado y el cuerpo.
	 */
	@PostMapping
	ResponseEntity<?> addStudent(@RequestBody CEStudent student){
		MOLOG.info("=====> [CCStudentController] Start method : addStudent(@RequestBody CEStudent student) <===== ");
		
		CEStudent result = this.oCRrepository.save(student);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(result.getId())
				.toUri();

		MOLOG.info("=> CEStudent : {} ", result);
		MOLOG.info("=> URI : {} ", location);
		
		MOLOG.info("=====> [CCStudentController] End method : addStudent(@RequestBody CEStudent student) <===== ");
		
		return ResponseEntity.created(location).build();		
	}
	
	/*
	 * 5. OPERACION ACTUALIZACION
	 * 
	 * @PutMappinges un RequestMapping especializado. 
	 * Especifica que las solicitudes HTTP PUT a /students están asignadas al updateStudent()método.
	 * 
	 */
	@PutMapping
	CEStudent updateStudent(@RequestBody CEStudent student) {
		MOLOG.info("=====> [CCStudentController] Start method : addStudent(@RequestBody CEStudent student) <===== ");
		
		MOLOG.info("=> @RequestBody CEStudent student : {} ", student);
		
		MOLOG.info("=====> [CCStudentController] Start method : addStudent(@RequestBody CEStudent student) <===== ");
		return this.oCRrepository.update(student)
				.orElseThrow(StudentNotFoundException::new);
	}
	
	/*
	 * 6. OPERACION ELIMINAR
	 * @DeleteMapping("/{id}" especifica que las solicitudes HTTP DELETE a /students/"{/id}" se asignan al deleteStudent() método
	 */
	@DeleteMapping("/{id}")
	void deleteStudent(@PathVariable Long id) {
		MOLOG.info("=====> [CCStudentController] Start method : deleteStudent(@PathVariable Long id) <===== ");
		
		MOLOG.info("=> @PathVariable Long id : {} ", id);

		MOLOG.info("=====> [CCStudentController] Start method : deleteStudent(@PathVariable Long id) <===== ");
		
		this.oCRrepository.delete(id)
			.orElseThrow(StudentNotFoundException::new);
	}	
	
	
}
