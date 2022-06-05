package com.example.springbootmongodbexample.service.employee;

import com.example.springbootmongodbexample.domain.Employee;
import com.example.springbootmongodbexample.service.AbstractService;

import java.util.List;

/**
 * @Created 05/06/2022
 * @Author monir.hossain
 */
public interface EmployeeService extends AbstractService<Employee> {

    List<Employee> findAllEmployee();
}
