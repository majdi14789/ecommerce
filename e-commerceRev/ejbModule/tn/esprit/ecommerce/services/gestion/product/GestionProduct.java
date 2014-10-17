package tn.esprit.ecommerce.services.gestion.product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TemporalType;

import tn.esprit.e_commerce.persistence.Picture;
import tn.esprit.e_commerce.persistence.Product;
import tn.esprit.e_commerce.persistence.Promotion;
import tn.esprit.e_commerce.persistence.StatistiqueProduct;

/**
 * Session Bean implementation class GestionProduct
 */
@Stateless
public class GestionProduct implements GestionProductRemote, GestionProductLocal {
	@PersistenceContext
	EntityManager em;
    /**
     * Default constructor. 
     */
    public GestionProduct() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		em.persist(product);		
		return true;
	}

	@Override
	public boolean updateProduct(Product product) {
		em.merge(product);
		return true;
	}

	@Override
	public boolean deleteProduct(Product product) {
		em.remove(em.merge(product));		
		return true;
	}

	@Override
	public Product findProductById(int idProduct) {
		// TODO Auto-generated method stub
		return em.find(Product.class, idProduct);
	}

	@Override
	public List<Product> findAllProducts() {
		Query query = em.createQuery("select p from Product p");
		return query.getResultList();
	}

	@Override
	public List<Product> findProductInDiscount() {
		Query query = em.createQuery("select p from Product p where p.promotion IS NOT NULL");
		return query.getResultList();
	}

	@Override
	public List<Product> findProductByCategorie(String categoryName) {
		Query req = em
				.createQuery("select p from Product p where p.category.name=:x");
		req.setParameter("x", categoryName);
		return req.getResultList();
	}

	@Override
	public List<Product> findProductByDate(Date date) {
		Query query = em.createQuery("select p from Product p where p.date >=:da");
		query.setParameter("da", date,TemporalType.DATE);
		return query.getResultList();
	}

	@Override
	public List<Product> findProductByPriceInterval(float priceDebut,float priceFin) {	
	Query query = em.createQuery("select p from Product p where p.price >= :min and p.price<=:max");
	query.setParameter("min", priceDebut);
	query.setParameter("max", priceFin);
	return query.getResultList();
	}

	@Override
	public List<Picture> findAllProductPictures(int idProduct) {
		Query query = em.createQuery("select p from Picture p where p.product.idProduct=:id");
		query.setParameter("id", idProduct);		
		return query.getResultList();
	}
	
	
	@Override
	public List<Product> findProductbyName(String name) {
		Query query = em.createQuery("select p from Product p where UPPER(p.name) LIKE:pname");
		query.setParameter("pname", "%" + name + "%");		
		return query.getResultList();
	}

	
	@Override
	public List<Product> findProductByAllCriteria(String categoryName,
			String productName, float priceDebut, float priceFin, Date date,
			boolean inDiscount) {
		  
		
		List<Product> resultatRecherche = new ArrayList<Product>();		
		resultatRecherche = findAllProducts();
		System.out.println("9bal me nod5el lel les conditions "+resultatRecherche.size());
		
		if(!categoryName.equals("Search in All Categories ...")){
			resultatRecherche = intersection(resultatRecherche, findProductByCategorie(categoryName));
			System.out.println("mta3 categorie"+resultatRecherche.size());

		}
		
		
		if(!productName.equals("")){
			resultatRecherche = intersection(resultatRecherche, findProductbyName(productName));
			System.out.println("mta3 name"+resultatRecherche.size());

		}
		
		if(priceDebut>=0.00 && priceFin>priceDebut){
			resultatRecherche = intersection(resultatRecherche, findProductByPriceInterval(priceDebut, priceFin));
			System.out.println("mta3 price"+resultatRecherche.size());

		}   
		
		if(date!=null){
			resultatRecherche = intersection(resultatRecherche, findProductByDate(date));
			System.out.println("mta3 e date"+resultatRecherche.size());

		}
		
		if(inDiscount==true){
			resultatRecherche = intersection(resultatRecherche, findProductInDiscount());
			System.out.println(resultatRecherche.size());

		}
		
		System.out.println("le resultat final"+resultatRecherche.size());
  
		return resultatRecherche;
	}

	
	
	
	 public static  List<Product> intersection(List<Product> list1, List<Product> list2) {
	        List<Product> list = new ArrayList<Product>();

	        for (Product p : list1) {
	            if(list2.contains(p)) {
	                list.add(p);
	            }
	        }

	        return list;
	    }

	@Override
	public List<StatistiqueProduct> findOldestProduct() {
		Query query = em
				.createQuery("select p,p.promotion from Product p  left join p.promotion pro ORDER BY  (p.date) ASC").setMaxResults(3);
			//	.createQuery("select p from Product p  ORDER BY  (p.date) ASC").setMaxResults(3);
		 
		List<Object[]> Presult = query.getResultList();

		ArrayList<StatistiqueProduct> ls = new ArrayList();

		for (Object[] result : Presult) {

			StatistiqueProduct s = new StatistiqueProduct();
			s.setProduct((Product)result[0]);
			s.setPromotion( (Promotion) result[1]);
			ls.add(s);
		}
		return ls;
}



	
	
	
}
