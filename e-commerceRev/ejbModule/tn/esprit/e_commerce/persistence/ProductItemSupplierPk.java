package tn.esprit.e_commerce.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;


@Embeddable
public class ProductItemSupplierPk implements Serializable{

	private int idSupplier;
	private int idProduct;
	private Date date;
	
	
	
	
	private static final long serialVersionUID = 1L;




	public int getIdSupplier() {
		return idSupplier;
	}




	public void setIdSupplier(int idSupplier) {
		this.idSupplier = idSupplier;
	}




	public int getIdProduct() {
		return idProduct;
	}




	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}




	public Date getDate() {
		return date;
	}




	public void setDate(Date date) {
		this.date = date;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + idProduct;
		result = prime * result + idSupplier;
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
		ProductItemSupplierPk other = (ProductItemSupplierPk) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (idProduct != other.idProduct)
			return false;
		if (idSupplier != other.idSupplier)
			return false;
		return true;
	}
	
	

}
