package pe.etg.bbva.evalua.spring5.view;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

public class CV0301v01MostrarColeccionDeDatos {
	static MongoClient oDBMongo = null;
	
	public static void main(String[] args) {
		//Por defecto se conecta a 127.0.0.1:27017
		oDBMongo = new MongoClient(new ServerAddress( "localhost", 27015));
		if(oDBMongo != null) {
			System.out.println("Lista de base de datos");
			System.out.println(oDBMongo.listDatabaseNames());
		}else {
			System.out.println("Error: Conexi�n no establecida");
		}
		
		 //Recuperamos la base de datos.
		 DB oBaseDatos = oDBMongo.getDB("BBVARCHITECT");
		 
		 //Recuperamos los valores de la colección, previamente hemos introducido 
		 //unos valores desde la consola de mongo con db.things.save({name:"mongoDB"})
		 DBCollection coleccion = oBaseDatos.getCollection("DESt01_consulta");
		 
		 //Recuperamos el elemento
		 DBObject documento = coleccion.findOne();
		 System.out.println( documento );		
		 oDBMongo.close();
	}

}
