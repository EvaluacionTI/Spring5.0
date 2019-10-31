package pe.bbva.spring.batch.vista;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@EnableBatchProcessing
public class CV0201v01BatchConfiguracion {
	@Autowired
    private JobBuilderFactory jobBuilderFactory;
	
	@Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private ItemReader reader;
    
    @Autowired
    private ItemProcessor processor;
    
    @Autowired
    private ItemWriter writer;
    
    @Autowired
    private JobExecutionListener listener;

    @Bean
    private Job job(){
        return jobBuilderFactory.get("job")
                .flow(step())
                .end()
                .listener(listener)
                .build();
    }
    
    @Bean
    private Step step(){
        return stepBuilderFactory.get("firstStep")
                .chunk(10)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build();
    }
}
