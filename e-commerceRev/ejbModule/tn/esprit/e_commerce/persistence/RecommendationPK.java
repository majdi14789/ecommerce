package tn.esprit.e_commerce.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Embeddable
public class RecommendationPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int idCustomer;
	private int idProduct;
	private Date dateRecommendation;
	
	
	
	
	public RecommendationPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	public RecommendationPK(int idCustomer, int idProduct, Date dateRecommendation) {
		super();
		this.idCustomer = idCustomer;
		this.idProduct = idProduct;
		this.dateRecommendation = dateRecommendation;
	}






	public int getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateRecommendation() {
		return dateRecommendation;
	}
	public void setDateRecommendation(Date dateRecommendation) {
		this.dateRecommendation = dateRecommendation;
	}






	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateRecommendation == null) ? 0 : dateRecommendation.hashCode());
		result = prime * result + idProduct;
		result = prime * result + idCustomer;
		return result;
	}






	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RecommendationPK other = (RecommendationPK) obj;
		if (dateRecommendation == null) {
			if (other.dateRecommendation != null)
				return false;
		} else if (!dateRecommendation.equals(other.dateRecommendation))
			return false;
		if (idProduct != other.idProduct)
			return false;
		if (idCustomer != other.idCustomer)
			return false;
		return true;
	}
	
	
	
	
	
	
}
