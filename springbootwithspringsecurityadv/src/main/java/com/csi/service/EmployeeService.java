package com.csi.service;

import java.util.List;

import com.csi.model.Employee;

public interface EmployeeService {

	public List<Employee> findAll();

	public Employee findById(int id);

	public void save(Employee employee);

	public void deleteById(int id);

}
