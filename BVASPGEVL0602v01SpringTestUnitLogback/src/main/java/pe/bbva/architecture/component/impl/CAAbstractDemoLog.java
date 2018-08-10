package pe.bbva.architecture.component.impl;

import org.slf4j.Logger;

public abstract class CAAbstractDemoLog {
	public static void logStatements (Logger poLogger, String psMensaje) {
		poLogger.trace("log a trace message {}", psMensaje);
		poLogger.debug("log a debug message {}", psMensaje);
	    poLogger.info("log a info message {}", psMensaje);
	    poLogger.warn("log a warn message {}", psMensaje);
	    poLogger.error("log an error message {}", psMensaje);
	}
}
