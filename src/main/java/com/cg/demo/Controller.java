package com.cg.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private Services services;

	@PostMapping("/save")
	public void saveStudent(@RequestBody Student student) {
	 services.saveStudent(student);
	}

}
