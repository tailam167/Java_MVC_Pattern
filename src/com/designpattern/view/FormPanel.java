package com.designpattern.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.designpattern.logger.ConsoleLogger;

/**
 * Apply MVC Pattern (view)
 * 
 * @author taila
 *
 */
public class FormPanel extends JPanel implements ActionListener {

	// Create logging
	private ConsoleLogger consoleLogger = new ConsoleLogger();

	private static final long serialVersionUID = 1L;
	private JTextField nameField;
	private JTextField roleField;
	private JButton okButton;
	private JButton clearButton;
	public FormListener formListener;

	public FormPanel() {
		initializeClass();
		consoleLogger.writeInfor("Created Classes for Form Panel !");
		setClassDimension();
		consoleLogger.writeInfor("Created Dimension for Form Panel !");
		setLayout();
		consoleLogger.writeInfor("Created layout for Form Panel !");
	}

	private void setLayout() {

		setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();

		// Create new row
		gc.gridy = 0;
		gc.gridx = 0;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		add(new JLabel("Name: "), gc);

		gc.gridx++;
		gc.gridy = 0;
		gc.weightx = 1;
		gc.weighty = 0;
		gc.anchor = GridBagConstraints.LINE_START;
		add(nameField, gc);

		// Create new row
		gc.gridy++;
		gc.gridx = 0;
		gc.weightx = 1;
		gc.weighty = 0.4;
		gc.anchor = GridBagConstraints.LINE_END;
		add(new JLabel("Role: "), gc);

		gc.gridx++;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(roleField, gc);

		// Create new row
		gc.gridy++;
		gc.gridx = 0;
		gc.weightx = 1;
		gc.weighty = 0.5;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		
		add(okButton, gc);
		gc.gridx++;
		gc.gridy = 2;
		gc.anchor = GridBagConstraints.LINE_START;
		add(clearButton, gc);
		
		gc.gridy++;
		gc.gridx = 0;
		gc.weightx = 1;
		gc.weighty = 10;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		add(new JLabel("Java MVC Pattern Demo"), gc);
	}

	private void setClassDimension() {
		Dimension dimension = getPreferredSize();
		dimension.width = 300;
		setPreferredSize(dimension);
		setMinimumSize(dimension);
	}

	private void initializeClass() {
		this.nameField = new JTextField(10);
		this.roleField = new JTextField(10);
		this.okButton = new JButton("OK");
		this.clearButton = new JButton("Clear All");
		this.okButton.addActionListener(this);
		this.clearButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				nameField.setText("");
				roleField.setText("");
				formListener.btnClear();
			}
		});
	}

	public void setFormListener(FormListener formListener) {
		this.formListener = formListener;
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		if (this.formListener != null) {
			String personName = this.nameField.getText();
			String personRole = this.roleField.getText();
			this.formListener.btnOk(personName, personRole);
		}
		this.nameField.setText("");
		this.roleField.setText("");
	}
}
