package tn.esprit.ecommerce.services.gestion.commsion;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.e_commerce.persistence.Commision;

@Remote
public interface GestionCommisionRemote {
	boolean addCommision(Commision commision);

	 boolean updatecommision(Commision commision);

	 boolean deleteCommision(Commision commision);

	 Commision findCommisionById(int idCommision);

	 List<Commision> findAllCommision();
}
