package tn.esprit.ecommerce.services.gestion.gouvernorat;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.e_commerce.persistence.Category;
import tn.esprit.e_commerce.persistence.Promotion;

/**
 * Session Bean implementation class GestionCategory
 */
@Stateless
public class GestionCategory implements GestionCategoryRemote, GestionCategoryLocal {


	@PersistenceContext
	EntityManager em;
    /**
     * Default constructor. 
     */
    public GestionCategory() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public boolean addCategory(Category category) {
		em.persist(category);		
		return true;
	}

	@Override
	public boolean updateCategory(Category category) {
		em.merge(category);
		return true;
	}

	@Override
	public boolean deleteCategory(Category category) {
		em.remove(em.merge(category));		
		return true;
	}

	@Override
	public Category findCategoryById(int idCategory) {
		// TODO Auto-generated method stub
		return em.find(Category.class, idCategory);
	}

	@Override
	public List<Category> findAllCategorys() {
		Query query = em.createQuery("select c from Category c");
		return query.getResultList();
	}

	
	
	//*******************Safouen***************************
	@Override
	public Category findCategoryByName(String nomCategory) {
		Query query = em.createQuery("select c from Category c where c.name=:name");
		query.setParameter("name", nomCategory);
		return (Category) query.getSingleResult();
	}

	
	
	
}
