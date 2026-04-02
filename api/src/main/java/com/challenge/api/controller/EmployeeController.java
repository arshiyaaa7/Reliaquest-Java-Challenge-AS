package com.challenge.api.controller;

import com.challenge.api.model.Employee;
import java.util.List;
import java.util.UUID;

import com.challenge.api.model.EmployeeImpl;
import com.challenge.api.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // Read Endpoints

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{uuid}")
    public Employee getEmployeeByUuid(@PathVariable UUID uuid) {
        return employeeService.getEmployeeByUuid(uuid);
    }

    // Create Endpoint

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee createEmployee(@RequestBody EmployeeImpl employee) {
        return employeeService.createEmployee(employee);
    }
}
