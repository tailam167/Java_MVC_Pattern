package com.designpattern.view;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.designpattern.logger.ConsoleLogger;

/**
 * Apply MVC Pattern (View)
 * 
 * @author taila
 *
 */
public class TextPanel extends JPanel {

	// Create logging
	private ConsoleLogger consoleLogger = new ConsoleLogger();

	private static final long serialVersionUID = 1L;
	private JTextArea textArea;

	public TextPanel() {
		initializeClass();
		consoleLogger.writeInfor("Initialized Classes  for Text Panel");
		setLayout();
		consoleLogger.writeInfor("Set Layout for Text Panel");
	}

	private void setLayout() {
		setLayout(new BorderLayout());
		textArea.setFont(new Font("Time New Roman", Font.PLAIN, 16));
		add(new JScrollPane(textArea), BorderLayout.CENTER);
	}

	private void initializeClass() {
		this.textArea = new JTextArea();
	}

	public void addText(String inText) {
		this.textArea.append(inText + "\n");
		consoleLogger.writeInfor("Appended new text !");
	}

	public void clearText() {
		this.textArea.setText("");
		consoleLogger.writeInfor("Cleared all !");
	}

}
