package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Article;
import entity.User;

public class ArticleService {
	
	String persistenceName = "crud-jsf";
	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	public Article getById(int id) {
		
		Article a = null;
		
		try {
			emf = Persistence.createEntityManagerFactory(persistenceName);
			em = emf.createEntityManager();
			
			
			a = em.find(Article.class, id);
			
		} finally {
			if (emf != null) {
				emf.close();
			}
			if (em != null) {
				em.close();
			}
			
		}
		
		
		return a;
	}
	
	public List<Article> getAll(){
		List<Article> articles = null;
		try {
			emf = Persistence.createEntityManagerFactory(persistenceName);
			em = emf.createEntityManager();
			
			articles = em.createQuery("From Article").getResultList();
			
		} finally {
			if (emf != null) {
				emf.close();
			}
			if (em != null) {
				em.close();
			}
			
		}

		return articles;
	}
	
	public boolean update(int id, Article a) {
		
		try {
			emf = Persistence.createEntityManagerFactory(persistenceName);
			em = emf.createEntityManager();
			
			a.setId(id);
			EntityTransaction trans = em.getTransaction();
			trans.begin();
			em.merge(a);
			trans.commit();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		} finally {
			if (emf != null) {
				emf.close();
			}
			if (em != null) {
				em.close();
			}
		}
			
	}
	
	public boolean create(Article a) {
		
		try {
			emf = Persistence.createEntityManagerFactory(persistenceName);
			em = emf.createEntityManager();
			
			EntityTransaction trans = em.getTransaction();
			trans.begin();
			em.persist(a);
			trans.commit();
			
			
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		} finally {
			if (emf != null) {
				emf.close();
			}
			if (em != null) {
				em.close();
			}
		}		
	}
	
	public boolean delete(int id) {
		
		try {
			emf = Persistence.createEntityManagerFactory(persistenceName);
			em = emf.createEntityManager();
			
			Article a = em.find(Article.class, id);
			
			EntityTransaction trans = em.getTransaction();
			trans.begin();
			em.remove(a);
			trans.commit();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		} finally {
			if (emf != null) {
				emf.close();
			}
			if (em != null) {
				em.close();
			}
		}
	}
	
}
