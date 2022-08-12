package org.simplilearn;

import java.time.LocalDate;

import org.simplilearn.entities.Emp;
import org.simplilearn.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaEx1Application implements CommandLineRunner{
	@Autowired
	private EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaEx1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Emp e1=new Emp();
		e1.setName("suresh");
		e1.setAddress("Chennai");
		e1.setDateOfJoin(LocalDate.of(2001, 01, 1));
		Emp e2=new Emp();
		e2.setName("ramesh");
		e2.setAddress("Hyd");
		e2.setDateOfJoin(LocalDate.of(2010, 05, 5));
		employeeRepository.save(e1);
		employeeRepository.save(e2);
	}

}
