package com.example.reactivedemo.domains;

import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;

import lombok.Builder;
import lombok.Data;

@Data
@Document
@Builder
public class Vendor {
	
	@Id
	private String id;
	
	private String firstName;
	
	private String lastName;

}
