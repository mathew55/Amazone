package agile.TeamA.Registerandlogin.Dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import agile.TeamA.Registerandlogin.DaoI.AdminRegister_Login_Interface;
import agile.TeamA.Vo.Admin_RegisterLogin_Vo;
import agile.TeamA.utils.Dbmanage;
import model.Name;

public class AdminRegister_Dao_impl implements AdminRegister_Login_Interface {
	/*
	 * Implementation class for AdminRegister_Interface
	 * 
	 */

	@Override
	public Boolean adminfind(String adminname, String adminpwd) {
		Dbmanage dbmanage = new Dbmanage();
		Connection conn = null;
		Statement sta = null;
		try {
			conn=dbmanage.initDB();
			//String sql = "SELECT * FROM DATABASE WHERE admin_username="+AdminName+";";
			PreparedStatement psmt = conn.prepareStatement("SELECT * FROM ADMINISTRATORS WHERE admin_username=(?) and admin_password=(?)");
			psmt.setString(1, adminname);
			psmt.setString(2, adminpwd);
			ResultSet rs=psmt.executeQuery();
			while(rs.next()) {
				
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}	
		return false;		
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
			String sql = "INSERT INTO ADMINISTRATORS VALUES(" + admin.getFirstName() + ',' + admin.getAdminName() + ','
					+ admin.getAdminPwd() + ',' + admin.getLastName() + ")";
			sta.executeQuery(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbmanage.closeDB(sta, conn);
		}

	}

	@Override
	public Admin_RegisterLogin_Vo adminfind(String AdminName) {
		// TODO Auto-generated method stub		
		Admin_RegisterLogin_Vo admin=new Admin_RegisterLogin_Vo();
		Dbmanage dbmanage = new Dbmanage();
		Connection conn = null;
		//Statement sta = null;
		Admin_RegisterLogin_Vo admin1 =new Admin_RegisterLogin_Vo();
		String adminName =null;
		try {
			conn=dbmanage.initDB();
			//String sql = "SELECT * FROM DATABASE WHERE admin_username="+AdminName+";";
			PreparedStatement psmt = conn.prepareStatement("SELECT * FROM ADMINISTRATORS WHERE admin_username=(?)");
			psmt.setString(1, AdminName);
			ResultSet rs=psmt.executeQuery();
			while(rs.next()) {
				adminName = rs.getString("admin_username");
				admin1.setAdminName(adminName);
				System.out.println("name"+adminName+"is in the data base");
				
			}
				System.out.println("name"+adminName+"is not in the data base");
				
				return null;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return admin1;
	
	}

}
