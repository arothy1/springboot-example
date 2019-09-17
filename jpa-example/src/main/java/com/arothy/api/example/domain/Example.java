package com.arothy.api.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.arothy.base.domain.Base;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Example extends Base{
	
	private static final long serialVersionUID = 8589055996450884997L;

	@Id
	@GeneratedValue
	private Long id;
	private String contents;
}
