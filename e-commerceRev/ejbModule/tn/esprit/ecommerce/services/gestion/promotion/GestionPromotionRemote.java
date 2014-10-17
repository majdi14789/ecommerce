package tn.esprit.ecommerce.services.gestion.promotion;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;

import tn.esprit.e_commerce.persistence.Promotion;

@Remote
public interface GestionPromotionRemote {
	boolean addDiscount(Promotion promotion);

	 boolean updatediscount(Promotion promotion);

	 boolean deleteDiscount(Promotion promotion);

	 Promotion findDiscountById(int idDiscount);

	 List<Promotion> findAllDiscount();
	 
	 List<Promotion> findDiscountByStartDate(Date  date);

     List<Promotion> findDiscountByEndDate(Date  date);
     
     List<Promotion> findDiscountByRate(float rate);
     List<Promotion> findDiscountByDescription(String description);
     List<Promotion> findDiscountByAllCriteria(String description,
  			float rate, Date startDate,Date endDate);
}
