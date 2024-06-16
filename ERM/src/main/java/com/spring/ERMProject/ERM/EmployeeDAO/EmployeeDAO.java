package com.spring.ERMProject.ERM.EmployeeDAO;

import com.spring.ERMProject.ERM.EmployeeServiceImpl;
import com.spring.ERMProject.ERM.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployee();
    Employee addData(Employee emp);
    Employee getEmployee(Integer id);
    String delEmployee(Integer id);
}
