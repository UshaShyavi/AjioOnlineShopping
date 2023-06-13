package Ajio.com.AjioOnlineShopping;


import Ajio.com.AjioOnlineShopping.Repository.ProductRepositroy;
import Ajio.com.AjioOnlineShopping.Repository.UserRepository;
import Ajio.com.AjioOnlineShopping.Repository.WishlistRepository;
import Ajio.com.AjioOnlineShopping.Repository.cartrepository;
import Ajio.com.AjioOnlineShopping.modules.Cart;
import Ajio.com.AjioOnlineShopping.modules.Product;
import Ajio.com.AjioOnlineShopping.modules.User;
import Ajio.com.AjioOnlineShopping.modules.Wishlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shyavi
 */
@Controller
public class AjioController {
    
    @Autowired
    private UserRepository userrepo;
    
    @Autowired
    private ProductRepositroy product_repo; 
    
    @Autowired
    private cartrepository cart_repo;
    
    @Autowired
    private WishlistRepository wishlist_repo ;
    
    @RequestMapping("/index")
    public String index(){
        return "index";
        
    }
    
    @RequestMapping(value="/login", method= RequestMethod.POST)
    public String Login(@RequestParam String email, @RequestParam String password){
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        userrepo.save(user);
        return "Mainpage";
    }
    
    @RequestMapping("/cart")
    public String cart(@RequestParam String product, @RequestParam String price){
        Cart cart = new Cart();
        cart.setProduct(product);
        cart.setPrice(price);
        cart_repo.save(cart);
        return "Mainpage";
    }
    
    @RequestMapping("/Product")
    public String Product(@RequestParam String productName, @RequestParam String PId){
        Product product = new Product();
        product.setProductName(productName);
        product.setPid(PId);
        product_repo.save(product);
        return "Mainpage";
    }
    
    
    @RequestMapping("/wishlist")
    public String Wishlist(@RequestParam String productName, @RequestParam String productId){ 
    	Wishlist wishlist = new Wishlist();
        wishlist.setProductName(productName);
        wishlist.setProductId(productId);
        Wishlist save = wishlist_repo .save(wishlist);
        return "Mainpage";
    }
    
    
    @RequestMapping(value="/addwishlist", method = RequestMethod.POST)
    public String addToWishlist(@RequestParam("productId") String productId) {
        // Retrieve the product from the ProductRepository using the product ID
        Product product = product_repo.findById(productId).orElse(null);

        if (product != null) {
            // Create a new CartItem and save it to the CartRepository
            Wishlist wishlist = new Wishlist();
            wishlist.setProductId(productId);
            wishlist.setImage(product.getImage());
            wishlist.setProductName(product.getProductName());
            wishlist.setPrice(product.getPrice());
            this.wishlist_repo.save(wishlist);
        }
            return "successwishlist";
       
    }
    
    
    @RequestMapping("/homepage")
    public String homepage(){
        return "homepage";
    }
    @RequestMapping("/Account")
    public String Account(){
        return "Account";
    }
    @RequestMapping("/Chat")
    public String Chat(){
        return "Chat";
    }
    @RequestMapping("/Indie")
    public String Indie(){
        return "Indie";
    }
    @RequestMapping("/Login")
    public String Login(){
        return "Login";
    }
    @RequestMapping("/Mainpage")
    public String Mainpage(){
        return "Mainpage";
    }
    @RequestMapping("/Women")
    public String Women(){
        return "Women";
    }
    
    @RequestMapping("/homekitchen")
    public String homekitchen(){
        return "homekitchen";
    }
    @RequestMapping("/homekitchen1")
    public String homekitchen1(){
        return "homekitchen1";
    }
    @RequestMapping("/indiepage1")
    public String indiepage1(){
        return "indiepage1";
    }
    @RequestMapping("/kidpage1")
    public String kidpage1(){
        return "kidpage1";
    }
    @RequestMapping("/men")
    public String men(){
        return "men";
    }
    @RequestMapping("/order")
    public String order(){
        return "order";
    }
    @RequestMapping("/paymentpage")
    public String paymentpage(){
        return "paymentpage";
    }
    @RequestMapping("/profile")
    public String profile(){
        return "profile";
    }
   
    @RequestMapping("/womenpage1")
    public String womenpage1(){
        return "womenpage1";
    }
    @RequestMapping("/Kids")
    public String Kids(){
        return "Kids";
    }
}
