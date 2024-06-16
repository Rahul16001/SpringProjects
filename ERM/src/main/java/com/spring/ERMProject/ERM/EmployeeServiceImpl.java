package com.spring.ERMProject.ERM;

import com.spring.ERMProject.ERM.EmployeeDAO.EmployeeDAO;
import com.spring.ERMProject.ERM.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDAO employeeDAO;

    @Autowired
    EmployeeServiceImpl(EmployeeDAO employeeDAO)
    {
        this.employeeDAO = employeeDAO;
    }


    @Override
    @Transactional
    public Employee save(Employee emp) {
        return employeeDAO.addData(emp);
    }

    @Override
    public List<Employee> getAllEmp()
    {
        return employeeDAO.getAllEmployee();
    }

    @Override
    public Employee getEmployee(Integer id) {
        return employeeDAO.getEmployee(id);
    }

    @Override
    @Transactional
    public String delEmp(Integer id)
    {
        return employeeDAO.delEmployee(id);
    }
}
