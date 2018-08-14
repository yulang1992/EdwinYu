package com.edwin.fsg.mapper;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<T,PK extends Serializable>{
	
	T getById(PK id);
	
	List<T>  findAll();

}
