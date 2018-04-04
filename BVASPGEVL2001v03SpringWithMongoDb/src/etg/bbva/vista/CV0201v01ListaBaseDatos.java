package etg.bbva.vista;

import java.net.UnknownHostException;
import java.util.List;

import com.mongodb.MongoClient;

import etg.bbva.modelo.mongoDB.CDConexionMongoDb;

public class CV0201v01ListaBaseDatos {

	public static void main(String[] args) throws UnknownHostException {
		CDConexionMongoDb oDB = new CDConexionMongoDb();
		
		MongoClient oDBMongoCliente;
		
		oDBMongoCliente = oDB.getConexionMongo();
		List<String> oListDB = oDB.leerBaseDatos(oDBMongoCliente);
		
		for(String sIndice : oListDB) {
			System.out.println("Base datos " + sIndice);
		}

		oDB.cerrarMongo(oDBMongoCliente);
	}

}
