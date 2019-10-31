package pe.bbva.spring.batch.modelo;

/*import org.slf4j.Logger;
import org.slf4j.LoggerFactory;*/
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import pe.etg.bbva.evalua.spring5.entity.CEDESt02NuevaPersona;

public class CDJobListener extends JobExecutionListenerSupport {
	//private static final Logger moLog = LoggerFactory.getLogger(CDJobListener.class);
	private JdbcTemplate oJdbcTemplate;
	private String sComandoSQL = "SELECT * FROM DESt01_persona ORDER BY sexo";
	
	@Autowired
	public CDJobListener(JdbcTemplate poJdbcTemplate) {
		this.oJdbcTemplate = poJdbcTemplate;
	}
	
	@Override
	public void afterJob(JobExecution poJobExecution) {
		BatchStatus status = poJobExecution.getStatus();
		//moLog.info("Job ha finalizado con status : ", status);
		
		if (status == BatchStatus.COMPLETED){
			oJdbcTemplate.query(sComandoSQL, (resultSet, i) -> {
				CEDESt02NuevaPersona person = new CEDESt02NuevaPersona();
                person.setNombreApellido(resultSet.getString("nombre"));
                person.setSexo(resultSet.getString("sexo").charAt(0));
             //   moLog.info("{}: {}", person.getNombreApellido(), person.getSexo());
                return person;
            });
			
			poJobExecution.getStepExecutions().stream().forEach(stepExecution -> {
				//moLog.info("Read rows: {}", stepExecution.getReadCount());
				//moLog.info("Written rows: {}", stepExecution.getWriteCount());
               // moLog.info("Not written rows: {}", stepExecution.getWriteSkipCount());
            });
        }		
	}

}
