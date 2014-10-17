package tn.esprit.e_commerce.persistence;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ShoppingCart
 *
 */
@Entity

public class ShoppingCart implements Serializable {

	
	private int idShoppingCart;
	private double totalShoppingCart;
	private String currency;
	private boolean stateShoppingCart;
	private static final long serialVersionUID = 1L;

	public ShoppingCart() {
		super();
	}   
	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdShoppingCart() {
		return this.idShoppingCart;
	}

	public void setIdShoppingCart(int idShoppingCart) {
		this.idShoppingCart = idShoppingCart;
	}   
	public double getTotalShoppingCart() {
		return this.totalShoppingCart;
	}

	public void setTotalShoppingCart(double totalShoppingCart) {
		this.totalShoppingCart = totalShoppingCart;
	}   
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}   
	public boolean getStateShoppingCart() {
		return this.stateShoppingCart;
	}

	public void setStateShoppingCart(boolean stateShoppingCart) {
		this.stateShoppingCart = stateShoppingCart;
	}
   
}
