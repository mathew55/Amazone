package agile.TeamA.Registerandlogin.Dao.impl;

import java.sql.Connection;
import java.sql.Statement;

import agile.TeamA.Registerandlogin.DaoI.AdminRegister_Interface;
import agile.TeamA.Vo.Admin_RegisterLogin_Vo;
import agile.TeamA.utils.Dbmanage;

public class AdminRegister_Dao_impl implements AdminRegister_Interface {
	/*
	 * Implementation class for AdminRegister_Interface
	 * 
	 */

	@Override
	public Admin_RegisterLogin_Vo adminfind(String adminname, String adminpwd) {
		return null;
		// TODO Auto-generated method stub
		

	}
	// register a admin account
	@Override
	public void register(Admin_RegisterLogin_Vo admin) {
		// TODO Auto-generated method stub
		Dbmanage dbmanage = new Dbmanage();
		Connection conn = null;
		Statement sta = null;
		try {
			conn = dbmanage.initDB();
			String sql = "INSERT INTO database VALUES(" + admin.getAdminID() + ',' + admin.getAdminName() + ','
					+ admin.getAdminPwd() + ',' + admin.getEmailAddress() + ")";
			sta.executeQuery(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbmanage.closeDB(sta, conn);
		}

	}

	@Override
	public Admin_RegisterLogin_Vo adminfind(String adminID) {
		// TODO Auto-generated method stub
		
		Admin_RegisterLogin_Vo admin=new Admin_RegisterLogin_Vo();
		Dbmanage dbmanage = new Dbmanage();
		Connection conn = null;
		Statement sta = null;
		try {
			conn=dbmanage.initDB();
			String sql = "SELECT * FROM DATABASE WHERE ADMINID="+adminID+"";
		} catch (Exception e) {
			// TODO: handle exception
		}
		return admin;
		
	}

}
