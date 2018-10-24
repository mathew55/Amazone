package agile.TeamA.Registerandlogin_service.impl;

import agile.TeamA.Registerandlogin.Dao.impl.AdminRegister_Dao_impl;
import agile.TeamA.Registerandlogin_serviceI.Register_Login_Service;
import agile.TeamA.Vo.Admin_RegisterLogin_Vo;

public class Register_Login_Service_impl implements Register_Login_Service{

	@Override
	public boolean RegisterAdmin(Admin_RegisterLogin_Vo Admin){
		// TODO Auto-generated method stub
		String pwd=Admin.getAdminPwd();
		String vtypwd=Admin.getvtyAdminPwd();
		String AdminName=Admin.getAdminName();
		if(!pwd.equals(vtypwd)) {
			System.err.println("Inconsistent entry password!");
			  //throw new Exception("Inconsistent entry password!");
			  return false;
		}
		AdminRegister_Dao_impl adi=new AdminRegister_Dao_impl();
		String adminame=adi.adminfind(AdminName).getAdminName();
		if(adminame!=null) {
			System.err.println("Admin ID already exists");
			//throw new Exception("Admin ID already exists");
			return false;
		}
		adi.register(Admin);
		return true;
	}

	@Override
	public boolean LoginAdmin(Admin_RegisterLogin_Vo Admin){
		// TODO Auto-generated method stub
		String adminname=Admin.getAdminName();
		String pwd=Admin.getAdminPwd();
		AdminRegister_Dao_impl adi=new AdminRegister_Dao_impl();
		Admin_RegisterLogin_Vo arv=adi.adminfind(adminname);
		String adaccount=arv.getAdminName();
		if(adaccount!=null) {
			boolean bl=adi.adminfind(adminname, pwd);
			if(bl) {	
				
				return true;
			}else {
				//throw new Exception("");		
				System.err.println("Admin password is not correct!");
				return false;
			}
		}else {
			
			//throw new Exception("Admin ID is not exists");
			System.err.println("Admin ID is not exists");
			return false;
		}
		
		
	}

}
