package tn.esprit.ecommerce.services.gestion.productItemSupplier;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.e_commerce.persistence.ProductItemSupplier;

@Remote
public interface GestionProductItemSupplierRemote {
	boolean addProductItemSupplier(ProductItemSupplier productItemSupplier);

	 boolean updateproductItemSupplier(ProductItemSupplier productItemSupplier);

	 boolean deleteProductItemSupplier(ProductItemSupplier productItemSupplier);

	 ProductItemSupplier findProductItemSupplierById(int idProductItemSupplier);

	 List<ProductItemSupplier> findAllProductItemSupplier();
}
