package pe.bbva.spring.batch.vista;

import org.springframework.batch.item.ItemProcessor;

import pe.etg.bbva.evalua.spring5.entity.Report;

public class CustomItemProcessor implements ItemProcessor<Report, Report> {

	@Override
	public Report process(Report item) throws Exception {
		
		System.out.println("Processing..." + item);
		return item;
	}

}