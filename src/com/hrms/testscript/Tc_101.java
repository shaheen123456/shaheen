package com.hrms.testscript;
import com.hrms.lib.*; 
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Tc_101 {
	General g=new General();
	@BeforeMethod
	public void startup() throws Exception {
		g.openapplication();
		System.out.println("1");
		g.waitstatement();
		System.out.println("2");
		g.verifytitle();
		System.out.println("3");
	}
	@Test
	public void Login() throws Exception {
		g.login();
		g.verifytitle();
		g.welcometitle();
	}
	@AfterMethod
	public void teardown() {
		g.logout();
		g.closebrowser();
		
	
	
	  }  
	 
	 
		
	
	
	

}
