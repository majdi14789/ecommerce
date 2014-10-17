package tn.esprit.e_commerce.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;



@Embeddable
public class ProductItemPk implements Serializable {

	private int idParticularVendor;
	private int idProduct;
	private Date dateSupplied;
	
	
	private static final long serialVersionUID = -1173754073386632747L;


	public int getIdParticularVendor() {
		return idParticularVendor;
	}


	public void setIdParticularVendor(int idParticularVendor) {
		this.idParticularVendor = idParticularVendor;
	}


	public int getIdProduct() {
		return idProduct;
	}


	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}


	public Date getDateSupplied() {
		return dateSupplied;
	}


	public void setDateSupplied(Date dateSupplied) {
		this.dateSupplied = dateSupplied;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateSupplied == null) ? 0 : dateSupplied.hashCode());
		result = prime * result + idParticularVendor;
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
		ProductItemPk other = (ProductItemPk) obj;
		if (dateSupplied == null) {
			if (other.dateSupplied != null)
				return false;
		} else if (!dateSupplied.equals(other.dateSupplied))
			return false;
		if (idParticularVendor != other.idParticularVendor)
			return false;
		if (idProduct != other.idProduct)
			return false;
		return true;
	}

}
