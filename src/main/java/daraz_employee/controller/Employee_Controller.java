package daraz_employee.controller;

import daraz_employee.entity.Employee;
import daraz_employee.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class Employee_Controller {
    @Autowired
    EmployeeRepository employeeRepository;
    @PostMapping("/insertEmp")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
      employeeRepository.save(employee);
      return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }
}
