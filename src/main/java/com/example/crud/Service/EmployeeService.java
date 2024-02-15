package com.example.crud.Service;
import com.example.crud.Model.Employee;
import com.example.crud.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;



    public Employee saveDetails(Employee employee) {
        return employeeRepository.save(employee);
    }


    public List<Employee> getall() {
        return employeeRepository.findAll();
    }


    public Employee updateDetails(Employee employee) {
        Employee updateEmployee = employeeRepository.findById(employee.getEmp_id()).orElse(null);
        if (updateEmployee != null) {
            updateEmployee.setEmp_name(employee.getEmp_name());
            updateEmployee.setEmp_mail_id(employee.getEmp_mail_id());
            employeeRepository.save(updateEmployee);
            return updateEmployee;
        }
        return null;

    }

    public String deleteDetails(int id) {
        employeeRepository.deleteById(id);
        return "deleted" + " " + id;
    }

    public List<Employee> saveEmployees(List<Employee> empData) {

        return employeeRepository.saveAll(empData);
    }
}

