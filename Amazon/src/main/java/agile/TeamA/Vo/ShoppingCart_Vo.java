package agile.TeamA.Vo;


public class ShoppingCart_Vo {
	private int product_id;
	private int Customer_id;
	private int items_Quantity;
	private String items_Name;
	private double itemprice;
	private int cartid;
	
	public ShoppingCart_Vo() {
	};
	
	public int getCartId() {
		
		return this.cartid;
	}
	
	public void setCartId(int cart_id) {
		this.cartid=cart_id;
	}
	
	public int getProductID() {

		return this.product_id;
	}
	
	public void setProductId(int product_id) {
		this.product_id = product_id;
	}
	
	public int getCustomerID() {

		return this.Customer_id;
	}
	
	public void setCustomerID(int Customer_id) {
		this.Customer_id = Customer_id;
	}
	
	
	public int getitems_Quantity() {

		return this.items_Quantity;
	}
	
	public void setItemsQuantity(int items_Quantity) {
		this.items_Quantity = items_Quantity;
	}
	
	public double getItemsPrice() {

		return this.itemprice;

	}
	
	public void setItemsPrice(double items_Price) {
		this.itemprice = items_Price;
	}
	
	/*public double getTotalItemsPrice() {

		return this.TotalItemsPrice;

	}*/
	
/*	public void setTotalItemsPrice(double TotalItemsPrice) {
		this.TotalItemsPrice = TotalItemsPrice;
	}
*/
	public String getItemsName() {

		return this.items_Name;
	}
	
	public void setItemsName(String items_Name) {
		this.items_Name = items_Name;
	}

	
	public ShoppingCart_Vo(int Customer_id,int product_id, String items_Name, double items_Price, int items_Quantity) {
		// TODO Auto-generated constructor stub
		this.Customer_id=Customer_id;
		this.product_id = product_id;
		this.items_Name = items_Name;
		this.itemprice = items_Price;
		this.items_Quantity = items_Quantity;
	}


	public ShoppingCart_Vo(int product_id, String items_Name, double items_Price, int items_Quantity) {	
		this.product_id = product_id;
		this.items_Name = items_Name;
		this.items_Quantity = items_Quantity;
		this.itemprice = items_Price;
	}
}
