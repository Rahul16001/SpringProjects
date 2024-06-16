package com.spring.ERMProject.ERM;

import com.spring.ERMProject.ERM.EmployeeDAO.EmployeeDAO;
import com.spring.ERMProject.ERM.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ERM")
public class EmployeeRestController {
    EmployeeService employeeService;

    @Autowired
    EmployeeRestController(EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }
    @GetMapping("/employees")
    public List<Employee> getEmployeeData()
    {
        return employeeService.getAllEmp();
    }

    @PostMapping("/employees")
    public Employee putData(@RequestBody Employee theEmp)
    {
        return employeeService.save(theEmp);
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable Integer employeeId)
    {
        return employeeService.getEmployee(employeeId);
    }



}
