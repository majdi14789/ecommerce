package tn.esprit.ecommerce.services.gestion.orders;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.e_commerce.persistence.Orders;
import tn.esprit.e_commerce.persistence.Statistique;

@Local
public interface GestionOrdersLocal {
	boolean addOrders(Orders orders);

	boolean updateOrders(Orders orders);

	boolean deleteOrders(Orders orders);

	Orders findOrdersById(int idOrders);

	List<Orders> findAllOrderss();
	public List<Orders> bestCustomer();

	List<Statistique> findBestCustomer();

}
