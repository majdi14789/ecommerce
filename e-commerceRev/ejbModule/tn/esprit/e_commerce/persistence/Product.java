package tn.esprit.e_commerce.persistence;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Product
 *
 */

// ye majdi ye chbaya7
//haaaaa
@Entity

public class Product implements Serializable {

	
	private int idProduct;
	private String name;
	private String description;
	private int quantity;
	private float price;
	private double taxe;
	private String currency;
	private Date date;
	private Supplier supplier;
	private List<Picture> pictures;
	private Category category;
	private Promotion promotion;
	private List<OrderItem>orderItems;
	private List<Review> reviews;
	private List<Recommendation> recommendations;
	
	
	private static final long serialVersionUID = 1L;

	public Product() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getDescription() {
		return this.description;
	}

	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@ManyToOne
	public Promotion getPromotion() {
		return promotion;
	}
	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}
	
	@OneToMany(mappedBy="product")
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	
	
	@OneToMany(mappedBy="product")
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	
	
	@OneToMany(mappedBy="product")
	public List<Recommendation> getRecommendations() {
		return recommendations;
	}
	public void setRecommendations(List<Recommendation> recommendations) {
		this.recommendations = recommendations;
	}
	public void setDescription(String description) {
		this.description = description;
	}   
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}   
	
	public double getTaxe() {
		return this.taxe;
	}

	public void setTaxe(double taxe) {
		this.taxe = taxe;
	}   
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}   
	
	@ManyToOne
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	@OneToMany(mappedBy="product")
	public List<Picture> getPictures() {
		return pictures;
	}
	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}
	@ManyToOne
	public Category getCategory() {
		return category; 
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
   
}
