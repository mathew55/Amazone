package agile.TeamA.Registerandlogin.DaoI;

import agile.TeamA.Vo.Admin_RegisterLogin_Vo;

public interface AdminRegister_Interface {
/*
 * Find admin based on adminname and password
 * 
 * */
	Admin_RegisterLogin_Vo adminfind(String adminname ,String adminpwd);
	
	/*
	 * register admin 
	 * 
	 * */	
	
	void register(Admin_RegisterLogin_Vo admin);
	/*
	 * Find admin based on adminID
	 * 
	 * */	
	Admin_RegisterLogin_Vo adminfind(String adminID);
	
}
