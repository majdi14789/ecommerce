package tn.esprit.e_commerce.persistence;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User implements Serializable {

	
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", login=" + login + ", password="
				+ password + ", firstName=" + firstName + ", lastName="
				+ lastName + ", addresses=" + addresses + ", blocked="
				+ blocked + ", email=" + email + "]";
	}
	private int idUser;
	private String login;
	private String password;
	private String firstName;
	private String lastName;
	private List<Address> addresses;
	private boolean blocked;
	private String email;
	private Picture picture;
	private char sexe;
	
	private List<Reclamation> reclamations; 
	
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}   
	@Id   
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}   
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}   
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}   
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public boolean isBlocked() {
		return blocked;
	}
	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idPicture")
	public Picture getPicture() {
		return picture;
	}
	public void setPicture(Picture picture) {
		this.picture = picture;
	}
	public User(String login, String password, String firstName,
			String lastName, boolean blocked, String email) {
		super();
		this.login = login;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.blocked = blocked;
		this.email = email;
	}
	public char getSexe() {
		return sexe;
	}
	public void setSexe(char sexe) {
		this.sexe = sexe;
	}
	
	@OneToMany(mappedBy="user")
	public List<Reclamation> getReclamations() {
		return reclamations;
	}
	public void setReclamations(List<Reclamation> reclamations) {
		this.reclamations = reclamations;
	}
	
	
   
}
