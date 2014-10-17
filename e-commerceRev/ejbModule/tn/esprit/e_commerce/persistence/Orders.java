package tn.esprit.e_commerce.persistence;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Orders
 *
 */
@Entity

public class Orders implements Serializable {

	
	private int idOrder;
	private Date orderDate;
	private float totalAmount;
	private boolean stateOrder;
	private Address deleveryAddress;
	private String paymentMethod;
	private List<OrderItem> orderItems;
	private Customer customer;
	private Commision commision;
	private static final long serialVersionUID = 1L;

	public Orders() {
		super();
	}   
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdOrder() {
		return this.idOrder;
	}

	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}   
	
	public boolean getStateOrder() {
		return this.stateOrder;
	}

	public void setStateOrder(boolean stateOrder) {
		this.stateOrder = stateOrder;
	}   
	public Address getDeleveryAddress() {
		return this.deleveryAddress;
	}

	public void setDeleveryAddress(Address deleveryAddress) {
		this.deleveryAddress = deleveryAddress;
	}   
	public String getPaymentMethod() {
		return this.paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	@Temporal(TemporalType.DATE)
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	@OneToMany(mappedBy="order")
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	@ManyToOne
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Commision getCommision() {
		return commision;
	}
	public void setCommision(Commision commision) {
		this.commision = commision;
	}
	
   
}
