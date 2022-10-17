package com.spring.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mvc.entity.Registermvc;



public interface RegisterRep extends JpaRepository<Registermvc, Long> {


	Registermvc findByUsername(String username);

	

}
