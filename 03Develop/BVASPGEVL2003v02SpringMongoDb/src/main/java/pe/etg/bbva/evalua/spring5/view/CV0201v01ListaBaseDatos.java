package pe.etg.bbva.evalua.spring5.view;

import java.net.UnknownHostException;
import java.util.List;

import com.mongodb.MongoClient;

import pe.etg.bbva.evalua.spring5.model.CDConexionMongoDb;

public class CV0201v01ListaBaseDatos {

	public static void main(String[] args) throws UnknownHostException {
		CDConexionMongoDb oDB = new CDConexionMongoDb();
		
		MongoClient oDBMongoCliente;
		
		int iContador;
		
		oDBMongoCliente = oDB.getConexionMongo();
		List<String> oListDB = oDB.leerBaseDatos(oDBMongoCliente);
		
		iContador = 0;
		for(String sIndice : oListDB) {
			System.out.println("Base datos [" + iContador + "] = "+ sIndice);
			iContador += 1;
		}

		oDB.cerrarMongo(oDBMongoCliente);
	}

}
