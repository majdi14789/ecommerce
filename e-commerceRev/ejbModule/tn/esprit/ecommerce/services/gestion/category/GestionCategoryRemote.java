package tn.esprit.ecommerce.services.gestion.category;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.e_commerce.persistence.Category;

@Remote
public interface GestionCategoryRemote {
	boolean addCategory(Category category);

	 boolean updatecategory(Category category);

	 boolean deleteCategory(Category category);

	 Category findCategoryById(int idCategory);

	 List<Category> findAllCategory();
}
