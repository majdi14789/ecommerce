package tn.esprit.ecommerce.services.gestion.promotion;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.e_commerce.persistence.Promotion;

@Remote
public interface GestionPromotionRemote {
	boolean addPromotion(Promotion promotion);

	boolean updatePromotion(Promotion promotion);

	boolean deletePromotion(Promotion promotion);

	Promotion findPromotionById(int idPromotion);

	List<Promotion> findAllPromotions();
	
	
	
	//********************* safouen *********************
	
	Promotion findPromotionByName(String nomPromotion);

}
