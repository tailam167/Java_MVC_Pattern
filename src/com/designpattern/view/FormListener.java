package com.designpattern.view;

/**
 * Apply MVC Pattern (View)
 * 
 * @author taila
 *
 */
public interface FormListener {

	public void btnOk(String personName, String personRole);
	
	public void btnClear();
}
