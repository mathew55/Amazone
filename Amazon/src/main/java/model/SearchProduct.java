package model;

public class SearchProduct {

	private String productName;
	public SearchProduct() {}
	
	public SearchProduct(String productName) {
		
		this.productName = productName;
		
	}
	public String GetProductName() {
		
		return this.productName;
	}
	
	public String setProductName(String productName) {
		return this.productName = productName;
	}
	
}
