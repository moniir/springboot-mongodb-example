package com.example.springbootmongodbexample.controller;

import com.example.springbootmongodbexample.domain.Employee;
import com.example.springbootmongodbexample.repository.EmployeeRepository;
import com.example.springbootmongodbexample.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Created 05/06/2022
 * @Author monir.hossain
 */
@RestController
@RequestMapping("/api")
public class EmployeeController {

@Autowired
private EmployeeService employeeService;

@Autowired
private EmployeeRepository employeeRepository;

    @PostMapping("/addEmployee")
    public ResponseEntity<Employee> placeQuotation(@RequestBody Employee employee) {
        try {
            Employee employeeItem = employeeService.create(employee);
            return new ResponseEntity<>(employeeItem, HttpStatus.CREATED);
        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/employee/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") String id, @RequestBody Employee employee) {
        Employee _employee = employeeService.update(id,employee);
        if(employee != null)
            return new ResponseEntity<>(employee, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllTutorials() {
        try {
            List<Employee> employees = new ArrayList<>();
                employeeService.findAllEmployee().forEach(employees::add);
            if (employees.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(employees, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") String id) {
        Employee employeeData = employeeService.findById(id);
        if (employeeData != null) {
            return new ResponseEntity<>(employeeData, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable("id") String id) {
        try {
            employeeService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
