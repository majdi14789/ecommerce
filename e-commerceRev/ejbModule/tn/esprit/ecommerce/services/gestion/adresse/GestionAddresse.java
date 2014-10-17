package tn.esprit.ecommerce.services.gestion.adresse;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.e_commerce.persistence.Address;
import tn.esprit.e_commerce.persistence.User;
import tn.esprit.ecommerce.services.gestion.user.GestionUser;

/**
 * Session Bean implementation class GestionAddresse
 */
@Stateless
public class GestionAddresse implements
		GestionAdresseRemote, GestionAdresseLocal {
	@PersistenceContext
	EntityManager entityManager;

	public GestionAddresse() {
	}

	@Override
	public boolean addAddress(Address address) {
		entityManager.persist(address);
		return true;
	}

	@Override
	public boolean updateaddress(Address address) {
		entityManager.merge(address);
		return true;
	}

	@Override
	public boolean deleteAddress(Address address) {
		entityManager.remove(entityManager.merge(address));
		return true;
	}

	@Override
	public Address findAddressById(int idAddress) {

		return entityManager.find(Address.class, idAddress);
	}

	@Override
	public List<Address> findAllAddress() {
		Query query = entityManager.createQuery("select a from Address a");
		return query.getResultList();
	}

	@Override
	public List<Address> findAddressByUserId(User user) {

		Query query = entityManager
				.createQuery("select a from Address a join a.user where a.user=:us ");
		// Query query =
		// entityManager.createQuery("select a from User u join u.addresses a where a.user=:us");

		query.setParameter("us", user);
		return query.getResultList();
	}
}
