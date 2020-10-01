package com.example.reactivedemo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reactivedemo.domains.Category;
import com.example.reactivedemo.repositories.CategoryRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	private final CategoryRepository categoryRepository;

	public CategoryController(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	// Get list of categories
	@GetMapping("/list")
	Flux<Category> list(){
		return categoryRepository.findAll();
	}
	
	// Find one category by id
	@GetMapping("/list/{id}")
	Mono<Category> getById(@PathVariable String id){
		return categoryRepository.findById(id);
	}

}
