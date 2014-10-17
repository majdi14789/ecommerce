package tn.esprit.ecommerce.services.gestion.picture;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.e_commerce.persistence.Administrator;
import tn.esprit.e_commerce.persistence.Picture;
import tn.esprit.e_commerce.persistence.User;
import tn.esprit.ecommerce.services.gestion.user.GestionUser;

/**
 * Session Bean implementation class GestionPicture
 */
@Stateless
public class GestionPicture implements
		GestionPictureRemote, GestionPictureLocal {
	@PersistenceContext
	EntityManager entityManager;

	public GestionPicture() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addPhoto(Picture picture) {
		
		entityManager.persist(picture);
		System.out.println("  add picture sessionBean");
		return true;
	}

	@Override
	public Picture getPictureById(int id) {
		return  entityManager.find(Picture.class, id);
		
	}

	@Override
	public Picture getPictureByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
