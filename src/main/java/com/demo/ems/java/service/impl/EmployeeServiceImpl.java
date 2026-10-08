package com.demo.ems.java.service.impl;

import com.demo.ems.java.dto.EmployeeDto;
import com.demo.ems.java.repository.EmployeeRepository;
import com.demo.ems.java.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        return null;
    }
}
