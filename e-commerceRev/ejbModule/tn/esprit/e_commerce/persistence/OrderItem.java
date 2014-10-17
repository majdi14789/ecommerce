package tn.esprit.e_commerce.persistence;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: OrderItem
 *
 */
@Entity
public class OrderItem implements Serializable {

	
	private int idOrderItem;
	private int quantity;
	private static final long serialVersionUID = 1L;

	
	//***********************
	
	private Orders order;
	private Product product;
	
	private ProductItemSupplier productItemSupplier;
	
	//****************
	public OrderItem() {
		super();
	}   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	public int getIdOrderItem() {
		return this.idOrderItem;
	}

	public void setIdOrderItem(int idOrderItem) {
		this.idOrderItem = idOrderItem;
	}   
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	@ManyToOne
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	}
	 @ManyToOne
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@ManyToOne
	public ProductItemSupplier getProductItemSupplier() {
		return productItemSupplier;
	}
	public void setProductItemSupplier(ProductItemSupplier productItemSupplier) {
		this.productItemSupplier = productItemSupplier;
	}
	
	
	
	
   
	
	
}
