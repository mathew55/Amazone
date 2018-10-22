package agile.TeamA.Registerandlogin_serviceI;

import agile.TeamA.Vo.Admin_RegisterLogin_Vo;

public interface Register_Login_Service {
	
	
	// Use for supply register service
	void RegisterAdmin(Admin_RegisterLogin_Vo Admin) throws Exception;
	
	
	// Use for supply Login service
	void LoginAdmin(Admin_RegisterLogin_Vo Admin);
}
