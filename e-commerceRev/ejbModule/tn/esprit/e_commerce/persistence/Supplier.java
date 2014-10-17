package tn.esprit.e_commerce.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import tn.esprit.e_commerce.persistence.User;

/**
 * Entity implementation class for Entity: Supplier
 *
 */
@Entity
@DiscriminatorValue(value="supplier")
public class Supplier extends User implements Serializable {

	private List<Product> products;
	private static final long serialVersionUID = 1L;

	public Supplier() {
		super();
	}
	@OneToMany(mappedBy="supplier")
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
   
}
