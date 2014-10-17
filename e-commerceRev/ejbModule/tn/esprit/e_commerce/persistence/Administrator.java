package tn.esprit.e_commerce.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import tn.esprit.e_commerce.persistence.User;

/**
 * Entity implementation class for Entity: Administrator
 *
 */
@Entity
@DiscriminatorValue(value="Administrateur")
public class Administrator extends User implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Administrator() {
		super();
	}
  
}
