package com.edwin.fsg.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T,PK extends Serializable>{
	
	T getById(PK id);
	
	List<T>  findAll();

}
