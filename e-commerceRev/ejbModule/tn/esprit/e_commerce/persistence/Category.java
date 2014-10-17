package tn.esprit.e_commerce.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Category
 *
 */
@Entity

public class Category implements Serializable {

	
	private int idCategory;
	private String name;
	private List<Product> products;
	
	private static final long serialVersionUID = 1L;

	public Category() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdCategory() {
		return this.idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@OneToMany(mappedBy="category")
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
   
}
