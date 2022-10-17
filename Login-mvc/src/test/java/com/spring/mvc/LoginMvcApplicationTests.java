package com.spring.mvc;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.mvc.entity.Registermvc;
import com.spring.mvc.repository.RegisterRep;


@SpringBootTest
class LoginMvcApplicationTests {

	@Autowired
	private RegisterRep regrepo;
	

	
	@Test
	void finAllrecord() {
		List<Registermvc> findAll = regrepo.findAll();
		for(Registermvc mvc : findAll) {
			System.out.println(mvc.getEmail());
		}
	}
	
	@Test
	void updateRecord() {
		Optional<Registermvc> findById = regrepo.findById(2L);
		Registermvc r = findById.get();
		r.setUsername("anujabhay");
		regrepo.save(r);
	}
	
	
	
}
