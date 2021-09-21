package com.se.bt2_nguyenanhhuy_18020831.service;

import com.se.bt2_nguyenanhhuy_18020831.entity.Employee;
import com.se.bt2_nguyenanhhuy_18020831.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    void saveEmployee(Employee e);
    List<Employee> findAll();
    Employee findById(long id);
    void deleteById(long id);
}
