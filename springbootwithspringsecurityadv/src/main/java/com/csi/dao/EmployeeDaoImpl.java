package com.csi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.csi.model.Employee;
import com.csi.repository.EmployeeRepository;

@Component
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	EmployeeRepository employeeRepositoryImpl;
	
	
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepositoryImpl.findAll();
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return employeeRepositoryImpl.findById(id).get();
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepositoryImpl.save(employee);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		employeeRepositoryImpl.deleteById(id);
	}

}
