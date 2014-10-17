package tn.esprit.ecommerce.services.gestion.adresse;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.e_commerce.persistence.Address;
import tn.esprit.e_commerce.persistence.User;

@Remote
public interface GestionAdresseRemote {

	
	 boolean addAddress(Address address);

	 boolean updateaddress(Address address);

	 boolean deleteAddress(Address address);

	 Address findAddressById(int idAddress);
	 List<Address> findAddressByUserId(User user);

	 List<Address> findAllAddress();

}
