package tn.esprit.e_commerce.persistence;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ProductItem
 * 
 */
@Entity
public class ProductItem implements Serializable {
	private ProductItemPk productItemPk;

	private int quantity;

	private static final long serialVersionUID = 1L;

	private Product product;
	private ParticularVendor particularVendor;

	public ProductItem() {
		super();
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@EmbeddedId
	public ProductItemPk getProductItemPk() {
		return productItemPk;
	}

	public void setProductItemPk(ProductItemPk productItemPk) {
		this.productItemPk = productItemPk;
	}

	@ManyToOne
	@JoinColumn(name = "idProduct", referencedColumnName = "idProduct", insertable = false, updatable = false)
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@ManyToOne
	@JoinColumn(name = "idParticularVendor", referencedColumnName = "idUser", insertable = false, updatable = false)
	public ParticularVendor getParticularVendor() {
		return particularVendor;
	}

	public void setParticularVendor(ParticularVendor particularVendor) {
		this.particularVendor = particularVendor;
	}

}
