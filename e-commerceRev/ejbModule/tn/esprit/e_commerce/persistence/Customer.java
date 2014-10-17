package tn.esprit.e_commerce.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import tn.esprit.e_commerce.persistence.User;

/**
 * Entity implementation class for Entity: Customer
 *
 */
@Entity

public class Customer extends User implements Serializable {

	
	
	
	private static final long serialVersionUID = 1L;

	
	private List<Review> reviews;
	
	//*************************************
    private List<Orders> orders;	
    private List<Recommendation>recommendations;
    private List<CreditCard> creditCards;

	
	//********************************
	
	public Customer() {
		super();
	}


	
	@OneToMany(mappedBy="customer")
	public List<Review> getReviews() {
		return reviews;
	}


	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}


	@OneToMany(mappedBy="customer")
	public List<Orders> getOrders() {
		return orders;
	}



	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}


	@OneToMany(mappedBy="customer")

	public List<Recommendation> getRecommendations() {
		return recommendations;
	}



	public void setRecommendations(List<Recommendation> recommendations) {
		this.recommendations = recommendations;
	}


	@OneToMany(mappedBy="customer")

	public List<CreditCard> getCreditCards() {
		return creditCards;
	}



	public void setCreditCards(List<CreditCard> creditCards) {
		this.creditCards = creditCards;
	}
   
	public Customer(String login, String password, String firstName,
			String lastName, boolean blocked, String email) {
		super(login, password, firstName, lastName, blocked, email);
		// TODO Auto-generated constructor stub
	}


	
	
}
