package agile.TeamA.Vo;

import java.math.BigDecimal;

public class ShoppingCart_Vo {
	private int product_id;
	private int Customer_ID;
	private int items_TotalQuantity;
	private int items_Quantity;
	//private double items_Price;
	private double total_itemsPrice;
	private String items_Name;
	private BigDecimal itemprice;
	
	private int cartid;
	
	public ShoppingCart_Vo() {
	};
	public int getCartId() {
		
		return this.cartid;
	}
	public int getProductID() {

		return this.product_id;
	}

	public int getCustomerID() {

		return this.Customer_ID;
	}

	public int getitems_TotalQuantity() {

		return this.items_TotalQuantity;
	}
	public int getitems_Quantity() {

		return this.items_Quantity;
	}

	public BigDecimal getItemsPrice() {

		return this.itemprice;

	}
	public double getTotalItemsPrice() {

		return this.total_itemsPrice;

	}

	public String getItemsName() {

		return this.items_Name;
	}
	public void setCartId(int cart_id) {
		this.cartid=cart_id;
	}
	public void setProductId(int product_id) {
		this.product_id = product_id;
	}

	public void setCustomerID(int Customer_ID) {
		this.Customer_ID = Customer_ID;
	}

	public void setItemsTotalQuantity(int items_TotalQuantity) {
		this.items_TotalQuantity = items_TotalQuantity;
	}
	public void setItemsQuantity(int items_Quantity) {
		this.items_Quantity = items_Quantity;
	}
	public void setItemsPrice(double items_Price) {
		this.itemprice = itemprice;
	}

	public void setItemsName(String items_Name) {
		this.items_Name = items_Name;
	}
	public void setTotalItemsPrice(double items_Price,int items_Quantity) {

		 this.total_itemsPrice = items_Price*items_Quantity;

	}
	
	
	public ShoppingCart_Vo( int product_id,
	 int Customer_ID,
	 String items_Name,
	int items_TotalQuantity,
	 int items_Quantity,
	 BigDecimal itemprice,
	 double total_itemsPrice
) {
		this.product_id = product_id;
		this.Customer_ID = Customer_ID;
		this.items_Name = items_Name;
		this.items_TotalQuantity = items_TotalQuantity;
		this.items_Quantity = items_Quantity;
		this.itemprice = itemprice;
		this.total_itemsPrice = itemprice.doubleValue()*items_Quantity;
	}

	public ShoppingCart_Vo(int cart_id,int product_id, String items_Name, int items_Quantity, BigDecimal items_Price) {
		// TODO Auto-generated constructor stub
		this.cartid=cart_id;
		this.product_id = product_id;
		this.items_Name = items_Name;
		this.items_Quantity = items_Quantity;
		this.itemprice = items_Price;
	}

	public ShoppingCart_Vo(int product_id, String items_Name, int items_Quantity, BigDecimal items_Price) {
	
		this.product_id = product_id;
		this.items_Name = items_Name;
		this.items_Quantity = items_Quantity;
		this.itemprice = items_Price;
	}
}
