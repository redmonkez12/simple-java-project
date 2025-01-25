package com.dailycodebuffer.springbootdemo.service;

import java.util.List;

import com.dailycodebuffer.springbootdemo.model.Employee;

public interface EmployeeService {
    Employee save(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(String id);

    String deleteEmployeeById(String id);
}
