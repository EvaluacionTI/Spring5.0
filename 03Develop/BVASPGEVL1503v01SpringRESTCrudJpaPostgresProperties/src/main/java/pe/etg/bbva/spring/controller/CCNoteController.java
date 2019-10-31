package pe.etg.bbva.spring.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.etg.bbva.spring.entity.CECustomerAuto;
import pe.etg.bbva.spring.entity.CENoteIdentity;
import pe.etg.bbva.spring.model.CDNote;

@RestController
@RequestMapping("/api")
public class CCNoteController {
	private static final Logger MOLOG = LoggerFactory.getLogger(CCNoteController.class);
	
	@Autowired
	private CDNote oCDNote;
	
	@RequestMapping("/")
	public String getRevisionRest() {
		MOLOG.info("[EVL] =====> Stard method getRevisionRest() <=====");
		
		String sMensaje = "Accesando a Spring Rest";
		
		MOLOG.info("[EVL] => Mensaje : {} ", sMensaje);
		
		MOLOG.info("[EVL] => Intanciando Service : {} ", oCDNote);
		
		MOLOG.info("[EVL] =====> End method getRevisionRest() <=====");
		
		return sMensaje; 
	}
	
	@GetMapping("/notes")
	public List<CENoteIdentity> getAllNotes(){
		MOLOG.info("[EVL] =====> Start method : getAllNotes() <===== ");
		
		List<CENoteIdentity> oaListNote = oCDNote.findAll();
		MOLOG.debug("[EVL] => : {}", oaListNote);
		
		MOLOG.info("[EVL] =====> ENd method : getAllNotes() <===== ");
		return oaListNote;
	}

	@RequestMapping("/grabar")
	public String grabarCustormer() {
		oCDNote.save(new CENoteIdentity("A","B"));
		return "Done";
	}
	
/*	
	@GetMapping("/notes/{id}")
	public CENote getOneById(@PathVariable(value="id") Long noteId) {
		MOLOG.info("[EVL] =====> Start method : getOneById(@PathVariable(value=\"id\") Long noteId) <===== ");
		MOLOG.info("[EVL] => : Id {}", noteId);
		MOLOG.info("[EVL] =====> End method : getOneById(@PathVariable(value=\"id\") Long noteId) <===== ");
		return oNoteRepository.findById(noteId).orElseThrow(()->new ResourceNotFoundException("Note", "id", noteId));
	}
	
	@PostMapping("/notes")
	public CENote createNote(@Valid @RequestBody CENote poCENote) {
		MOLOG.info("[EVL] =====> Start method : createNote(@Valid @RequestBody CENote poCENote) <===== ");
		MOLOG.info("[EVL] => : Note {}", poCENote.toString());
		MOLOG.info("[EVL] =====> End method : createNote(@Valid @RequestBody CENote poCENote) <===== ");
		return oNoteRepository.save(poCENote);
	}
	
	@PutMapping("/notes/{id}")
	public CENote updateNote(@PathVariable(value="id") Long noteId, @Valid @RequestBody CENote poCENote) {
		MOLOG.info("[EVL] =====> Start method : updateNote(@PathVariable(value=\"id\") Long noteId, @Valid @RequestBody CENote poCENote) <===== ");
		
		CENote oCENote = oNoteRepository.findById(noteId).orElseThrow(()->new ResourceNotFoundException("Note", "id", noteId));
		
		oCENote.setTitle(poCENote.getTitle());
		oCENote.setContent(poCENote.getContent());
		
		CENote oCENoteUpdate = oNoteRepository.save(oCENote);
		MOLOG.info("[EVL] => : Id {}", noteId);
		MOLOG.info("[EVL] => : Note {}", poCENote.toString());
		MOLOG.info("[EVL] => : Note Update {}", oCENoteUpdate.toString());

		MOLOG.info("[EVL] =====> End method : updateNote(@PathVariable(value=\"id\") Long noteId, @Valid @RequestBody CENote poCENote) <===== ");
		return oCENoteUpdate; 
	}
	
	@DeleteMapping("/notes/{id}")
	public ResponseEntity<?> deleteNote(@PathVariable(value="id") Long noteId){
		MOLOG.info("[EVL] =====> Start method : deleteNote(@PathVariable(value=\"id\") Long noteId) <===== ");
		CENote oCENote = oNoteRepository.findById(noteId).orElseThrow(()->new ResourceNotFoundException("Note", "id", noteId));
		
		MOLOG.info("[EVL] => : Id {}", noteId);
		MOLOG.info("[EVL] => : Note {}", oCENote.toString());

		oNoteRepository.delete(oCENote);
		
		MOLOG.info("[EVL] =====> End method : deleteNote(@PathVariable(value=\"id\") Long noteId) <===== ");
		return ResponseEntity.ok().build();
	}*/
}
