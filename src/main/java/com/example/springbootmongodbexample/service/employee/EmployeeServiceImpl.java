package com.example.springbootmongodbexample.service.employee;

import com.example.springbootmongodbexample.domain.Employee;
import com.example.springbootmongodbexample.exception.ServiceException;
import com.example.springbootmongodbexample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Created 05/06/2022
 * @Author monir.hossain
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee create(Employee employee) throws ServiceException {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee update(String id, Employee employee) throws ServiceException {
        Optional<Employee> employeeData = employeeRepository.findById(id);
        if (employeeData.isPresent()) {
            Employee _employee = employeeData.get();
            _employee.setName(employee.getName());
            _employee.setAddress(employee.getAddress());
            _employee.setEmail(employee.getEmail());
            _employee.setMobileNumber(employee.getMobileNumber());
            return employeeRepository.save(_employee);
        }
        return null;
    }

    @Override
    public boolean delete(String id) throws ServiceException {
        employeeRepository.deleteById(id);
        return true;
    }

    @Override
    public Employee findById(String id) {
       Optional<Employee> employeeData = employeeRepository.findById(id);
        return employeeData.isPresent()? employeeData.get(): null;
    }

    @Override
    public Page<Employee> findAll(int page, int size) {
        Pageable pageable = PageRequest.of(page -1, size, Sort.by(Sort.Direction.ASC));
        return employeeRepository.findAll(pageable);
    }

    @Override
    public List<Employee> findAllEmployee() {
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employees:: add);
        return employees;
    }
}
