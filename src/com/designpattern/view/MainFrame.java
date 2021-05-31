package com.designpattern.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;

import com.designpattern.constant.Constant;
import com.designpattern.controller.Controller;
import com.designpattern.logger.ConsoleLogger;

/**
 * Apply MVC Pattern (View)
 * 
 * @author taila
 *
 */
public class MainFrame extends JFrame implements FormListener {

	// Create logging
	private ConsoleLogger consoleLogger = new ConsoleLogger();

	private static final long serialVersionUID = 1L;
	private FormPanel formPanel;
	private TextPanel textPanel;
	private Controller controller;

	public MainFrame() {
		super(Constant.APPLICATION_TITLE);

		initializeClass();
		consoleLogger.writeNotify("Created new panel !");
		setLayout();
		consoleLogger.writeNotify("Set layout for main frame !");
	}

	private void setLayout() {

		// Add new panel for main frame
		add(this.formPanel, BorderLayout.WEST);
		add(this.textPanel, BorderLayout.CENTER);

		// Set attribute for main frame
		setSize(700, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void initializeClass() {
		this.controller = new Controller(this);
		this.formPanel = new FormPanel();
		this.formPanel.setFormListener(this);
		this.textPanel = new TextPanel();
	}

	@Override
	public void btnOk(String personName, String personRole) {
		this.controller.addPerson(personName, personRole);
		this.controller.refreshScreen();
	}

	public void refreshTextArea(String personName, String personRole) {
		this.textPanel.addText(personName + " - " + personRole);
	}

	public void clearText() {
		this.textPanel.clearText();
	}

	@Override
	public void btnClear() {
		clearText();
		this.controller.resetTextArea();
	}

}
