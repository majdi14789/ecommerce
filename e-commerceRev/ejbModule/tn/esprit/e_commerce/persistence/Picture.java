package tn.esprit.e_commerce.persistence;

import java.io.Serializable;
import java.lang.String;
import java.sql.Blob;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;



/**
 * Entity implementation class for Entity: Picture
 * 
 */
@Entity
public class Picture implements Serializable {

	private int idPicture;

	private byte[] picture;
	private String description;
	private static final long serialVersionUID = 1L;
	private Product product;
	//private User user;

	public Picture() {
		super();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdPicture() {
		return this.idPicture;
	}

	public void setIdPicture(int idPicture) {
		this.idPicture = idPicture;
	}
	@Lob
	public byte[] getPicture() {
		return this.picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@ManyToOne
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

//	@OneToOne(cascade=CascadeType.PERSIST)
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}

}
