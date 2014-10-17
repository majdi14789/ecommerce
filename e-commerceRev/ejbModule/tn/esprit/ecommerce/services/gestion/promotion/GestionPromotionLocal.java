package tn.esprit.ecommerce.services.gestion.promotion;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.e_commerce.persistence.Promotion;

@Local
public interface GestionPromotionLocal {
	boolean addPromotion(Promotion promotion);

	boolean updatePromotion(Promotion promotion);

	boolean deletePromotion(Promotion promotion);

	Promotion findPromotionById(int idPromotion);

	List<Promotion> findAllPromotions();
	
	
	//********* saf************
	Promotion findPromotionByName(String nomPromotion);

}
