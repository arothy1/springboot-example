package com.arothy.api.example.repository;

import org.springframework.stereotype.Repository;

import com.arothy.api.example.domain.Example;
import com.arothy.base.repository.BaseRepository;

@Repository
public interface ExampleRepository extends BaseRepository<Example, Long>{

}
