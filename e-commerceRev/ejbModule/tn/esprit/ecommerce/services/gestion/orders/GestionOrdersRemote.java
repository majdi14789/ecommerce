package tn.esprit.ecommerce.services.gestion.orders;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.e_commerce.persistence.Orders;

@Remote
public interface GestionOrdersRemote {
	boolean addOrders(Orders orders);

	 boolean updateorders(Orders orders);

	 boolean deleteOrders(Orders orders);

	 Orders findOrdersById(int idOrders);

	 List<Orders> findAllOrders();
}
