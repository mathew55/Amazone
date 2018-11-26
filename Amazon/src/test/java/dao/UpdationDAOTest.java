package dao;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import model.Product;

public class UpdationDAOTest {

	@Test
	public void testUpdateDB() {
		UpdationDAO.instance.UpdateDB(2, 1);
		Assert.assertEquals(3, Product.getquantityavailable());
	}

}
