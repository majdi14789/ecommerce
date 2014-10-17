package tn.esprit.ecommerce.services.gestion.reclamation;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.e_commerce.persistence.Reclamation;

@Local
public interface GestionReclamationLocal {
	
	boolean addReclamation(Reclamation reclamation);

	boolean deleteReclamation(Reclamation reclamation);

	List<Reclamation> findAllReclamations();
	
	List<Reclamation> findAllReclamationsTraites();

	List<Reclamation> findAllReclamationsNonTraites();

}
