package com.cg.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicesImpl implements Services {

	@Autowired
	private Repo repo;

	@Override
	public void saveStudent(Student student) {
		repo.save(student);

	}

}
