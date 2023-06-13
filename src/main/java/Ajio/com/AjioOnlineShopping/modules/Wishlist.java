/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ajio.com.AjioOnlineShopping.modules;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Shyavi
 */
@Document(collection = "wishlist")
public class Wishlist {
    
  
    private String product;
    private double price;
   
    public String getProduct() {
	return product;
    }
    public void setProduct(String product) {
	this.product = product;
    }
    
   
    public double getPrice() {
	return price;
    }
    public void setPrice(double price) {
	this.price = price;
    }
    
    
    @Override
    public String toString() {
        return "Wishlist [product=" + product +, price=" + price + "]";
    }
    public Wishlist(String id, String productName, String productCategory, String image, double price, String productId) {
        super();
	this.product = product;
	this.price = price;
    }
    public Wishlist() {
	super();
	// TODO Auto-generated constructor stub
    }

    public void setProductName(String productName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setProductId(String productId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setImage(String image) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}