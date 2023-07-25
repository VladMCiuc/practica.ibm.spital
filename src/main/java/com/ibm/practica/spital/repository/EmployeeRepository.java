package com.ibm.practica.spital.repository;

import com.ibm.practica.spital.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,String > {
}
