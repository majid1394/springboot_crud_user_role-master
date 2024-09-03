package com.springboot.crud.entities;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "employee")
@Component
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "employee_code", updatable = false, nullable = false, unique = true)
    private Long employee_code;
    @Column(name = "firstname", length = 50, nullable = false, unique = false)
    public String firstName;

    @Column(name = "lastname", length = 50, nullable = false, unique = false)
    private String lastName;

    @Column(name = "national_code", length = 50, nullable = false, unique = true)
    private String national_code;

    @Column(name = "birthday", length = 50, nullable = false)
    private String birthday;

    @Column(name = "yearOfEmployment", length = 50, nullable = false)
    private String yearOfEmployment;


    public Employee() {
        super();
    }

    public Employee(Long id, Long employee_code,String firstName, String lastName, String national_code, String birthday, String yearOfEmployment) {
        super();
        this.id = id;
        this.employee_code=employee_code;
        this.firstName = firstName;
        this.lastName = lastName;
        this.national_code = national_code;
        this.birthday = birthday;
        this.yearOfEmployment = yearOfEmployment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployee_code() {
        return employee_code;
    }

    public void setEmployee_code(Long employee_code) {
        this.employee_code = employee_code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getNational_code() {
        return national_code;
    }

    public void setNationalCode(String national_code) {
        this.national_code = national_code;
    }


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


    public String getYearOfEmployment() {return yearOfEmployment;	}

    public void setYearOfEmployment(String yearOfEmployment) {this.yearOfEmployment =yearOfEmployment;	}



    @Override
    public String toString() {
        return "Student [id=" + id + ", employee_code =" + employee_code + "firstName=" + firstName + ", lastName=" + lastName +
                "national_code=" + national_code + "birthday =" + birthday + "yearOfEmployment= " + yearOfEmployment + "]";
    }




}