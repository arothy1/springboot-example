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
	
	
	

//	@Override
//	public List<T> list() {
//		return this.repository.findAll();
//	}
//	
//	@Override
//	public Page<T> list(Pageable pageable) {
//		return this.repository.findAll(pageable);
//	}
//
//	@Override
//	public T save(T entity) {
//		return this.repository.save(entity);
//	}
//	
//	@Override
//	public T find(Long id) {
//		return this.repository.findOne(id);
//	}
//	
//	@Override
//	public T find(T entity) {
//		return this.repository.findOne(entity);
//	}
//
//	@Override
//	public T delete(Long id) throws CoreException{
//		try {
//			T result = this.repository.findOne(id);
//			this.repository.delete(id);
//			return result;
//		} catch (Exception e) {
//			throw new CoreException(EhrErrorCode.ECS_NOT_EXIST);
//		}
//	}
//
//	@Override
//	public List<T> save(Iterable<T> entities) {
//		return this.repository.save(entities);
//	}



}

