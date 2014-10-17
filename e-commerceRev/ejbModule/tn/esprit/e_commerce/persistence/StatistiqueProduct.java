package tn.esprit.e_commerce.persistence;

import java.io.Serializable;

public class StatistiqueProduct implements Serializable{
	 
	private Product product;
	private Promotion promotion;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Promotion getPromotion() {
		return promotion;
	}
	public void setPromotion(Promotion result) {
		this.promotion = result;
	}
}
