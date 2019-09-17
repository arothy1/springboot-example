package com.arothy.api.example.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Example implements Serializable {
	
	private static final long serialVersionUID = 8589055996450884997L;

	@Id
	@GeneratedValue
	private Long id;
	private String contents;
}
