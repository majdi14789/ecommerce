package tn.esprit.e_commerce.persistence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Reclamation
 * 
 */
@Entity
public class Reclamation implements Serializable {

	private int idReclamation;
	private String message;
	private String subject;
	private boolean status;
	private static final long serialVersionUID = 1L;

	private User user;

	public Reclamation() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdReclamation() {
		return this.idReclamation;
	}

	public void setIdReclamation(int idReclamation) {
		this.idReclamation = idReclamation;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@ManyToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	

}
