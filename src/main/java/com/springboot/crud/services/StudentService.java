package com.springboot.crud.services;

import java.util.List;

import com.springboot.crud.entities.Employee;
import com.springboot.crud.entities.User;
import com.springboot.crud.security.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import com.springboot.crud.repositories.StudentRepository;

@Service
public class StudentService {


	@Autowired
	StudentRepository studentrepository;

	public List<Employee> all() {
		return  null;
		//return studentrepository.findAll();
	}

	public Employee show(Long id) {
		return studentrepository.findById(id).orElseGet(null);
	}
	public Employee findEmployeeByEmployeeId(Long employee_code) {
		Employee employee = studentrepository.getEmployeeByEmployee_code(employee_code);

		if (employee == null) {
			/*throw new UsernameNotFoundException("employee not found");*/
			return  null;
		}

		return employee;
	}


	public Employee create(Employee student) {
		return studentrepository.save(student);
	}

	public Employee update(Employee student) {
		return studentrepository.save(student);
	}

	public void delete(Long id) {
		studentrepository.deleteById(id);
	}
}