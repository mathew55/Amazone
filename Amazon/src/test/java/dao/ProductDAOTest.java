package dao;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import model.Product;

public class ProductDAOTest {

//	@Test
//	public void testGetConnection() {
//		fail("Not yet implemented");
//	}

/*	@Test
	public void testCheckFirstName() {
	Product mock = new Product(10,"apple","jobs",23,12,1);
	Product p = ProductDAO.instance.checkFirstName(10);
	assertEquals("apple",p.returnname());
	}*/

	@Test
	public void testSearchbyname() {
	Product mock = new Product(1,"apple","jobs",23,12,1);
	Product p = ProductDAO.instance.searchName(mock.returnname(),mock.returnmanufacturer());
	assertEquals("apple",p.returnname());
	}
}
