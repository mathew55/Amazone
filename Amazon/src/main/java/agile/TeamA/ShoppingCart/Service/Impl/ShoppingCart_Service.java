package agile.TeamA.ShoppingCart.Service.Impl;

import java.util.ArrayList;

import agile.TeamA.ShoppingCart.Dao.impl.ShoppingCart_Dao;
import agile.TeamA.ShoppingCart.ServiceI.ShoppingCart_ServiceInterface;
import agile.TeamA.Vo.ShoppingCart_Vo;

public class ShoppingCart_Service implements ShoppingCart_ServiceInterface {

	/*@Override
	public boolean UpdateProducts_Quantity(int product_id, int product_quantity_avl) {
		ShoppingCart_Dao SD = new ShoppingCart_Dao();
		boolean Result = SD.updateItems_Quantity(product_id, product_quantity_avl);
		if (Result) {
			System.out.println("update product avilable quantity success!");
			return Result;
		} else {
			System.err.println("update product avilable quantity failed!");
			// TODO Auto-generated method stub
			return Result;
		}
	}*/

	@Override
	public void UpdateUserHist(ArrayList<ShoppingCart_Vo> userhistList) {
	}

	@Override
	public ArrayList<ShoppingCart_Vo> getProduct_Information(int product_id) {
		// TODO Auto-generated method stub
		ShoppingCart_Dao SD = new ShoppingCart_Dao();
		ArrayList<ShoppingCart_Vo> Product_Information = SD.GetItemsInformation(product_id);
		return Product_Information;
	}

	@Override
	public ArrayList<ShoppingCart_Vo> getCart(int Customer_id) {
		// TODO Auto-generated method stub
		ShoppingCart_Dao SD = new ShoppingCart_Dao();
		ArrayList<ShoppingCart_Vo> Cart_Information = SD.GetCart(Customer_id);
		return Cart_Information;
	}

	@Override
	public boolean addCustomerCart(ArrayList<ShoppingCart_Vo> CustomerCart,int CustomerID) {
		// TODO Auto-generated method stub
		ShoppingCart_Dao SD = new ShoppingCart_Dao();
		boolean bl=SD.addCustomerCart(CustomerCart, CustomerID);
		if(bl) {
			return bl;
		}else {
			return bl;
		}
	}

	@Override
	public boolean updateCustomer_Cart(String ids,int Customer_id, String type) {
		// TODO Auto-generated method stub
		ShoppingCart_Dao SD = new ShoppingCart_Dao();
		boolean result=SD.updateCustomer_Cart(ids, Customer_id,type);
		if (result) {
			System.out.println("update CustomerCart information success!");
			return result;
		} else {
			System.err.println("update CustomerCart information failed!");
			// TODO Auto-generated method stub
			return result;
		}
	}

}
