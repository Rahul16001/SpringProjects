package com.spring.ERMProject.ERM;

import com.spring.ERMProject.ERM.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee save(Employee emp);
    List<Employee> getAllEmp();

    Employee getEmployee(Integer id);

    String delEmp(Integer id);

}
