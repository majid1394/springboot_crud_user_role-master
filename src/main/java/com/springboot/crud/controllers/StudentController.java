package com.springboot.crud.controllers;

import java.util.List;


import com.springboot.crud.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.springboot.crud.services.StudentService;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class StudentController {
	@Autowired
	StudentService studentservice;

	@GetMapping("/")
	public String index(Model model) {
/*		Employee employee = studentservice.findEmployeeByEmployeeId(employee_code);
		model.addAttribute("employee", employee);*/
		/*Employee employee = studentservice.findEmployeeByEmployeeId();
		model.addAttribute("employee", employee);
		return "searchEmployee";*/


		List<Employee> employees = studentservice.all();
		model.addAttribute("employee", employees);
		return "index";

	}

	@GetMapping("/create")
	public String create(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "create";
	}

	@PostMapping("/store")
	public String store(Employee student) {
		studentservice.create(student);
		return "redirect:/";
	}

	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable(name = "id") Long id) {
		Employee employee = studentservice.show(id);

		model.addAttribute("employee", employee);
		return "edit";
	}

	@PostMapping("/update")
	public String update(Employee employee) {
		studentservice.update(employee);
		return "redirect:/";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable(name = "id") Long id) {
		studentservice.delete(id);
		return "redirect:/";
	}

	@GetMapping("/search")
	public String searchEmployee() {
		return "searchEmployee";
	}

	@PostMapping("/search")
	public String searchEmployeeById(@RequestParam("employeeCode") Long employee_code, Model model) {
		Employee employee = studentservice.findEmployeeByEmployeeId(employee_code);
		model.addAttribute("employee", employee);
		return "searchEmployee";
	}

}