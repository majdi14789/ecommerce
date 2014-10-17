package tn.esprit.ecommerce.services.gestion.category;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.e_commerce.persistence.Category;

/**
 * Session Bean implementation class GestionCategory
 */
@Stateless
public class GestionCategory implements
		GestionCategoryRemote, GestionCategoryLocal {
	@PersistenceContext
	EntityManager entityManager;

	public GestionCategory() {
	}

	@Override
	public boolean addCategory(Category category) {
		entityManager.persist(category);
		return true;
	}

	@Override
	public boolean updatecategory(Category category) {
		entityManager.merge(category);
		return true;
	}

	@Override
	public boolean deleteCategory(Category category) {
		entityManager.remove(entityManager.merge(category));
		return true;
	}

	@Override
	public Category findCategoryById(int idCategory) {

		return entityManager.find(Category.class, idCategory);
	}

	@Override
	public List<Category> findAllCategory() {
		Query query = entityManager.createQuery("select a from Category a");
		return query.getResultList();
	}

}
