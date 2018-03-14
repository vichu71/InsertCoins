package test;

import java.util.List;

import javax.persistence.EntityManager;

import model.bares;
import util.JPAUtil;


public class TestIbernate {
	
  public static void main(String[] args) {
	  List<bares> bar = null; 
	  bares b = new bares();
    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
    entityManager.getTransaction().begin();
    String sql ="select * from bares";
    
    // Check database conection
//    String sql = "SELECT * FROM insertcoins.bares ";

    bar = (List<bares>) entityManager.createNativeQuery(sql,bares.class).getResultList();
    
    for(int i = 0;i<=bar.size();i++) {
    	
    System.out.println("nombre bar "+ bar.get(i).getNombre());
    System.out.println("------------------------------------------");
    }
//    TypedQuery<Histfas> query = em.createQuery(sql, Histfas.class);

    entityManager.getTransaction().commit();
    entityManager.close();

    JPAUtil.shutdown();
  }
}

