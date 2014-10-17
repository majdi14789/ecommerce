package tn.esprit.ecommerce.services.gestion.gouvernorat;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.e_commerce.persistence.Category;

@Remote
public interface GestionCategoryRemote {
	boolean addCategory(Category category);

	boolean updateCategory(Category category);

	boolean deleteCategory(Category category);

	Category findCategoryById(int idCategory);

	List<Category> findAllCategorys();

   Category findCategoryByName(String nomCategory);

}
