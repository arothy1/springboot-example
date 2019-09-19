package com.arothy.base.controller;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arothy.base.domain.Base;
import com.arothy.base.service.BaseService;
import com.arothy.core.http.HttpResponse;

@RestController
public abstract class BaseController<T extends Base, ID extends Serializable> {
	
	protected static final Logger logger = LoggerFactory.getLogger(BaseController.class);
	
	@Autowired protected BaseService<T, ID> service;

	public BaseController(BaseService<T, ID> service) {
		this.service = service;
	}
	
	@GetMapping("")
	public HttpResponse<Object> findAll(HttpServletRequest req, HttpServletResponse res) {
		return new HttpResponse<Object>(service.findAll());
	}
	
	@GetMapping("/{id}")
	public HttpResponse<Object> findById(@PathVariable Long id, HttpServletRequest req, HttpServletResponse res) {
		return new HttpResponse<Object>(service.findById(id));
	}
	
	@PostMapping("")
	public HttpResponse<Object> insert(@RequestBody T entity, HttpServletRequest req, HttpServletResponse res) {
		return new HttpResponse<Object>(service.insert(entity));
	}
	
	@PutMapping("")
	public HttpResponse<Object> update(@RequestBody T entity, HttpServletRequest req, HttpServletResponse res) {
		return new HttpResponse<Object>(service.update(entity));
	}
	
	@DeleteMapping("/{id}")
	public HttpResponse<Object> delete(@PathVariable Long id, HttpServletRequest req, HttpServletResponse res) {
		service.delete(id);
		return new HttpResponse<Object>();
	}
}
