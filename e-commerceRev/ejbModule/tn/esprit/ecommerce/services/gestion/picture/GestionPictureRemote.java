package tn.esprit.ecommerce.services.gestion.picture;

import javax.ejb.Remote;

import tn.esprit.e_commerce.persistence.Picture;
import tn.esprit.e_commerce.persistence.User;

@Remote
public interface GestionPictureRemote {

	
	boolean addPhoto(Picture picture);
	Picture getPictureById(int id);
	Picture getPictureByUser(User user);
}
