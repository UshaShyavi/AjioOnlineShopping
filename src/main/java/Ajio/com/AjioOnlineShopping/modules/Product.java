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
@Document(collection = "Product")
public class Product {
	
	@Id
	private String pid;
	private String productName;
	private String image;
	private String description;
	private String categoryName;
	private double price;
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
            this.image = image;
	}
        public String getDescription() {
            return description;
	}
	public void setDescription(String description) {
            this.description = description;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String getPid() {
            return pid;
        }
	public void setPid(String pid) {
            this.pid = pid;
	}
	public String getProductName() {
            return productName;
	}
	public void setProductName(String productName) {
            this.productName = productName;
	}
	public String getCategoryName() {
            return categoryName;
	}
	public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
	}
	public double getPrice() {
            return price;
	}
	public void setPrice(double price) {
            this.price = price;
	}
	@Override
	public String toString() {
            return "Product [pid=" + pid + ", productName=" + productName + ", image=" + image + ", description="
                    + description + ", categoryName=" + categoryName + ", price=" + price + "]";
        }  
}
    

