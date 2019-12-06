package com.example.algamoney.api.repository.employee;

import java.util.List;

import com.example.algamoney.api.model.Employee;

public interface EmployeeService {
	public Employee getEmployeeById(Long id);

    public Employee getEmployeeByName(String name);

    public List<Employee> getAllEmployees();

    public boolean exists(String email);

    public Employee save(Employee employee);
}
