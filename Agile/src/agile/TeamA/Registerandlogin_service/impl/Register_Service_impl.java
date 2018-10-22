package agile.TeamA.Registerandlogin_service.impl;

import agile.TeamA.Registerandlogin.Dao.impl.AdminRegister_Dao_impl;
import agile.TeamA.Registerandlogin_serviceI.Register_Login_Service;
import agile.TeamA.Vo.Admin_RegisterLogin_Vo;

public class Register_Service_impl implements Register_Login_Service{

	@Override
	public void RegisterAdmin(Admin_RegisterLogin_Vo Admin) throws Exception {
		// TODO Auto-generated method stub
		String pwd=Admin.getAdminPwd();
		String vtypwd=Admin.getvtyAdminPwd();
		String AdminName=Admin.getAdminName();
		if(!pwd.equals(vtypwd)) {
			  throw new Exception("Inconsistent entry password!");
		}
		AdminRegister_Dao_impl adi=new AdminRegister_Dao_impl();
		;
		if(adi.adminfind(AdminName)!=null) {
			throw new Exception("Admin ID already exists");
		}
		adi.register(Admin);
	}

	@Override
	public void LoginAdmin(Admin_RegisterLogin_Vo Admin) {
		// TODO Auto-generated method stub

	}

}
