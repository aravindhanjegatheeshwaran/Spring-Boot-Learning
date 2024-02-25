package com.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.study.Entity.HelloModel;
import com.study.repository.HelloRepository;

@RestController
@RequestMapping("/api/v1")
public class HelloController {
	
	@Autowired
	private HelloRepository helloRepository;

	@GetMapping("/helloworld")
	public List<HelloModel> hello() {
		return helloRepository.findAll();
	}
}

