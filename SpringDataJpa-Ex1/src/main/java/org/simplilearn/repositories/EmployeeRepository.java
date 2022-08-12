package org.simplilearn.repositories;

import org.simplilearn.entities.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Emp, Integer>{

}
