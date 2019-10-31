package pe.etg.bbva.evalua.spring5.utilities.server;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class CU0101v01ServerGrpc {
	private static Logger MOLOG = LoggerFactory.getLogger(CU0101v01ServerGrpc.class);
	private static int SERVER_PORT = 2027;
	
	public static void main(String[] paServer) throws IOException, InterruptedException {
		Server oServer = ServerBuilder.forPort(SERVER_PORT).addService((BindableService) new HelloServiceImpl()).build();

		MOLOG.info("[EVL] Iniciando Server .....");
		oServer.start();
		
		MOLOG.info("[EVL] Server iniciado .....");
		oServer.awaitTermination();
	}
}
