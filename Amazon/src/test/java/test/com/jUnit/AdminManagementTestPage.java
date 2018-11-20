package test.com.jUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import dao.AdminDashboard;
import model.DashboardProduct;

class AdminManagementTestPage {

 private AdminDashboard adminDash = new AdminDashboard(); 
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
	void testTotalCounter() {
		int count = 3;
		if(count == 3) {
			assertSame(adminDash.getTotalProduct(), count);		
		}
		else {
			
			assertNotSame(adminDash.getTotalProduct(), count);
		}
		
	}
	@Test
	void testTotalProductLessThan3() {
		int count = 0;
		if(count == 0) {
			assertSame(adminDash.getProductLessThan3(), count);		
		}
		else {
			
			assertNotSame(adminDash.getProductLessThan3(), count);
		}
		
		
	}
	
	@Test
	void testgetListFewProducts() {
		ArrayList<DashboardProduct> list = adminDash.getListofFewProduct();
		int lis = Array.getLength(list.toArray());
		assertEquals( lis, 3);
		
	}
	
}
