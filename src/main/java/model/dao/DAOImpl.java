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
	
	public List<E> list() {
		
		List<E> objects = new ArrayList<E>();
		return objects;
	}
	
	public List<E> search(E object) {
		List<E> objects = em.createQuery("SELECT * FROM clazz").getResultList();
		return objects;		
	}

    public void save(E object) throws IllegalArgumentException {
    	em.persist(object);
    }

    public void delete(E object) throws IllegalArgumentException {
        E newE = em.merge(object);
        em.remove(newE);
    }

    public E get(E object) throws IllegalArgumentException {
    	return em.find(clazz, object);
    }
}