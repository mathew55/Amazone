package test.com.jUnit;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import agile.TeamA.Registerandlogin.Dao.impl.AdminRegister_Dao_impl;

class AdminLoginPageTest {
	private AdminRegister_Dao_impl Adiobj = new AdminRegister_Dao_impl();

	//  User checks the appearance of labels Username, Password // Check the required fields by not filling any data
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		// Test if the User exists in the database
		String adminUserName = "A00258759";
		String adminPassword = "123456";
		//assertEquals("User Exist in the Database", Adiobj.adminfind(adminUserName, adminPassword));
		 assertTrue(Adiobj.adminfind(adminUserName, adminPassword));
	}
	@Test
	 void CorrectUsername() {
		// Check When Username is correct and invalid password
			String adminUserName = "A00258759";
			String adminPassword = "12345678";
			assertFalse(Adiobj.adminfind(adminUserName, adminPassword));
		
	}
	
	@Test
	 void CorrectPassword() {
		// Check When Password is correct and invalid Username
			String adminUserName = "A00358759";
			String adminPassword = "123456";
			assertFalse(Adiobj.adminfind(adminUserName, adminPassword));
		
	}
	
	
	@Test
	 void CheckEmpty() {
		// Check When Username field and password field is required
			String adminUserName = "";
			String adminPassword = "";
			assertFalse(Adiobj.adminfind(adminUserName, adminPassword));
		
	}
	
	@Test
	 void CheckUserNameEmpty() {
		// Check When Username field and password field is required
			String adminUserName = "";
			String adminPassword = "123456";
			assertFalse(Adiobj.adminfind(adminUserName, adminPassword));
		
	}
	@Test
	 void CheckPasswordEmpty() {
		// Check When Username field and password field is required
			String adminUserName = "A00258759";
			String adminPassword = "";
			assertFalse(Adiobj.adminfind(adminUserName, adminPassword));
		
	}
	
	
}
