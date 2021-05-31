package com.designpattern;

import com.designpattern.logger.ConsoleLogger;
import com.designpattern.view.MainFrame;

/**
 * Demo Apply MVC (Model - View - Controller) Pattern
 * 
 * @author taila
 *
 */
public class App {

	public static void main(String[] args) {

		// Create Logging
		ConsoleLogger consoleLogger = new ConsoleLogger();
		consoleLogger.writeInfor("<MODEL - VIEW - CONTROLLER PATTERN>");

		/**
		 * MVC Pattern: Can separate the application with help of this pattern. Could
		 * add extra features into application very easily. MVC includes: - Model:
		 * represent an object or a class carrying data, have logic to update for
		 * controller when data is changed. - Controller: Acts on both Model and View,
		 * controls data flow into model object, updates view whenever data is changed,
		 * keep model and view separate. - View: represent a visualization of the data
		 * that model contains.
		 */
		MainFrame mainFrame = new MainFrame();
		consoleLogger.writeInfor(String.valueOf(mainFrame));
	}
}
