package com.example.reactivedemo.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.reactivedemo.domains.Category;


public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {

}
