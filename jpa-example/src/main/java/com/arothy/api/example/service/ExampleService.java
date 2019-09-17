package com.arothy.api.example.service;

import java.util.List;
import java.util.Optional;

import com.arothy.api.example.domain.Example;
import com.arothy.base.service.BaseService;

public interface ExampleService extends BaseService<Example, Long>{
	
	Example insert(Example example);
	Example update(Example example);
	void delete(Example example);
	Optional<Example> findById(Long id);
	List<Example> findAll();
}
