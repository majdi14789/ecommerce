package tn.esprit.ecommerce.services.gestion.promotion;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.e_commerce.persistence.Promotion;

/**
 * Session Bean implementation class GestionPromotion
 */
@Stateless
public class GestionPromotion implements GestionPromotionRemote, GestionPromotionLocal {
	@PersistenceContext
	EntityManager em;
    /**
     * Default constructor. 
     */
    public GestionPromotion() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public boolean addPromotion(Promotion promotion) {
		em.persist(promotion);		
		return true;
	}

	@Override
	public boolean updatePromotion(Promotion promotion) {
		em.merge(promotion);
		return true;
	}

	@Override
	public boolean deletePromotion(Promotion promotion) {
		em.remove(em.merge(promotion));		
		return true;
	}

	@Override
	public Promotion findPromotionById(int idPromotion) {
		// TODO Auto-generated method stub
		return em.find(Promotion.class, idPromotion);
	}

	@Override
	public List<Promotion> findAllPromotions() {
		Query query = em.createQuery("select p from Promotion p");
		return query.getResultList();
	}

	@Override
	public Promotion findPromotionByName(String nomPromotion) {
		Query query = em.createQuery("select p from Promotion p where p.nomPromotion=:name");
		query.setParameter("name", nomPromotion);
		return (Promotion) query.getSingleResult();
	}

}
