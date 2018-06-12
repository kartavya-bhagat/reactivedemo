package com.example.reactivedemo.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.reactivedemo.domains.Vendor;


public interface VendorRepository extends ReactiveMongoRepository<Vendor, String> {
	

}
