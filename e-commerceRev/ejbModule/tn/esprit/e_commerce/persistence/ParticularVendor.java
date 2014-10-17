package tn.esprit.e_commerce.persistence;

import java.io.Serializable;

import javax.persistence.*;

import tn.esprit.e_commerce.persistence.Customer;

/**
 * Entity implementation class for Entity: ParticularVendor
 *
 */
@Entity
@DiscriminatorValue(value="particularVendor")
public class ParticularVendor extends Customer implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public ParticularVendor() {
		super();
	}
   
}
