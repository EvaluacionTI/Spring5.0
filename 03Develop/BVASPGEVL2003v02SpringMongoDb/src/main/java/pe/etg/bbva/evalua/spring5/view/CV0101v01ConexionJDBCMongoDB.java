package pe.etg.bbva.evalua.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mongodb.MongoClient;
import com.mongodb.MongoSocketOpenException;

public class CV0101v01ConexionJDBCMongoDB {
	private static final Logger MOLOG = LoggerFactory.getLogger(CV0101v01ConexionJDBCMongoDB.class);
	private static MongoClient oDBMongo = null;
	
	public static void main(String[] args){
		// Es necesario inicia una instancia del servidor de mongo para su ejecución
		// C:\Program Files\MongoDB\Server\3.6\bin
		// Archivo de mongo: mongod
		MOLOG.info("[MONGODB] Iniciando instancia ====> {} ", oDBMongo);
		
		oDBMongo = new MongoClient("localhost", 27017);
		MOLOG.info("[MONGODB] instancia generada ====> {} ", oDBMongo);
		try {
			if(oDBMongo != null) {
				MOLOG.info("[MONGODB] Address of Intancie create ====> {} ", oDBMongo.getAddress());

				MOLOG.info("[MONGODB] Lista Data Base ====> {} ", oDBMongo.listDatabaseNames());
			}else {
				MOLOG.info("[MONGODB] Error conexion ====> Conexión NO establecida");
			}
			oDBMongo.close();			
		}catch(MongoSocketOpenException ex) {
			MOLOG.info("[MONGODB] Error socket ====> {}", ex);
		}

	}

}
