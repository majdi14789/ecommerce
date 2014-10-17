package tn.esprit.ecommerce.services.gestion.commsion;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.e_commerce.persistence.Commision;

@Local
public interface GestionCommisionLocal {
	 boolean addCommision(Commision commision);

	 boolean updatecommision(Commision commision);

	 boolean deleteCommision(Commision commision);

	 Commision findCommisionById(int idCommision);

	 List<Commision> findAllCommision();
}
