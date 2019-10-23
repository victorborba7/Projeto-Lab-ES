package model.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import model.validator.Validator;

public class DAOImpl<E> implements DAO<E> {

	private Class<E> clazz;
	private Validator<E> validator;
	private boolean useEquals;
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("judocas");
	@PersistenceContext
	private EntityManager em = factory.createEntityManager();
	
	public DAOImpl(Class<E> clazz, Validator<E> val, boolean comp){
		this.validator = val;
		this.useEquals = comp;
		this.clazz = clazz;
	}
	
	public DAOImpl(Class<E> clazz, boolean useEquals){
		this.validator = new DefaultValidator<E>();
		this.useEquals = useEquals;
		this.clazz = clazz;
	}
	
	public DAOImpl(Class<E> clazz){
		this.validator = new DefaultValidator<E>();
		this.clazz = clazz;
	}
	
	public List<E> list() {
		
		List<E> objects = new ArrayList<E>();
		return objects;
	}
	
	public List<E> search(E object) {
		List<E> objects = em.createQuery("SELECT a FROM Aluno a").getResultList();
		return objects;		
	}

	/**
	 * Classe utilizada caso o nenhuma classe Validador seja fornecida na instanciação.
	 */
	public class DefaultValidator<T> implements Validator<T> {
		public boolean validate(T obj) {
			return true;
		}
	}

    public boolean save(E object) throws IllegalArgumentException {
        // TODO Auto-generated method stub
        return false;
    }

    public void delete(E object) throws IllegalArgumentException {
        // TODO Auto-generated method stub
        
    }

    public E get(E object) throws IllegalArgumentException {
        // TODO Auto-generated method stub
        return null;
    }
}