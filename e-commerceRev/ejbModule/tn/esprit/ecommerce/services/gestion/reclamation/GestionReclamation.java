package tn.esprit.ecommerce.services.gestion.reclamation;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.e_commerce.persistence.Reclamation;

/**
 * Session Bean implementation class GestionReclamation
 */
@Stateless
@LocalBean
public class GestionReclamation implements GestionReclamationRemote,
		GestionReclamationLocal {

	@PersistenceContext
	EntityManager em;

	public GestionReclamation() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addReclamation(Reclamation reclamation) {

		em.persist(reclamation);

		return false;
	}

	@Override
	public boolean deleteReclamation(Reclamation reclamation) {

		em.remove(em.merge(reclamation));
		return false;
	}

	@Override
	public List<Reclamation> findAllReclamations() {
		Query query = em.createQuery("select r from Reclamation r");
		return query.getResultList();

	}

	@Override
	public List<Reclamation> findAllReclamationsTraites() {
		Query query = em
				.createQuery("select r from Reclamation r where r.status=:m");
		query.setParameter("m", true);
		return query.getResultList();

	}

	@Override
	public List<Reclamation> findAllReclamationsNonTraites() {
		Query query = em
				.createQuery("select r from Reclamation r where r.status=:k");
		query.setParameter("k", false);
		return query.getResultList();
	}

	@Override
	public boolean updateReclamation(Reclamation reclamation) {
		em.merge(reclamation);
		return true;
	}

}
