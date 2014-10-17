package tn.esprit.ecommerce.services.gestion.picture;

import javax.ejb.Local;

import tn.esprit.e_commerce.persistence.Picture;
import tn.esprit.e_commerce.persistence.User;

@Local
public interface GestionPictureLocal {

	boolean addPhoto(Picture picture);

	Picture getPictureById(int id);

	Picture getPictureByUser(User user);

}
