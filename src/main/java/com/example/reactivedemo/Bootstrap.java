package com.example.reactivedemo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.reactivedemo.domains.Category;
import com.example.reactivedemo.domains.Vendor;
import com.example.reactivedemo.repositories.CategoryRepository;
import com.example.reactivedemo.repositories.VendorRepository;

@Component
public class Bootstrap implements CommandLineRunner {
	
	private final CategoryRepository categoryRepository;
	private final VendorRepository vendorRepository;

	@Autowired
	public Bootstrap(CategoryRepository categoryRepository, VendorRepository vendorRepository) {
		this.categoryRepository = categoryRepository;
		this.vendorRepository = vendorRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("****** Starting Data Load ******");
		
		if(categoryRepository.count().block()==0) {
			
			//load data
			System.out.println("****** Load Data On Bootstrap ******");
			
			categoryRepository.save(Category.builder().description("Fruits").build()).block();
			categoryRepository.save(Category.builder().description("Nuts").build()).block();
			categoryRepository.save(Category.builder().description("Breads").build()).block();
			categoryRepository.save(Category.builder().description("Prawns").build()).block();
			
			System.out.println("Loaded Categories : "+categoryRepository.count().block());
			
			vendorRepository.save(Vendor.builder().firstName("J.K").lastName("Fruits").build()).block();
			vendorRepository.save(Vendor.builder().firstName("N.N").lastName("Nuts").build()).block();
			vendorRepository.save(Vendor.builder().firstName("A.S").lastName("Breads").build()).block();
			vendorRepository.save(Vendor.builder().firstName("F.N").lastName("Prawns").build()).block();
			
			System.out.println("Loaded Vendors : "+vendorRepository.count().block());
			
		}
		
		
	}

}
