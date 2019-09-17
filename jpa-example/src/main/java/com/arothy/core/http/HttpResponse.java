package com.arothy.core.http;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
public @Data class HttpResponse<T> extends HttpEntity<T> {
	
	private static final long serialVersionUID = -5768963793025971631L;
	
	private int status;

	public HttpResponse() {}
	public HttpResponse(int status) {
		super();
		this.status = status;
	}
	public HttpResponse(T payload) {
		super(payload);
		this.status = HttpStatus.OK.value();
	}
	public HttpResponse(int status, T payload) {
		super(payload);
		this.status = status;
	}
	@JsonIgnore
	public boolean isOk() {
		if (this.status == HttpStatus.OK.value())
			return true;
		return false;
	}
}
