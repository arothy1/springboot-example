package com.arothy.api.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arothy.api.example.domain.Example;

@Repository
public interface ExampleRepository extends JpaRepository<Example, Long>{

}
