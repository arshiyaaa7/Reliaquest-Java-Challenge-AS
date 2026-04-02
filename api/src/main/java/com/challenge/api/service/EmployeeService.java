package com.challenge.api.service;

import com.challenge.api.model.Employee;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.*;

@Service
public class EmployeeService {

    // Map acting as an in-memory data store for Employee records, keyed by their UUID
    private final Map<UUID, Employee> employeeStore = new HashMap<>();

    public List<Employee> getAllEmployees() {
        if (employeeStore.isEmpty()) {
            throw new RuntimeException("No employees found");
        }
        return new ArrayList<>(employeeStore.values());
    }

    public Employee getEmployeeByUuid(UUID uuid) {
        Employee employee = employeeStore.get(uuid);

        if (employee == null) {
            throw new RuntimeException("Employee not found");
        }

        return employee;
    }

    public Employee createEmployee(Employee employee) {
        if (employee.getFirstName() == null || employee.getLastName() == null) {
            throw new RuntimeException("First name and last name are required");
        }

        UUID uuid = UUID.randomUUID();
        employee.setUuid(uuid);
        employee.setContractHireDate(Instant.now());

        employeeStore.put(uuid, employee);
        return employee;
    }
}