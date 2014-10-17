package tn.esprit.e_commerce.persistence;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ProductItemSupplier
 * 
 */
@Entity
public class ProductItemSupplier implements Serializable {

	private ProductItemSupplierPk productItemSupplierPk;
	private Product product;
	private Supplier supplier;

	private int quantity;
	private static final long serialVersionUID = 1L;

	public ProductItemSupplier() {
		super();
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@EmbeddedId
	public ProductItemSupplierPk getProductItemSupplierPk() {
		return productItemSupplierPk;
	}

	public void setProductItemSupplierPk(
			ProductItemSupplierPk productItemSupplierPk) {
		this.productItemSupplierPk = productItemSupplierPk;
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
	@JoinColumn(name = "idSupplier", referencedColumnName = "idUser", insertable = false, updatable = false)
	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

}
