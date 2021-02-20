package com.vortexbird.sonarlab.sonarlab1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SonarLab1 {

	public static final String ABC = "abc";
	protected static final String[] strings = {"primero", "segundo"}; 
    private static Logger logger = Logger.getLogger("SonarLab1");
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			String mensaje = "Loop en " + i;
			logger.log(Level.INFO, mensaje);
		}
	}
	
}
