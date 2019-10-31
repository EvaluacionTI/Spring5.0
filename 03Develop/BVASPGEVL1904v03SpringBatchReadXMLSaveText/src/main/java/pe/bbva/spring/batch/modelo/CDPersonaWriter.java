package pe.bbva.spring.batch.modelo;

import javax.sql.DataSource;

import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.etg.bbva.evalua.spring5.entity.CEDESt02NuevaPersona;

@Component
public class CDPersonaWriter extends JdbcBatchItemWriter<CEDESt02NuevaPersona>{
	private String sComandoSQL = "INSERT INTO DESt01_persona (NOM_APE, SEXO) VALUES (:nombreApellido, :sexo)";
	
	@Autowired
	public CDPersonaWriter(DataSource poDS) {
		this.setDataSource(poDS);
		this.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>());
		this.setSql(sComandoSQL);
	}

}
