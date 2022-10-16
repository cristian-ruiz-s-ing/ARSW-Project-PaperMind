package edu.eci.arsw.commons;

import java.io.Serializable;
import java.util.ArrayList;

public interface GenericServiceAPI<T, ID extends Serializable> {
	
	T save(T entity);
	
	void delete(ID id);
	
	T get(ID id);

	ArrayList<T> getAll();
}
