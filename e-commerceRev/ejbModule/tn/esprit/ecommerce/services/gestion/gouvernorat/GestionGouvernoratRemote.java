package tn.esprit.ecommerce.services.gestion.gouvernorat;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.e_commerce.persistence.Gouvernorat;

@Remote
public interface GestionGouvernoratRemote {
	boolean addGouvernorat(Gouvernorat gouvernorat);

	 boolean updategouvernorat(Gouvernorat gouvernorat);

	 boolean deleteGouvernorat(Gouvernorat gouvernorat);

	 Gouvernorat findGouvernoratById(int idGouvernorat);

	 List<Gouvernorat> findAllGouvernorat();
}
