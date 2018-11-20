package model;

public class DashboardProduct {
	private String productName;
	private double productPrice;
    private int productQuantity;
    private String productManufacturer;
    
    
    public DashboardProduct() {
    	  
       }
    
  
    public String setProductName(String name) {
    	return this.productName=name;
    }

  
    public double setProductPrice(double price){
    	return this.productPrice=price;
    }

    public int setProductQuantity(int quantity) {
    	return this.productQuantity=quantity;
    }

    public String setProductManufacturer(String manu) {
    	return this.productManufacturer=manu;
    }


    public String getProductName() {
    	return productName;
    }

  
    public double getProductPrice() {
    	return productPrice;
    }

    public int getProductQuantity() {
    	return productQuantity;
    }

    public String getProductManufacturer() {
    	return productManufacturer;
    }

}
