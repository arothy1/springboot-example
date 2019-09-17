package com.arothy.base.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseService<T, ID extends Serializable> {
	
	T insert(T example);
	T update(T example);
	void delete(Long id);
	Optional<T> findById(Long id);
	List<T> findAll();
}
