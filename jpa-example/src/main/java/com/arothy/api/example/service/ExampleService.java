package com.arothy.api.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.arothy.api.example.domain.Example;

public interface ExampleService {
	
	Example insert(Example example);
	Example update(Example example);
	void delete(Example example);
	Optional<Example> findById(Long id);
	List<Example> findAll();
}
