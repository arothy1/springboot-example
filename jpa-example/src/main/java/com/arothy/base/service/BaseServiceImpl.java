package com.arothy.base.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.NoRepositoryBean;

import com.arothy.base.domain.Base;
import com.arothy.base.repository.BaseRepository;

public class BaseServiceImpl<T extends Base, ID extends Serializable> implements BaseService<T, ID> {

	protected BaseRepository<T, ?> repository;

	@Override
	public T insert(T entity) {
		return repository.save(entity);
	}

	@Override
	public T update(T entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}

	@Override
	public Optional<T> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<T> findAll() {
		return repository.findAll();
	}

}

