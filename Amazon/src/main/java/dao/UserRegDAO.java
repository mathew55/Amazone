package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import model.UserRegistrationBean;

public class UserRegDAO {
	

		Connection con = null;
		Statement statement = null;
		ResultSet resultSet = null;

		String userNameDB = "";
		String passwordDB = "";
		static int counter = 0;

   public String validateUserdetailsforLogin(UserRegistrationBean loginBean)
   {
	   String userName = loginBean.getUserName(); //Keeping user entered values in temporary variables.
		String password = loginBean.getPassword1();
		try
			{
				con = DBConnection.createConnection(); //establishing connection
				statement = con.createStatement(); //Statement is used to write queries. Read more about it.
				resultSet = statement.executeQuery("select userId,password from user_table"); //Here table name is users and userName,password are columns. fetching all the records and storing in a resultSet.

				while(resultSet.next()) // Until next row is present otherwise it return false
				{
					userNameDB = resultSet.getString("userId"); //fetch the values present in database
					passwordDB = resultSet.getString("password");

					if(userName.equals(userNameDB) && password.equals(passwordDB))
						{
							return "SUCCESS"; ////If the user entered values are already present in database, which means user has already registered so I will return SUCCESS message.
						}
				}
			}
		catch(Exception e)
			{
				e.printStackTrace();
			}
							return "Invalid user credentials"; // Just returning appropriate message otherwise
}
	
   public String addUserdetailsinDB(UserRegistrationBean loginBean)
   
   {
	   String pwd1=loginBean.getPassword1();
	   System.out.println(pwd1);
	   String pwd2=loginBean.getPassword2();
	   System.out.println(pwd2);
	   if(pwd1.equals(pwd2))
	   {
	   String query = "insert into  user_table values (?,?,?,?,?)";
   	try {
   		
   		    counter=counter+1;
   		    
   		 con = DBConnection.createConnection(); //establishing connection
			
			
   		    System.out.println("counter value is "+counter);
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, counter);
			pst.setString(2,loginBean.getUserfullName());
			pst.setString(3,loginBean.getEmail());
			pst.setString(4,loginBean.getUserName());
			pst.setString(5,loginBean.getPassword2());
		
			
			pst.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   	return "Successfully Inserted";
   }
	   else
	   {
		   return "Passwords do not match";
	   }
	   
   }
}

