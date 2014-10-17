package tn.esprit.ecommerce.services.gestion.product;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;

import tn.esprit.e_commerce.persistence.Picture;
import tn.esprit.e_commerce.persistence.Product;

@Remote
public interface GestionProductRemote {
	boolean addProduct(Product product);

	boolean updateProduct(Product product);

	boolean deleteProduct(Product product);

	Product findProductById(int idProduct);

	List<Product> findAllProducts();
	
	
	
		
    List<Product> findProductInDiscount();
    List<Product> findProductbyName(String name);

    List<Product> findProductByCategorie(String categoryName);
	List<Product> findProductByDate(Date date);
	List<Product> findProductByPriceInterval(float priceDebut, float priceFin);
    List<Picture> findAllProductPictures(int idProduct);

    
	List<Product> findProductByAllCriteria(String categoryName,String productName,float priceDebut,float priceFin, Date date,boolean inDiscount );

}
