package tn.esprit.e_commerce.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class ReviewPK implements Serializable {

	private Date dateReview;
	private int idCustomer;
	private int idProduct;

	private static final long serialVersionUID = -1003161868773667303L;

	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateReview() {
		return dateReview;
	}

	public void setDateReview(Date dateReview) {
		this.dateReview = dateReview;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateReview == null) ? 0 : dateReview.hashCode());
		result = prime * result + idCustomer;
		result = prime * result + idProduct;
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
		ReviewPK other = (ReviewPK) obj;
		if (dateReview == null) {
			if (other.dateReview != null)
				return false;
		} else if (!dateReview.equals(other.dateReview))
			return false;
		if (idCustomer != other.idCustomer)
			return false;
		if (idProduct != other.idProduct)
			return false;
		return true;
	}

}
