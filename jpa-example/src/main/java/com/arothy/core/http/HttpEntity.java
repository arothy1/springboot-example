package com.arothy.core.http;

import java.io.Serializable;

import lombok.Data;

public @Data class HttpEntity<T> implements Serializable {

	private static final long serialVersionUID = -1672689510927140884L;

	public static final HttpEntity<?> EMPTY = new HttpEntity<Object>();

	protected T payload;

	protected HttpEntity() {
		this(null);
	}

	public HttpEntity(T payload) {
		this.payload = payload;
	}

	public boolean hasPayload() {
		return (this.payload != null);
	}
}
