package agile.TeamA.ShoppingCart.DaoI;

import java.util.ArrayList;

import agile.TeamA.Vo.ShoppingCart_Vo;

public interface ShoppingCart_DaoInterface {
	//use to operation databse update product table quantity
	/*boolean updateItems_Quantity(int product_id,int product_quantity_avl);*/
	//use to add user history to history table
	boolean addUserHist(ArrayList<ShoppingCart_Vo> userhistList,int CustomerID);
	//get items information
	ArrayList<ShoppingCart_Vo> GetItemsInformation(int product_id);
	//get customer cart information
	ArrayList<ShoppingCart_Vo> GetCart(int Customer_id);
	//use to add CustomerCart information to CustomerCart table
	boolean addCustomerCart(ArrayList<ShoppingCart_Vo> CustomerCart);
	//use to update CustomerCart information
	boolean updateCustomer_Cart(String ids,int Customer_id,String type);
	//use to check product quantity is available
	//boolean checkquantity(int product_id);
	

}
