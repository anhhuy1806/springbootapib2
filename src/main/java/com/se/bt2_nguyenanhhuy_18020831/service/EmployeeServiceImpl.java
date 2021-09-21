package com.se.bt2_nguyenanhhuy_18020831.service;

import com.se.bt2_nguyenanhhuy_18020831.entity.Employee;
import com.se.bt2_nguyenanhhuy_18020831.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void saveEmployee(Employee e) {
        employeeRepository.save(e);
    }

    @Override
    public List<Employee> findAll() {

        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Employee findById(long id) {
        Optional<Employee> rs = employeeRepository.findById(Long.valueOf(id));
        Employee e = null;
        if(rs.isPresent()){
            e=rs.get();
        }else{
            throw new RuntimeException("Did not find");
        }
        return e;
    }

    @Override
    public void deleteById(long id) {
        employeeRepository.deleteById(Long.valueOf(id));
    }
}
