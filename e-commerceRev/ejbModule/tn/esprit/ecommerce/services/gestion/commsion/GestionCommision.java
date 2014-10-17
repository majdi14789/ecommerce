package tn.esprit.ecommerce.services.gestion.commsion;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.e_commerce.persistence.Commision;

/**
 * Session Bean implementation class GestionCommision
 */
@Stateless
public class GestionCommision implements
		GestionCommisionRemote, GestionCommisionLocal {
	@PersistenceContext
	EntityManager entityManager;

	public GestionCommision() {
	}

	@Override
	public boolean addCommision(Commision commision) {
		entityManager.persist(commision);
		return true;
	}

	@Override
	public boolean updatecommision(Commision commision) {
		entityManager.merge(commision);
		return true;
	}

	@Override
	public boolean deleteCommision(Commision commision) {
		entityManager.remove(entityManager.merge(commision));
		return true;
	}

	@Override
	public Commision findCommisionById(int idCommision) {

		return entityManager.find(Commision.class, idCommision);
	}

	@Override
	public List<Commision> findAllCommision() {
		Query query = entityManager.createQuery("select a from Commision a");
		return query.getResultList();
	}

}
