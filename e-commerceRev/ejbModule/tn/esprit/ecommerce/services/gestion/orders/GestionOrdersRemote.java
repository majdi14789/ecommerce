package tn.esprit.ecommerce.services.gestion.orders;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.e_commerce.persistence.Orders;
import tn.esprit.e_commerce.persistence.Statistique;

@Remote
public interface GestionOrdersRemote {
	boolean addOrders(Orders orders);

	boolean updateOrders(Orders orders);

	boolean deleteOrders(Orders orders);

	Orders findOrdersById(int idOrders);

	List<Orders> findAllOrderss();
	public List<Orders> bestCustomer();

	List<Statistique> findBestCustomer();
}