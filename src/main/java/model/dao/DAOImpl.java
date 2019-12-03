package model.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class DAOImpl<E> implements DAO<E> {

	private Class<E> clazz;
	private boolean useEquals;
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("judocas");
	
	@PersistenceContext
	private EntityManager em = factory.createEntityManager();
	
	
	public DAOImpl(Class<E> clazz, boolean comp){
		this.useEquals = comp;
		this.clazz = clazz;
	}
	
	public DAOImpl(Class<E> clazz){
		this.clazz = clazz;
	}
	
    public void save(E object){
    	em.getTransaction().begin();
    	em.merge(object);
    	em.flush();
    	em.getTransaction().commit();
    }
    
    public void delete(E object) throws IllegalArgumentException {
        E newE = em.merge(object);
        em.remove(newE);
    }

	public E get(String name, String query) throws IllegalArgumentException {
    	return (E) em.createNamedQuery(query, clazz).setParameter("name", name).getSingleResult();
    }
    
    public List<E> search(String query) {
		return em.createNamedQuery(query, clazz).getResultList();
	}
    
	public List<E> list(String query, String name) {
		System.out.println("Query name: " + query);
		System.out.println("Query param: " + name);
		System.out.println("Class: " + clazz);
		return em.createNamedQuery(query, clazz).setParameter("name", name).getResultList();
	}
}