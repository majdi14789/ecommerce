package tn.esprit.e_commerce.persistence;

import java.io.Serializable;
import java.util.Date;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: CreditCard
 *
 */
@Entity

public class CreditCard implements Serializable {

	
	private int idCreditCard;
	private String type;
	private Date validity;
	private String code;
	private static final long serialVersionUID = 1L;

	
	//***************
	
	private Customer customer;
	//****************
	
	public CreditCard() {
		super();
	}   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	public int getIdCreditCard() {
		return this.idCreditCard;
	}

	public void setIdCreditCard(int idCreditCard) {
		this.idCreditCard = idCreditCard;
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}   
	public Date getValidity() {
		return this.validity;
	}

	public void setValidity(Date validity) {
		this.validity = validity;
	}   
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	@ManyToOne
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
   
	
}
