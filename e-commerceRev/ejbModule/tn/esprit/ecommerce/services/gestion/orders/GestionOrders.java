package tn.esprit.ecommerce.services.gestion.orders;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.e_commerce.persistence.Orders;

/**
 * Session Bean implementation class GestionOrders
 */
@Stateless
public class GestionOrders implements
		GestionOrdersRemote, GestionOrdersLocal {
	@PersistenceContext
	EntityManager entityManager;

	public GestionOrders() {
	}

	@Override
	public boolean addOrders(Orders orders) {
		entityManager.persist(orders);
		return true;
	}

	@Override
	public boolean updateorders(Orders orders) {
		entityManager.merge(orders);
		return true;
	}

	@Override
	public boolean deleteOrders(Orders orders) {
		entityManager.remove(entityManager.merge(orders));
		return true;
	}

	@Override
	public Orders findOrdersById(int idOrders) {

		return entityManager.find(Orders.class, idOrders);
	}

	@Override
	public List<Orders> findAllOrders() {
		Query query = entityManager.createQuery("select a from Orders a");
		return query.getResultList();
	}

}
