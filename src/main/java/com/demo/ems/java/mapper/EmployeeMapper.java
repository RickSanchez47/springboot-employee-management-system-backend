package com.demo.ems.java.mapper;

import com.demo.ems.java.dto.EmployeeDto;
import com.demo.ems.java.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstname(),
                employee.getLastname(),
                employee.getEmail()
                );
    }

    public static Employee mapEmployee(EmployeeDto employeeDto)
    {
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
