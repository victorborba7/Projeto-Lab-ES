package model.dao;

import java.util.ArrayList;
import java.util.List;
import model.validator.Validator;

public class DAOImpl<E> implements DAO<E> {

	private Class<E> clazz;
	private Validator<E> validator;
	private boolean useEquals;
	
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
		List<E> objects = new ArrayList<E>();
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
}