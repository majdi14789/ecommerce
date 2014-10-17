package tn.esprit.ecommerce.services.gestion.adresse;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.e_commerce.persistence.Address;
import tn.esprit.e_commerce.persistence.User;

@Local
public interface GestionAdresseLocal {

	 boolean addAddress(Address address);

	 boolean updateaddress(Address address);

	 boolean deleteAddress(Address address);

	 Address findAddressById(int idAddress);

	 List<Address> findAllAddress();
	 List<Address> findAddressByUserId(User user);

}
