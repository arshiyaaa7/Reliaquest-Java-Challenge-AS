package com.challenge.api.model;

import java.time.Instant;
import java.util.UUID;

public class EmployeeImpl implements Employee {

    private UUID uuid;
    private String firstName;
    private String lastName;
    private String fullName;
    private Integer salary;
    private Integer age;
    private String jobTitle;
    private String email;
    private Instant contractHireDate;
    private Instant contractTerminationDate;

    // UUID

    @Override
    public UUID getUuid() { return uuid; }

    @Override
    public void setUuid(UUID uuid) { this.uuid = uuid; }

    // First Name, Last Name, Full Name

    @Override
    public String getFirstName() { return firstName; }

    @Override
    public void setFirstName(String name) { this.firstName = name; }

    @Override
    public String getLastName() { return lastName; }

    @Override
    public void setLastName(String name) { this.lastName = name; }

    @Override
    public String getFullName() { return fullName; }

    @Override
    public void setFullName(String name) { this.fullName = name; }

    // Salary, Age, Job Title, Email

    @Override
    public Integer getSalary() { return salary; }

    @Override
    public void setSalary(Integer salary) { this.salary = salary; }

    @Override
    public Integer getAge() { return age; }

    @Override
    public void setAge(Integer age) { this.age = age; }

    @Override
    public String getJobTitle() { return jobTitle; }

    @Override
    public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }

    @Override
    public String getEmail() { return email; }

    @Override
    public void setEmail(String email) { this.email = email; }

    // Contract Hire Date, Contract Termination Date

    @Override
    public Instant getContractHireDate() { return contractHireDate; }

    @Override
    public void setContractHireDate(Instant date) { this.contractHireDate = date; }

    @Override
    public Instant getContractTerminationDate() { return contractTerminationDate; }

    @Override
    public void setContractTerminationDate(Instant date) { this.contractTerminationDate = date; }
}
