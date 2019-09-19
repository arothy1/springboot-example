package com.arothy.api.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arothy.api.example.domain.Example;
import com.arothy.api.example.service.ExampleService;
import com.arothy.base.controller.BaseController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/example")
public class ExampleController extends BaseController<Example, Long>{
	
	@Autowired
	public ExampleController(ExampleService exampleService) {
		super(exampleService);
//		this.service = exampleService;
	}
}
