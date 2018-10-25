package agile.TeamA.Registerandlogin.Dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import agile.TeamA.Registerandlogin.DaoI.AdminRegister_Login_Interface;
import agile.TeamA.Vo.Admin_RegisterLogin_Vo;
import agile.TeamA.utils.Dbmanage;

public class AdminRegister_Dao_impl implements AdminRegister_Login_Interface {
	/*
	 * Implementation class for AdminRegister_Interface
	 * 
	 */
	

	@Override
	public Boolean adminfind(String adminname, String adminpwd) {
		 Dbmanage dbmanage = new Dbmanage();
		 Connection conn = null;
		System.out.println("finish link to database and start seraching");
		try {
			conn = dbmanage.initDB();
			// String sql = "SELECT * FROM DATABASE WHERE admin_username="+AdminName+";";
			PreparedStatement psmt = conn
					.prepareStatement("SELECT * FROM ADMINISTRATORS WHERE admin_username=(?) and admin_pasword=(?)");
			psmt.setString(1, adminname);
			psmt.setString(2, adminpwd);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {

				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {

			dbmanage.fecharBDcon(conn);
		}
		return false;
	}

	// register a admin account
	@Override
	public boolean register(Admin_RegisterLogin_Vo admin) {
		// TODO Auto-generated method stub
		 Dbmanage dbmanage = new Dbmanage();
		 Connection conn = null;
		 Statement sta = null;
		try {
			conn = dbmanage.initDB();
			PreparedStatement psmt = conn.prepareStatement(
					"INSERT INTO ADMINISTRATORS (admin_ID,admin_firstName,admin_lastName,admin_username,admin_password) VALUES(null,?,?,?,?)");
			psmt.setString(1, admin.getFirstName());
			psmt.setString(2, admin.getLastName());
			psmt.setString(3, admin.getAdminName());
			psmt.setString(4, admin.getAdminPwd());
			psmt.executeUpdate();
			/*
			 * String sql = "INSERT INTO ADMINISTRATORS VALUES(" + admin.getFirstName() +
			 * ',' + admin.getAdminName() + ',' + admin.getAdminPwd() + ',' +
			 * admin.getLastName() + ")"; sta.executeQuery(sql);
			 */
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {

			dbmanage.fecharBDcon(conn);
		}

	}

	@Override
	public Admin_RegisterLogin_Vo adminfind(String AdminName) {
		// TODO Auto-generated method stub
		Admin_RegisterLogin_Vo admin = new Admin_RegisterLogin_Vo();
		 Dbmanage dbmanage = new Dbmanage();
		 Connection conn = null;
		// Statement sta = null;
		String adminName = null;
		conn = dbmanage.initDB();
		try {
			// String sql = "SELECT * FROM DATABASE WHERE admin_username="+AdminName+";";
			PreparedStatement psmt = conn.prepareStatement("SELECT * FROM ADMINISTRATORS WHERE admin_username=(?)");
			psmt.setString(1, AdminName);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				adminName = rs.getString("admin_username");
				admin.setAdminName(adminName);
				System.out.println("name" + adminName + "is in the data base");
				return admin;
			}
		} catch (Exception e) {
			// TODO: handle exception
			// System.out.println("name:"+adminName+"is not in the data base");
		} finally {
			dbmanage.fecharBDcon(conn);
		}
		System.out.println("name:" + adminName + "is not in the data base");
		return admin;

	}

}
