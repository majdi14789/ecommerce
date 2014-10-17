package tn.esprit.ecommerce.services.gestion.productItemSupplier;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.e_commerce.persistence.ProductItemSupplier;

/**
 * Session Bean implementation class GestionProductItemSupplier
 */
@Stateless
public class GestionProductItemSupplier implements
		GestionProductItemSupplierRemote, GestionProductItemSupplierLocal {
	@PersistenceContext
	EntityManager entityManager;

	public GestionProductItemSupplier() {
	}

	@Override
	public boolean addProductItemSupplier(ProductItemSupplier productItemSupplier) {
		entityManager.persist(productItemSupplier);
		return true;
	}

	@Override
	public boolean updateproductItemSupplier(ProductItemSupplier productItemSupplier) {
		entityManager.merge(productItemSupplier);
		return true;
	}

	@Override
	public boolean deleteProductItemSupplier(ProductItemSupplier productItemSupplier) {
		entityManager.remove(entityManager.merge(productItemSupplier));
		return true;
	}

	@Override
	public ProductItemSupplier findProductItemSupplierById(int idProductItemSupplier) {

		return entityManager.find(ProductItemSupplier.class, idProductItemSupplier);
	}

	@Override
	public List<ProductItemSupplier> findAllProductItemSupplier() {
		Query query = entityManager.createQuery("select a from ProductItemSupplier a");
		return query.getResultList();
	}

}
