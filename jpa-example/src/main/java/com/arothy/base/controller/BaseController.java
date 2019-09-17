package com.arothy.base.controller;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.arothy.base.domain.Base;
import com.arothy.base.service.BaseService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public abstract class BaseController<T extends Base, ID extends Serializable> {
	
	@Autowired protected BaseService<T, ID> service;

	public BaseController(BaseService<T, ID> service) {
		this.service = service;
	}
	
	@GetMapping("")
	public String findAll(HttpServletRequest req, HttpServletResponse res) {
		try {
			return service.findAll().toString();
		} catch (Exception e) {
			log.error(e.getMessage());
			return null;
		}
	}
	
	@GetMapping("/{id}")
	public @ResponseBody String findById(@PathVariable Long id, HttpServletRequest req, HttpServletResponse res) {
		try {
			return service.findById(id).toString();
		} catch (Exception e) {
			log.error(e.getMessage());
			return null;
		}
		
	}
	
	@PostMapping("")
	public @ResponseBody String insert(@RequestBody T entity, HttpServletRequest req, HttpServletResponse res) {
		try {
			return service.insert(entity).toString();
		} catch (Exception e) {
			log.error(e.getMessage());
			return null;
		}
	}
	
	@PutMapping("")
	public @ResponseBody String update(@RequestBody T entity, HttpServletRequest req, HttpServletResponse res) {
		try {
			return service.update(entity).toString();
		} catch (Exception e) {
			log.error(e.getMessage());
			return null;
		}
	}
	
	@DeleteMapping("/{id}")
	public @ResponseBody String delete(@PathVariable Long id, HttpServletRequest req, HttpServletResponse res) {
		try {
			return "ok";
		} catch (Exception e) {
			log.error(e.getMessage());
			return "fail";
		}
	}
}
