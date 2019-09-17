package com.arothy.base.domain;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

import lombok.NonNull;

@MappedSuperclass
@NonNull
public class Base implements Serializable{

	private static final long serialVersionUID = 7361033171374208425L;

}
