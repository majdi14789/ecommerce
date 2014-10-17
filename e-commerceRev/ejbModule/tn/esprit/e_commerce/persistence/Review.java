package tn.esprit.e_commerce.persistence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Review
 *
 */
@Entity

public class Review implements Serializable {

	private ReviewPK reviewPK;
	private Product product;
	private Customer customer;
	private String comment;
	private static final long serialVersionUID = 1L;

	public Review() {
		super();
	}   
	@EmbeddedId
	public ReviewPK getReviewPK() {
		return reviewPK;
	}

	public void setReviewPK(ReviewPK reviewPK) {
		this.reviewPK = reviewPK;
	}

	
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	@ManyToOne
	@JoinColumn(name="idProduct",referencedColumnName="idProduct",insertable=false,updatable=false)
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@ManyToOne
	@JoinColumn(name="idCustomer",referencedColumnName="idUser",insertable=false,updatable=false)
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
   
	
}
