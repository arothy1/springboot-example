package com.arothy.api.example.service;

import org.springframework.stereotype.Service;

import com.arothy.api.example.domain.Example;
import com.arothy.api.example.repository.ExampleRepository;
import com.arothy.base.service.BaseServiceImpl;

@Service
public class ExampleServiceImpl extends BaseServiceImpl<Example, Long> implements ExampleService{

//	@Autowired ExampleRepository exampleRepository;
	
	protected ExampleServiceImpl(ExampleRepository exampleRepository) {
		super();
		this.repository = exampleRepository;
	}
}
