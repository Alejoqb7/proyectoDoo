package co.edu.uco.ucobet.data.dao;

import java.util.List;

interface RetrieveDAO <T, I>{
	
	T findByID(I ID);
	
	List<T> findAll();
	
	List<T> findByFilter(T filter);
}
