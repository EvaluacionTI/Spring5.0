package pe.etg.bbva.evalua.spring5.modelo;

import org.springframework.context.annotation.Bean;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;

public class CDApplicationConfig {
	@Bean
	public MongoDbFactory mongoDbFactory() {
		MongoClient oBDMongo = new MongoClient("localhost", 27017);
		UserCredentials oUserCredentials = new UserCredentials("", "");
		return new SimpleMongoDbFactory(oBDMongo, "aemsaprueba");
	}
	
	@Bean
	public MongoTemplate mongoTemplate() {
		MongoTemplate oMongoTemplate = new MongoTemplate(mongoDbFactory());
		return oMongoTemplate;
	}
}
