package tn.esprit.ecommerce.services.gestion.gouvernorat;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.e_commerce.persistence.Gouvernorat;

@Local
public interface GestionGouvernoratLocal {

	
	boolean addGouvernorat(Gouvernorat gouvernorat);

	 boolean updategouvernorat(Gouvernorat gouvernorat);

	 boolean deleteGouvernorat(Gouvernorat gouvernorat);

	 Gouvernorat findGouvernoratById(int idGouvernorat);

	 List<Gouvernorat> findAllGouvernorat();
}
