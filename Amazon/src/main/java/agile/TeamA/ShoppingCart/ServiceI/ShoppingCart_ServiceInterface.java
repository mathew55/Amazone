package agile.TeamA.ShoppingCart.ServiceI;

import java.util.ArrayList;

import agile.TeamA.Vo.ShoppingCart_Vo;

public interface ShoppingCart_ServiceInterface {
	//use to update products quantity
	/*boolean UpdateProducts_Quantity(int product_id,int product_quantity_avl) ;*/
	//update user hist table
	void UpdateUserHist(ArrayList<ShoppingCart_Vo> userhistList);
	//use to get item information
	ArrayList<ShoppingCart_Vo> getProduct_Information(int product_id); 
	//use to get customer cart information
	ArrayList<ShoppingCart_Vo> getCart(int Customer_id);
	//use to add CustomerCart information to CustomerCart table
	boolean addCustomerCart(ArrayList<ShoppingCart_Vo> CustomerCart);
	//use to update CustomerCart information
	boolean updateCustomer_Cart(String ids,int Customer_id,String type);
}
