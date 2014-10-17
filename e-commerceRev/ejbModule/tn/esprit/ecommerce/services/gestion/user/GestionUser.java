package tn.esprit.ecommerce.services.gestion.user;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.e_commerce.persistence.Address;
import tn.esprit.e_commerce.persistence.Administrator;
import tn.esprit.e_commerce.persistence.Customer;
import tn.esprit.e_commerce.persistence.Supplier;
import tn.esprit.e_commerce.persistence.User;
import tn.esprit.ecommerce.services.gestion.adresse.GestionAddresse;

/**
 * Session Bean implementation class GestionUser
 */
@Stateless
public class GestionUser implements
		GestionUserRemote, GestionUserLocal {
	@PersistenceContext
	EntityManager entityManager;

	public GestionUser() {
	}

	@Override
	public boolean addUser(User user) {
		entityManager.persist(user);
		return true;
	}

	@Override
	public boolean updateuser(User user) {
		entityManager.merge(user);
		return true;
	}

	@Override
	public boolean deleteUser(User user) {
		entityManager.remove(entityManager.merge(user));
		return true;
	}

	@Override
	public User findUserById(int idUser) {
		//Administrator user=(Administrator) entityManager.find(Administrator.class, idUser);
		User user=entityManager.find(User.class, idUser);
		//List<Address> addresses =new GestionAddresse().findAddressByUserId(idUser);
		//user.setAddresses(addresses);
		System.out.println("From findUserById****User SessionBean    "+user.getLastName());
		return user;
	}

	@Override
	public List<Supplier> findAllUser() {
		Query query = entityManager.createQuery("select a from Supplier a");
		
		return query.getResultList();
	}

	@Override
	public List<Supplier> findUserByFirstName(String fisrtName) {
		Query query=entityManager.createQuery("select a from User a where a.firstName LIKE :fs");
		query.setParameter("fs", fisrtName+"%");
//		Query query=entityManager.createQuery("select a from Supplier a where a.firstName = :fs");
//		query.setParameter("fs", fisrtName);
		return query.getResultList();
	}

	@Override
	public List<Supplier> findUserByLastName(String lastName) {
		Query query=entityManager.createQuery("select a from Supplier a where a.lastName LIKE :fs");
		query.setParameter("fs", lastName+"%");
		return query.getResultList();
	}

	@Override
	public List<Supplier> findUserByFirstNameAndLastName(String firstName,
			String lastName) {
		Query query=entityManager.createQuery("select a from Supplier a where a.lastName LIKE :ln and a.firstName LIKE :fn");
		query.setParameter("ln", lastName+"%");
		query.setParameter("fn", firstName+"%");
		return query.getResultList();
	}

	@Override
	public boolean blockUser(User user) {
		user.setBlocked(true);
		entityManager.merge(user);
		return true;
	}

	@Override
	public boolean unBlockUser(User user) {
		user.setBlocked(false);
		entityManager.merge(user);
		return true;
	}

	@Override
	public List<Customer> findAllUserCustomer() {
		Query query = entityManager.createQuery("select a from Customer a");
		return query.getResultList();
	}

	@Override
	public List<Customer> findUserByFirstNameCustomer(String fisrtName) {
		Query query=entityManager.createQuery("select a from Customer a where a.firstName = :fs");
		query.setParameter("fs", fisrtName);
		return query.getResultList();
	}

	@Override
	public List<Customer> findUserByLastNameCustomer(String lastName) {
		Query query=entityManager.createQuery("select a from Customer a where a.lastName LIKE :fs");
		query.setParameter("fs", lastName+"%");
		return query.getResultList();
	}

	@Override
	public List<Customer> findUserByFirstNameAndLastNameCustomer(
			String firstName, String lastName) {
		Query query=entityManager.createQuery("select a from Customer a where a.lastName LIKE :ln and a.firstName LIKE :fn");
		query.setParameter("ln", lastName+"%");
		query.setParameter("fn", firstName+"%");
		return query.getResultList();
	}

}
