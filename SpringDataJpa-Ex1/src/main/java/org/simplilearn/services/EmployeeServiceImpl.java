package org.simplilearn.services;

import java.util.List;

import javax.transaction.Transactional;

import org.simplilearn.entities.Emp;
import org.simplilearn.exceptions.EmployeeNotFoundException;
import org.simplilearn.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void insert(Emp e) {
		employeeRepository.save(e);
	}

	@Override
	public List<Emp> getAll() {
		return employeeRepository.findAll();
	}

	@Override
	public void delete(int eno) {
		employeeRepository.deleteById(eno);
	}

	@Override
	public Emp get(int eno) {
		
		return employeeRepository.findById(eno).orElseThrow(()->new EmployeeNotFoundException("employee not found"));
	}

}
