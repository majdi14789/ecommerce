package tn.esprit.e_commerce.persistence;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Gouvernorat
 * 
 */
@Entity
public class Gouvernorat implements Serializable {

	private int idGouvernorat;
	private String gouvernoratName;
	private List<Address> addresses;
	private static final long serialVersionUID = 1L;

	public Gouvernorat() {
		super();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdGouvernorat() {
		return this.idGouvernorat;
	}

	public void setIdGouvernorat(int idGouvernorat) {
		this.idGouvernorat = idGouvernorat;
	}

	public String getGouvernoratName() {
		return this.gouvernoratName;
	}

	public void setGouvernoratName(String gouvernoratName) {
		this.gouvernoratName = gouvernoratName;
	}

	@OneToMany(mappedBy = "gouvernorat")
	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

}
