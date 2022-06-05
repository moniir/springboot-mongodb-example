package com.example.springbootmongodbexample.repository;

import com.example.springbootmongodbexample.domain.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Created 05/06/2022
 * @Author monir.hossain
 */
public interface EmployeeRepository extends MongoRepository<Employee,String> {

}
