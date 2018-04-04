package etg.bbva.modelo.mongoDB;

import java.net.UnknownHostException;
import java.util.List;

import com.mongodb.MongoClient;

public class CDConexionMongoDb {
	MongoClient oDBMongoClient = null;
	
	public MongoClient getConexionMongo() throws UnknownHostException {
		String sURL = "localhost";
		int iPort = 27017;
		oDBMongoClient = new MongoClient(sURL, iPort);
		return oDBMongoClient;
	}
	
	public List<String> leerBaseDatos(MongoClient poDBMongoClient){
		@SuppressWarnings("deprecation")
		List<String> oListBaseDatos = poDBMongoClient.getDatabaseNames();
		
		return oListBaseDatos;
	}
	
	public void cerrarMongo(MongoClient poDBMongoClient) {
		poDBMongoClient.close();
	}
}
