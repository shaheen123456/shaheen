package com.hrms.testscript;
import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;
import com.utility.*;
import com.hrms.lib.*; 

public class Tc_102 {
	@Test
	public void tc_102() throws Exception {
		DOMConfigurator.configure("log4j.xml");
	
	//public static void main(String args[]) throws Exception {
		General a = new General();
		//Test case Steps
		a.openapplication();
		a.waitstatement();
	    a.login();
	    a.verifytitle();
	    a.welcometitle();
	    a.mouseoverandclick();
		a.logout();
		a.closebrowser();
	}

}
