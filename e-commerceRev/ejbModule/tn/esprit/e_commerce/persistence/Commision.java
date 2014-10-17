package tn.esprit.e_commerce.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Commision
 *
 */
@Entity

public class Commision implements Serializable {

	
	private int idCommision;
	private double amount;
	
	private Date dateCommision;
	private double taux;
	
	
	
	private Orders orders;
	
	private static final long serialVersionUID = 1L;

	public Commision() {
		super();
	}   
	@Id   
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdCommision() {
		return this.idCommision;
	}

	public void setIdCommision(int idCommision) {
		this.idCommision = idCommision;
	}   
	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDateCommision() {
		return dateCommision;
	}
	public void setDateCommision(Date dateCommision) {
		this.dateCommision = dateCommision;
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	@OneToOne
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
   
}
