package tn.esprit.ecommerce.services.gestion.user;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.e_commerce.persistence.Customer;
import tn.esprit.e_commerce.persistence.Supplier;
import tn.esprit.e_commerce.persistence.User;

@Remote
public interface GestionUserRemote {

	boolean addUser(User user);

	boolean updateuser(User user);

	boolean deleteUser(User user);

	boolean blockUser(User user);
	boolean unBlockUser(User user);

	User findUserById(int idUser);

	List<Supplier> findAllUser();

	List<Supplier> findUserByFirstName(String fisrtName);

	List<Supplier> findUserByLastName(String lastName);

	List<Supplier> findUserByFirstNameAndLastName(String firstName, String lastName);

	
	List<Customer> findAllUserCustomer();

	List<Customer> findUserByFirstNameCustomer(String fisrtName);

	List<Customer> findUserByLastNameCustomer(String lastName);

	List<Customer> findUserByFirstNameAndLastNameCustomer(String firstName, String lastName);
}
