package model;

import java.math.BigDecimal;

public class CustomerHist {
	private int Hist_ID;
	private int product_ID;
	private int customer_ID;
	private String product_Name;
	private String customer_firstname;
	private String customer_lastname;
	private BigDecimal product_Price;
	private int product_Quantity;
	public int getHistID() {
		return this.Hist_ID;
	}

	public int getproductID() {
		return this.product_ID;
	}

	public int getcustomerID() {
		return this.customer_ID;
	}

	public String getproductName() {
		return this.product_Name;
	}
	
	public String getcustomer_firstname() {
		return this.customer_firstname;
	}
	public String getcustomer_lastname() {
		return this.customer_lastname;
	}
	public BigDecimal getproductPrice() {
		return this.product_Price;
	}

	public int getproductQuantity() {
		return this.product_Quantity;
	}

	public void setHistID(int Hist_ID) {
		this.Hist_ID = Hist_ID;
	}

	public void setproductID(int product_ID) {
		this.product_ID = product_ID;
	}

	public void setcustomerID(int customer_ID) {
		this.customer_ID = customer_ID;
	}

	public void setproductName(String product_Name) {
		this.product_Name = product_Name;
	}
	
	public void setcustomerfirstname(String customer_firstname) {
		this.customer_firstname = customer_firstname;
	}

	public void setcustomerlastname(String customer_lastname) {
		this.customer_lastname = customer_lastname;
	}

	public void setproductPrice(BigDecimal product_Price) {
		this.product_Price = product_Price;
	}

	public void setproductQuantity(int product_Quantity) {
		this.product_Quantity = product_Quantity;
	}
}
