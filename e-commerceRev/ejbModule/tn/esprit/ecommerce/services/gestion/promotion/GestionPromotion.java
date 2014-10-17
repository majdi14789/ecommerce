package tn.esprit.ecommerce.services.gestion.promotion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TemporalType;

import tn.esprit.e_commerce.persistence.Promotion;

/**
 * Session Bean implementation class GestionPromotion
 */
@Stateless
public class GestionPromotion implements
		GestionPromotionRemote, GestionPromotionLocal {
	@PersistenceContext
	EntityManager entityManager;

	public GestionPromotion() {
	}

	@Override
	public boolean addDiscount(Promotion promotion) {
		entityManager.persist(promotion);
		return true;
	}

	@Override
	public boolean updatediscount(Promotion promotion) {
		entityManager.merge(promotion);
		return true;
	}

	@Override
	public boolean deleteDiscount(Promotion promotion) {
		entityManager.remove(entityManager.merge(promotion));
		return true;
	}

	@Override
	public Promotion findDiscountById(int idDiscount) {

		return entityManager.find(Promotion.class, idDiscount);
	}

	@Override
	public List<Promotion> findAllDiscount() {
		Query query = entityManager.createQuery("select a from Promotion a");
		return query.getResultList();
	}

	@Override
	public List<Promotion> findDiscountByStartDate(Date date) {
		Query query = entityManager
				.createQuery("select a from Promotion a where a.startDate >=:dateDebut");
		query.setParameter("dateDebut", date,TemporalType.DATE);
		return query.getResultList();
	}

	@Override
	public List<Promotion> findDiscountByEndDate(Date date) {
		Query query = entityManager
				.createQuery("select a from Promotion a where a.endDate <=:dateFin");
		query.setParameter("dateFin", date,TemporalType.DATE);
		return query.getResultList();
	}

	@Override
	public List<Promotion> findDiscountByRate(float rate) {
		Query query = entityManager
				.createQuery("select a from Promotion a where a.endDate =:rate");
		query.setParameter("rate", rate);
		return query.getResultList();
	}

	@Override
	public List<Promotion> findDiscountByDescription(String description) {
		Query query = entityManager
				.createQuery("select a from Promotion a where a.description =:desc");
		query.setParameter("desc", description);
		return query.getResultList();
	}
	
	@Override
	public List<Promotion> findDiscountByAllCriteria(String description,
			float rate, Date startDate,Date endDate) {
		  
		
		List<Promotion> resultatRecherche = new ArrayList<Promotion>();		
		resultatRecherche = findAllDiscount();
		System.out.println("tout les Promotions "+resultatRecherche.size());
		
		if(!description.equals("")){
			resultatRecherche = intersection(resultatRecherche, findDiscountByDescription(description));
			System.out.println("mta3 categorie"+resultatRecherche.size());
		}
		
		
		if(rate != 0){
			resultatRecherche = intersection(resultatRecherche, findDiscountByRate(rate));
			System.out.println("mta3 name"+resultatRecherche.size());
		}
		
		
		
		if(startDate!=null){
			resultatRecherche = intersection(resultatRecherche, findDiscountByStartDate(startDate));
			System.out.println("mta3 e date"+resultatRecherche.size());
		}
		
		if(endDate!=null){
			resultatRecherche = intersection(resultatRecherche, findDiscountByEndDate(endDate));
			System.out.println("mta3 e date"+resultatRecherche.size());
		}
		
		System.out.println("le resultat final"+resultatRecherche.size());
  
		return resultatRecherche;
	}
	
	
	
	 public static  List<Promotion> intersection(List<Promotion> list1, List<Promotion> list2) {
	        List<Promotion> list = new ArrayList<Promotion>();
	        for (Promotion p : list1) {
	            if(list2.contains(p)) {
	                list.add(p);
	            }
	        }
	        return list;
	    }

}
