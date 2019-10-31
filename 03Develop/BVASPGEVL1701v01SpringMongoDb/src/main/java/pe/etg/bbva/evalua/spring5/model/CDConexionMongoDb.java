package pe.etg.bbva.evalua.spring5.model;

import java.net.UnknownHostException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mongodb.MongoClient;

public class CDConexionMongoDb {
	private static final Logger MOLOG = LoggerFactory.getLogger(CDConexionMongoDb.class);
	
	private MongoClient oDBMongoClient = null;
	
	public MongoClient getConexionMongo() throws UnknownHostException {
		String sURL = "localhost";
		int iPort = 27015;
		oDBMongoClient = new MongoClient(sURL, iPort);
		
		MOLOG.info("MONGO[]  getConexionMongo() ====> {}", oDBMongoClient);

		return oDBMongoClient;
	}
	
	public List<String> leerBaseDatos(MongoClient poDBMongoClient){
		@SuppressWarnings("deprecation")
		List<String> oListBaseDatos = poDBMongoClient.getDatabaseNames();
		MOLOG.info("MONGO[]  leerBaseDatos(params)====> {}", oListBaseDatos); 
		return oListBaseDatos;
	}
	
	public void cerrarMongo(MongoClient poDBMongoClient) {
		MOLOG.info("MONGO[]  cerrarMongo(params)====> {}", poDBMongoClient); 
		poDBMongoClient.close();
	}
}
