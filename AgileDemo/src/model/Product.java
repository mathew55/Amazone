package model;

public class Product {
	private int productID;
    private String productName;
    private String productDescription;
    private Float productPrice;
    private int productQuantity;
    private String productManufacturer;
   // private String inputFile;
   // private static final AtomicLong counter = new AtomicLong(100);


public Product(String productName, String productDescription, Float productPrice, int productQuantity, String productManufacturer, int productID) {
    this.productName = productName;
    this.productDescription = productDescription;
    this.productPrice = productPrice;
    this.productQuantity = productQuantity;
    this.productManufacturer = productManufacturer;
   // this.inputFile = inputFile;     
    this.productID = productID;
   }

public Product(String productName) {
 this.productName = productName;
}

//public Product(String productName, String productDescription, Float productPrice, int productQuantity, String productManufacturer, String inputFile) {
   // this.productName = productName;
    //this.productDescription = productDescription;
    //this.productPrice = productPrice;
    //this.productQuantity = productQuantity;
   // this.productManufacturer = productManufacturer;
    //this.inputFile = inputFile;     
    //this.productID = counter.incrementAndGet();
//}


public int getProductId() {
	return productID;
}

public String getProductName() {
	return productName;
}

public String getProductDescription() {
	return productDescription;
}

public float getProductPrice() {
	return productPrice;
}

public int getProductQuantity() {
	return productQuantity;
}

public String getProductManufacturer() {
	return productManufacturer;
}

}