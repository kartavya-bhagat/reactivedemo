package com.example.reactivedemo.domains;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;



@Document
@Data
@Builder
public class Category {

@Id
private String id;

public String description;

}
