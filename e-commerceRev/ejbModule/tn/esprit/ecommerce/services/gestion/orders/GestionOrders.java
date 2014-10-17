package tn.esprit.ecommerce.services.gestion.orders;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.e_commerce.persistence.Customer;
import tn.esprit.e_commerce.persistence.Orders;
import tn.esprit.e_commerce.persistence.Statistique;

/**
 * Session Bean implementation class GestionOrders
 */
@Stateless
public class GestionOrders implements GestionOrdersRemote, GestionOrdersLocal {
	@PersistenceContext
	EntityManager em;

	/**
	 * Default constructor.
	 */
	public GestionOrders() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addOrders(Orders orders) {
		em.persist(orders);
		return true;
	}

	@Override
	public boolean updateOrders(Orders orders) {
		em.merge(orders);
		return true;
	}

	@Override
	public boolean deleteOrders(Orders orders) {
		em.remove(em.merge(orders));
		return true;
	}

	@Override
	public Orders findOrdersById(int idOrders) {
		// TODO Auto-generated method stub
		return em.find(Orders.class, idOrders);
	}

	@Override
	public List<Orders> findAllOrderss() {
		Query query = em.createQuery("select o from Orders o");
		return query.getResultList();
	}

	@Override
	public List<Orders> bestCustomer() {
		// Query
		// query=em.createQuery("select c from customer  avg(o.totalAmount) as total,customer_idUser as idClient from order group by o.customer_idUser ");
		// return query.getResultList();
		return null;
	}

	@Override
	public List<Statistique> findBestCustomer() {
		
		Query query = em
				.createQuery("select o.customer,sum(o.totalAmount)from Orders o left join o.customer c  group by c.idUser ORDER BY  sum(o.totalAmount)DESC").setMaxResults(3);
		
		List<Object[]> Presult = query.getResultList();

		ArrayList<Statistique> ls = new ArrayList();

		for (Object[] result : Presult) {

			Statistique s = new Statistique();
			s.setCustomer((Customer) result[0]);
			System.out.println((Double) result[1]);
			s.setTotalAmount((Double) result[1]);
			ls.add(s);
		}
		return ls;
	}
}
