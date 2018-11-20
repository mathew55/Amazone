package model;

import java.io.File;
import java.sql.Blob;

import javax.servlet.http.Part;

public class AddProduct {
	private int productID;
    private String productName;
    private String productDescription;
    private double productPrice;
    private int productQuantity;
    private String productManufacturer;
    //byte[]
    private Part inputFile;
   // private static final AtomicLong counter = new AtomicLong(100);


public AddProduct(String productName, String productDescription, double productPrice, int productQuantity, String productManufacturer, Part inputFile) {
    this.productName = productName;
    this.productDescription = productDescription;
    this.productPrice = productPrice;
    this.productQuantity = productQuantity;
    this.productManufacturer = productManufacturer;
    this.inputFile = inputFile;     
    // this.productID = productID;
   }

public AddProduct(String productName) {
 this.productName = productName;
}



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