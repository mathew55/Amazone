package agile.TeamA.Registerandlogin_serviceI;

import agile.TeamA.Vo.Admin_RegisterLogin_Vo;

public interface Register_Login_Service {
	
	
	// Use for supply register service
	boolean RegisterAdmin(Admin_RegisterLogin_Vo Admin);
	
	
	// Use for supply Login service
	boolean LoginAdmin(Admin_RegisterLogin_Vo Admin);
}
