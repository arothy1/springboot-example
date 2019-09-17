package com.arothy.api.example.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.arothy.api.example.domain.Example;
import com.arothy.api.example.service.ExampleService;

@RestController
@RequestMapping("/sample")
public class ExampleController {
	
	@Autowired ExampleService exampleService;

	@Autowired
	public ExampleController(ExampleService exampleService) {
		this.exampleService = exampleService;
	}
	
	@PostMapping("")
	public @ResponseBody String insert(@RequestBody Example example, HttpServletRequest req, HttpServletResponse res) throws Exception {
		return exampleService.insert(example).toString();
	}
	
	@PutMapping("")
	public @ResponseBody String update(@RequestBody Example example, HttpServletRequest req, HttpServletResponse res) throws Exception {
		return exampleService.update(example).toString();
	}
	
	@GetMapping("")
	public String findAll(HttpServletRequest req, HttpServletResponse res) throws Exception {
		return exampleService.findAll().toString();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody String findById(@PathVariable Long id, HttpServletRequest req, HttpServletResponse res) throws Exception {
		return exampleService.findById(id).toString();
	}
}
