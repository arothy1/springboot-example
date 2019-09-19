package com.arothy.core.exception;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arothy.core.http.HttpResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("${server.error.path:${error.path:/error}}")
public class BasicErrorController extends AbstractErrorController{

	public BasicErrorController(ErrorAttributes errorAttributes) {
		super(errorAttributes);
	}

	@Override
	public String getErrorPath() {
		return null;
	}
	
	@RequestMapping
	public HttpResponse<Object> error(HttpServletRequest request) {
		Map<String, Object> errorMap = getErrorAttributes(request, true);
		log.error((String)errorMap.get("trace"));
		return new HttpResponse<Object>(null, errorMap);
	}
}
