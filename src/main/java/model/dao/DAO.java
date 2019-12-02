package model.dao;

import java.util.List;

public interface DAO<E> {

	public abstract void save(E object)
	throws IllegalArgumentException;

	public abstract void delete(E object)
	throws IllegalArgumentException;

	public abstract List<E> list(String query, String name)
	throws IllegalArgumentException;

	public abstract E get(String name, String query)
	throws IllegalArgumentException;

	public abstract List<E> search(String query)
	throws IllegalArgumentException;

}