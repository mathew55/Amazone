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

	@Test
	public void testCheckFirstName() {
		ProductDAO.instance.checkFirstName(1);
		Assert.assertEquals(2, Product.getquantityavailable());
	}

}
