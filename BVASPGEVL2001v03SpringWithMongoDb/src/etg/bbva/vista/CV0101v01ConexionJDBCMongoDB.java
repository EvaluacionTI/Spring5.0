package etg.bbva.vista;

import com.mongodb.MongoClient;

public class CV0101v01ConexionJDBCMongoDB {
	static MongoClient oDBMongo = null;
	
	public static void main(String[] args){
		System.out.println("Intancias MongoClient " + oDBMongo);
		
		oDBMongo = new MongoClient("localhost", 27017);
		if(oDBMongo != null) {
			System.out.println("Lista de base de datos");
			System.out.println(oDBMongo);
		}else {
			System.out.println("Error: Conexión no establecida");
		}
		oDBMongo.close();
	}

}
