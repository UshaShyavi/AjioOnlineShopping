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
@Document(collection = "Cart")
public class Cart {
    @Id
    private String product;
    private String price;
    
    @Override
    public String toString() {
        return "Cart [product=" + product + ", price=" + price +  "]";
    }
   
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
	this.product = product;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

   
    
    
   
}
