/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ajio.com.AjioOnlineShopping.Repository;

import Ajio.com.AjioOnlineShopping.modules.Wishlist;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Shyavi
 */
public interface WishlistRepository  extends MongoRepository<Wishlist, String> {

}
