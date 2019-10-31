package pe.etg.bbva.evalua.spring5.utilities.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class CU0101v01ClienteGrpc {
	private static Logger MOLOG = LoggerFactory.getLogger(CU0101v01ClienteGrpc.class);
	private static String SERVER_IP = "localhost";
	private static int SERVER_PORT = 2027;
	
	public static void main(String[] paCliente) {
		MOLOG.info("[EVL] Iniciando GRPC");
		MOLOG.info("[EVL] Server y Port : {} {}", SERVER_IP, SERVER_PORT );
		ManagedChannel oChannel = ManagedChannelBuilder.forAddress(SERVER_IP, SERVER_PORT)
				.usePlaintext()
				.build();
		
		MOLOG.info("[EVL] ManagedChannel of GRPC : {}", oChannel);
		MOLOG.info("[EVL] ManagedChannel - authority    : {}", oChannel.authority());
		MOLOG.info("[EVL] ManagedChannel - toString     : {}", oChannel.toString());
		MOLOG.info("[EVL] ManagedChannel - isTerminated : {}", oChannel.isTerminated());
		
		oChannel.shutdown();
	}
}
