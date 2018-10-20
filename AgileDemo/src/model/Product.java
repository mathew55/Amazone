package model;

import java.io.File;
import java.sql.Blob;

import javax.servlet.http.Part;

public class Product {
	private int productID;
    private String productName;
    private String productDescription;
    private double productPrice;
    private int productQuantity;
    private String productManufacturer;
    //byte[]
    private Part inputFile;
   // private static final AtomicLong counter = new AtomicLong(100);


public Product(String productName, String productDescription, double productPrice, int productQuantity, String productManufacturer, Part inputFile) {
    this.productName = productName;
    this.productDescription = productDescription;
    this.productPrice = productPrice;
    this.productQuantity = productQuantity;
    this.productManufacturer = productManufacturer;
    this.inputFile = inputFile;     
    // this.productID = productID;
   }

public Product(String productName) {
 this.productName = productName;
}

//public Product(String productDescription) {
	 //this.productDescription = productDescription;
	//}

//public Product(String productPrice) {
	// this.productPrice = productPrice;
	//}


//public Product(String productQuantity) {
	// this.productQuantity = productQuantity;
	//}

//public Product(String productManufacturer) {
	// this.productManufacturer = productManufacturer;
	//}




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

public double getProductPrice() {
	return productPrice;
}

public int getProductQuantity() {
	return productQuantity;
}

public String getProductManufacturer() {
	return productManufacturer;
}

public Part getInputFile() {
	return inputFile;
}

}