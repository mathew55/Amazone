package model;

public class Product{
	public static int product_ID;
	public String product_Name = new String();
	public String product_Manufacturer = new String();
	public double product_Price;
	public static int product_Quantity;
	public int flag;
	public Product(int pid,String product_Name,String product_Manufacturer,double product_Price,int product_Quantity,int flag)
	{
		this.product_ID = pid;
		this.product_Name = product_Name;
		this.product_Manufacturer = product_Manufacturer;
		this.product_Price=product_Price;
		this.product_Quantity=product_Quantity;
		this.flag = flag;
	}
	public Product() {
	
	}
	public static int getpid() {
		return product_ID;
	}
	public static int getquantityavailable() {
		return product_Quantity;
	}
}
