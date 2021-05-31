package com.designpattern.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Apply logging into design pattern
 * 
 * @author taila
 *
 */
public class ConsoleLogger {
	
	Logger logger = Logger.getLogger(ConsoleLogger.class.getName());
	
	public void writeError(String msgErrorString, Exception exception) {
		logger.log(Level.WARNING, msgErrorString, exception);
	}
	
	public void writeNotify(String msgNotifyString) {
		logger.log(Level.SEVERE, msgNotifyString);
	}
	
	public void writeInfor(String msgInforString) {
		logger.log(Level.INFO, msgInforString);
	}

	public int writeResult(int inResult) {
		return inResult;
	}

	public String writeWarning(String msgWarningString) {
		logger.log(Level.WARNING, msgWarningString);
		return msgWarningString;
	}
}
