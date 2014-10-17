package tn.esprit.e_commerce.persistence;

import java.io.Serializable;

public class StatistiqueOrderItem implements Serializable{
	
	private Product product;
	private Long quantity;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product result) {
		this.product = result;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	
	

}
