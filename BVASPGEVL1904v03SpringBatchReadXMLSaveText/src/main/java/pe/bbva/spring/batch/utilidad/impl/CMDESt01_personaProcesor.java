package pe.bbva.spring.batch.utilidad.impl;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import pe.etg.bbva.evalua.spring5.entity.CEDESt01Persona;
import pe.etg.bbva.evalua.spring5.entity.CEDESt02NuevaPersona;


@Component
public class CMDESt01_personaProcesor implements ItemProcessor<CEDESt01Persona, CEDESt02NuevaPersona> {
	
	@Override
	public CEDESt02NuevaPersona process(CEDESt01Persona oCEPersona) {
		CEDESt02NuevaPersona oCENewPersona = new CEDESt02NuevaPersona();
		
		String sNombreApellido = oCEPersona.getNombre() + " " + oCEPersona.getApellido();
		char cSexo = oCEPersona.getSexo().equalsIgnoreCase("male") ? 'M' : oCEPersona.getSexo().equalsIgnoreCase("femela") ? 'F':'U';
		
		oCENewPersona.setNombreApellido(sNombreApellido);
		oCENewPersona.setSexo(cSexo);
		
		return oCENewPersona;
	}
}
