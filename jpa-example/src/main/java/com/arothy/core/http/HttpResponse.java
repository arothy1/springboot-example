package com.arothy.core.http;

import java.util.Map;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

public @Data class HttpResponse<T> {
	
	protected T payload;
	private int status;
	@JsonInclude(Include.NON_NULL)
	private String error;
	private String message;

	public HttpResponse() {}
	
	public HttpResponse(T body) {
		this.payload = body;
		this.status = HttpStatus.OK.value();
		this.message = HttpStatus.OK.getReasonPhrase();
	}
	
	public HttpResponse(T body, Map<String, Object> errorMap) {
		this.payload = body;
		this.status = (Integer)errorMap.get("status");
		this.error = (String)errorMap.get("error");
		this.message = (String)errorMap.get("message");
	}
	
	@JsonIgnore
	public boolean isOk() {
		if (this.status == HttpStatus.OK.value())
			return true;
		return false;
	}
}
