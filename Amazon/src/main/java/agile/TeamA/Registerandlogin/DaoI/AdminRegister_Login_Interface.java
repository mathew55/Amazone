package agile.TeamA.Registerandlogin.DaoI;

import agile.TeamA.Vo.Admin_RegisterLogin_Vo;

public interface AdminRegister_Login_Interface {
/*
 * Find admin based on adminname and password
 * 
 * */
	Boolean adminfind(String adminname ,String adminpwd);
	
	/*
	 * register admin 
	 * 
	 * */	
	
	boolean register(Admin_RegisterLogin_Vo admin);
	/*
	 * Find admin based on adminID
	 * 
	 * */	
	Admin_RegisterLogin_Vo adminfind(String adminID);
	
}
