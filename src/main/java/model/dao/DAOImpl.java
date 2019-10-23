package model.dao;

import java.util.ArrayList;
import java.util.List;

public class DAOImpl<E> implements DAO<E> {

	private Class<E> clazz;
	private boolean useEquals;
	
	
	
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
		List<E> objects = new ArrayList<E>();
		return objects;		
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