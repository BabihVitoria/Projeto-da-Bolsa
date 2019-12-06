package com.example.algamoney.api.repository.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.algamoney.api.model.Employee;
import com.example.algamoney.api.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
 
    @Autowired
    private EmployeeRepository employeeRepository;
 
    
    public Employee getEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }


	@Override
	public Employee getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean exists(String email) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}
}