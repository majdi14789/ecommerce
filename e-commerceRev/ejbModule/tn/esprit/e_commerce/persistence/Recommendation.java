package tn.esprit.e_commerce.persistence;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Recommendation
 *
 */
@Entity
public class Recommendation implements Serializable {

	   
	
	//private int idRecommendation;
	private String Object;
	private static final long serialVersionUID = 1L;

	
	
	//*********************************************
	private Customer customer;
	private String Email;
	private Product product;
	private RecommendationPK recommendationPK;
	
	//*******************************************
	
	public Recommendation() {
		super();
	}   
	
	
	
	public Recommendation(String object, Customer customer, String email,
			Product product, RecommendationPK recommendationPK, Date date) {
		super();
		this.Object = object;
		this.customer = customer;
		this.Email = email;
		this.product = product;
		this.recommendationPK = new RecommendationPK(customer.getIdUser(), product.getIdProduct(), date);
	}





	public String getObject() {
		return this.Object;
	}

	public void setObject(String Object) {
		this.Object = Object;
	}
   
	
	
	
	
	@ManyToOne
	@JoinColumn(name="idCustomer",referencedColumnName="idUser",insertable=false,updatable=false)

	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	@ManyToOne
	@JoinColumn(name="idProduct",referencedColumnName="idProduct",insertable=false,updatable=false)

	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}


    @EmbeddedId
	public RecommendationPK getRecommendationPK() {
		return recommendationPK;
	}



	public void setRecommendationPK(RecommendationPK recommendationPK) {
		this.recommendationPK = recommendationPK;
	}

	
}
