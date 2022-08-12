package com.virtusa.library.serviceImpl;

import org.springframework.stereotype.Service;

import com.virtusa.library.model.FullName;
import com.virtusa.library.model.GreatLearning;
import com.virtusa.library.service.ExampleService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ExampleServiceImpl implements ExampleService {

	@Override
	public GreatLearning get() {
		log.info("Inside get() method");
		GreatLearning greatLearning = new GreatLearning();
		greatLearning.setCourseName("Learn Controllers in Spring boot");
		greatLearning.setCourseType("Information Technology");
		greatLearning.setInstrutorName(FullName.builder().firstName("Samarth").lastName("Narula").build());
		return greatLearning;
	}
	
	@Override
	public GreatLearning customInfo(String courseName, String courseType, String firstName, String lastname) {
		log.info("Inside customInfo() method");
		GreatLearning greatLearning = new GreatLearning();
		greatLearning.setCourseName(courseName);
		greatLearning.setCourseType(courseType);
		greatLearning.setInstrutorName(FullName.builder().firstName("Samarth").lastName("Narula").build());
		//greatLearning.setInstrutorName(instructorName);
		return greatLearning;
	}
	
}





