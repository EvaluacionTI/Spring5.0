package pe.bbva.spring.entity;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * Objetivo: Un tasklet es una clase que realiza una acción simple. Permite asi ejecutar y realizar cualquier acción que necesitemos. 
 * 			 Spring Batch provee clases más complejas y potentes que los tasklets, pero son igualmente útiles para realizar algunas acciones.
 */
public class CEImprimirTasklet implements Tasklet{
	private String msMensaje;
	
	public String getMsMensaje() {
		return msMensaje;
	}

	public void setMsMensaje(String msMensaje) {
		this.msMensaje = msMensaje;
	}


    /**
     * Descripción : La ejecución del tasklet. Spring Batch invoca este método para ejecutar la acción.
     * @return el codigo de estado. Si el codigo es "FINISHED" continua la 
     *         ejecución con la siguiente tarea.
     */	
	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		System.out.print(msMensaje);
		return RepeatStatus.FINISHED;
	}

}
