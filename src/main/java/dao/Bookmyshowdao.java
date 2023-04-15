package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Bookmyshows;

public class Bookmyshowdao {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		
		public void insert(Bookmyshows bookmyshow)
		{
			entityTransaction.begin();
			entityManager.persist(bookmyshow);
			entityTransaction.commit();
			}
		
		public List<Bookmyshows> fetchall (){
		Query e= entityManager.createQuery("select a from Bookmyshow a");
			List<Bookmyshows>l1=e.getResultList();
			return l1;
			
		}
}
