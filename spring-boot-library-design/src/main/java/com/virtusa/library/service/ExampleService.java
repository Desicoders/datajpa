package com.virtusa.library.service;

import org.springframework.stereotype.Component;

import com.virtusa.library.model.GreatLearning;

@Component
public interface ExampleService {

	GreatLearning get();

	GreatLearning customInfo(String courseName, String courseType, String firstName, String lastname);

}