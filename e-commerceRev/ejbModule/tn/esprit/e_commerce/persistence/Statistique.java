package tn.esprit.e_commerce.persistence;

import java.io.Serializable;

public class Statistique implements Serializable{

	
private Customer customer;
private Double totalAmount;

public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public Double getTotalAmount() {
	return totalAmount;
}

public void setTotalAmount(Double totalAmount) {
this.totalAmount=totalAmount;
	
}

}
