package tn.esprit.ecommerce.services.gestion.gouvernorat;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.e_commerce.persistence.Gouvernorat;

/**
 * Session Bean implementation class GestionGouvernorat
 */
@Stateless
public class GestionGouvernorat implements
		GestionGouvernoratRemote, GestionGouvernoratLocal {
	@PersistenceContext
	EntityManager entityManager;

	public GestionGouvernorat() {
	}

	@Override
	public boolean addGouvernorat(Gouvernorat gouvernorat) {
		entityManager.persist(gouvernorat);
		return true;
	}

	@Override
	public boolean updategouvernorat(Gouvernorat gouvernorat) {
		entityManager.merge(gouvernorat);
		return true;
	}

	@Override
	public boolean deleteGouvernorat(Gouvernorat gouvernorat) {
		entityManager.remove(entityManager.merge(gouvernorat));
		return true;
	}

	@Override
	public Gouvernorat findGouvernoratById(int idGouvernorat) {

		return entityManager.find(Gouvernorat.class, idGouvernorat);
	}

	@Override
	public List<Gouvernorat> findAllGouvernorat() {
		Query query = entityManager.createQuery("select a from Gouvernorat a");
		return query.getResultList();
	}

}
