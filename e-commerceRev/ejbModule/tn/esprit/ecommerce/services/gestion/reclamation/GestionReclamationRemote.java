package tn.esprit.ecommerce.services.gestion.reclamation;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.e_commerce.persistence.Address;
import tn.esprit.e_commerce.persistence.Reclamation;

@Remote
public interface GestionReclamationRemote {

	boolean addReclamation(Reclamation reclamation);

	boolean updateReclamation(Reclamation reclamation);

	boolean deleteReclamation(Reclamation reclamation);

	List<Reclamation> findAllReclamationsTraites();

	List<Reclamation> findAllReclamationsNonTraites();

	List<Reclamation> findAllReclamations();

}
