package com.hrms.testscript;
import com.hrms.lib.*; 

public class Tc_103 {
	public static void main(String args[]) throws Exception {
		General a = new General();
		//Test case Steps
		a.openapplication();
		a.login();
		a.delemp();
		a.logout();
		a.closebrowser();
	}

}
