package org.simplilearn.services;

import java.util.List;

import org.simplilearn.entities.Emp;

public interface EmployeeService {
	void insert(Emp e);
	List<Emp> getAll();
	void delete(int eno);
	Emp get(int eno);
}
