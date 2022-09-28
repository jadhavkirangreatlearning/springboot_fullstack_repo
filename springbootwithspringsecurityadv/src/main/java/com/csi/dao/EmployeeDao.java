package com.csi.dao;

import java.util.List;

import com.csi.model.Employee;



public interface EmployeeDao {

	public List<Employee> findAll();

	public Employee findById(int id);

	public void save(Employee employee);

	public void deleteById(int id);

}
