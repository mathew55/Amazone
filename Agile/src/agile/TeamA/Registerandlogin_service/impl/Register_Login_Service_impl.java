package agile.TeamA.Registerandlogin_service.impl;

import agile.TeamA.Registerandlogin.Dao.impl.AdminRegister_Dao_impl;
import agile.TeamA.Registerandlogin_serviceI.Register_Login_Service;
import agile.TeamA.Vo.Admin_RegisterLogin_Vo;

public class Register_Login_Service_impl implements Register_Login_Service{

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
		String adminame=adi.adminfind(AdminName).getAdminName();
		if(adminame!=null) {
			throw new Exception("Admin ID already exists");
		}
		adi.register(Admin);
	}

	@Override
	public boolean LoginAdmin(Admin_RegisterLogin_Vo Admin) throws Exception {
		// TODO Auto-generated method stub
		String adminname=Admin.getAdminName();
		String pwd=Admin.getAdminPwd();
		AdminRegister_Dao_impl adi=new AdminRegister_Dao_impl();
		
		if(adi.adminfind(adminname)!=null) {
			if(adi.adminfind(adminname, pwd)==true) {	
				
				return true;
			}else {
				throw new Exception("Admin password is not correct!");		
				
			}
		}else {
			
			throw new Exception("Admin ID is not exists");
		}
		
		
	}

}
