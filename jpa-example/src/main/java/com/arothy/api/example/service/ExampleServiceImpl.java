package com.arothy.api.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arothy.api.example.domain.Example;
import com.arothy.api.example.repository.ExampleRepository;

@Service
public class ExampleServiceImpl implements ExampleService{

	@Autowired ExampleRepository exampleRepository;
	
	protected ExampleServiceImpl(ExampleRepository exampleRepository) {
		this.exampleRepository = exampleRepository;
	}

	@Override
	public Example insert(Example example) {
		return exampleRepository.save(example);
	}

	@Override
	public Example update(Example example) {
		return exampleRepository.save(example);
	}

	@Override
	public void delete(Example example) {
		exampleRepository.delete(example);
	}

	@Override
	public Optional<Example> findById(Long id) {
		return exampleRepository.findById(id);
	}

	@Override
	public List<Example> findAll() {
		return exampleRepository.findAll();
	}

	
}
