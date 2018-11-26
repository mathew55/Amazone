package dao;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import model.Product;

public class UpdationDAOTest {

	@Test
	public void testUpdateDB() {
		Product mock = new Product(10,"apple","jobs",23,12,1);
		int p = UpdationDAO.instance.UpdateDB(2, 10);
		assertEquals(1,p);
	}

}
