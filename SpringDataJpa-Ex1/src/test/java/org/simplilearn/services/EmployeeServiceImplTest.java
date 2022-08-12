package org.simplilearn.services;

import static org.hamcrest.CoreMatchers.any;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.verification.VerificationMode;
import org.simplilearn.SpringDataJpaEx1Application;
import org.simplilearn.entities.Emp;
import org.simplilearn.repositories.EmployeeRepository;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringDataJpaEx1Application.class)
class EmployeeServiceImplTest {
	@Mock
	private EmployeeRepository employeeRepository;
	@InjectMocks
	private EmployeeServiceImpl employeeServiceImpl;
	@Test
	void testInsert() {
		/*
		 * Emp e=new Emp(); e.setEno(1); e.setName("suresh"); e.setAddress("Chennai");
		 * e.setDateOfJoin(LocalDate.of(2001, 01, 05));
		 */
		when(employeeRepository.save(Mockito.any(Emp.class)))
        .thenAnswer(i -> i.getArguments()[0]);
		verify(employeeRepository, times(1)).save(Mockito.any(Emp.class));
	}

	@Test
	void testGetAll() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	void testGet() {
		fail("Not yet implemented");
	}

}
