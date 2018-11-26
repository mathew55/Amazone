package agile.TeamA.Cart.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.Test;

import agile.TeamA.ShoppingCart.Dao.impl.ShoppingCart_Dao;
import agile.TeamA.Vo.ShoppingCart_Vo;

public class DaoTest {

private ShoppingCart_Dao scd =new ShoppingCart_Dao();

/*@Test
public void testaddCustomerCart() {
	ArrayList<ShoppingCart_Vo> CustomerCart = new ArrayList<>();
	//BigDecimal bg= BigDecimal.valueOf(399.99);
	ShoppingCart_Vo scv =new ShoppingCart_Vo(1, 1, "iPod Classic 256 GB",399.99,1);
	CustomerCart.add(scv);
	//scd.addCustomerCart(CustomerCart,1);
	assertTrue(scd.addCustomerCart(CustomerCart,1));
}*/

/*@Test
public void testGetCart() {
	
	scd.GetCart(1);
	assertNotNull(scd.GetCart(1));
}*/


@Test
public void testupdateCustomer_Cart() {
	String ids ="1,2,";
	scd.updateCustomer_Cart(ids, 1, "buy");
	assertNotNull(scd.updateCustomer_Cart(ids, 1, "buy"));
}

}
