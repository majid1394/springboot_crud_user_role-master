package com.springboot.crud.repositories;


import com.springboot.crud.entities.Employee;
import com.springboot.crud.entities.User;
import com.springboot.crud.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Employee, Long> {
    @Query("select u from Employee u where employee_code = :employee_code")
    public Employee getEmployeeByEmployee_code(@Param("employee_code") Long employee_code);

  }
