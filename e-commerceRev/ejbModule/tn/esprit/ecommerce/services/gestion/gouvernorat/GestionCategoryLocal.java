package tn.esprit.ecommerce.services.gestion.gouvernorat;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.e_commerce.persistence.Category;

@Local
public interface GestionCategoryLocal {
	boolean addCategory(Category category);

	boolean updateCategory(Category category);

	boolean deleteCategory(Category category);

	Category findCategoryById(int idCategory);

	List<Category> findAllCategorys();
}
