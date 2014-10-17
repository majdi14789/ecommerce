package tn.esprit.ecommerce.services.gestion.category;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.e_commerce.persistence.Category;

@Local
public interface GestionCategoryLocal {
	 boolean addCategory(Category category);

	 boolean updatecategory(Category category);

	 boolean deleteCategory(Category category);

	 Category findCategoryById(int idCategory);

	 List<Category> findAllCategory();
	 
	 Category findCategoryByNameSaf(String nomCategory);

     public List<Category> findCategoryByName(String name);

}
