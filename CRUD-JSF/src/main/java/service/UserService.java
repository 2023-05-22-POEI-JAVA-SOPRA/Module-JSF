package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.User;

public class UserService {
	
	String persistenceName = "crud-jsf";
	EntityManagerFactory emf = null;
	EntityManager em = null;
	
	public User getById(int id) {
		
		User u = null;
		
		try {
			emf = Persistence.createEntityManagerFactory(persistenceName);
			em = emf.createEntityManager();
			
			
			u = em.find(User.class, id);
			
		} finally {
			if (emf != null) {
				emf.close();
			}
			if (em != null) {
				em.close();
			}
			
		}
		
		
		return u;
	}
	
	public List<User> getByEmailLike(String search) {
		List<User> users = null;
		try {
			emf = Persistence.createEntityManagerFactory(persistenceName);
			em = emf.createEntityManager();
			
			users = em.createQuery("From User WHERE email LIKE :email")
					.setParameter("email", "%" + search + "%")
					.getResultList();
			
		} finally {
			if (emf != null) {
				emf.close();
			}
			if (em != null) {
				em.close();
			}
			
		}
		return users;
	}
	
	public List<User> getAll(){
		List<User> users = null;
		try {
			emf = Persistence.createEntityManagerFactory(persistenceName);
			em = emf.createEntityManager();
			
			users = em.createQuery("From User").getResultList();
			
		} finally {
			if (emf != null) {
				emf.close();
			}
			if (em != null) {
				em.close();
			}
			
		}

		return users;
	}
	
	public boolean update(int id, User u) {
		
		try {
			emf = Persistence.createEntityManagerFactory(persistenceName);
			em = emf.createEntityManager();
			
			u.setId(id);
			EntityTransaction trans = em.getTransaction();
			trans.begin();
			em.merge(u);
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
	
	public boolean create(User u) {
		
		try {
			emf = Persistence.createEntityManagerFactory(persistenceName);
			em = emf.createEntityManager();
			
			EntityTransaction trans = em.getTransaction();
			trans.begin();
			em.persist(u);
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
			
			User u = em.find(User.class, id);
			
			EntityTransaction trans = em.getTransaction();
			trans.begin();
			em.remove(u);
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
