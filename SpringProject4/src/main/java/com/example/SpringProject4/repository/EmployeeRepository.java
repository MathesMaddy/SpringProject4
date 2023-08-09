package com.example.SpringProject4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.SpringProject4.model.Employee;

public interface EmployeeRepository extends JpaRepository <Employee , Long>{

}
