package com.se.bt2_nguyenanhhuy_18020831.repository;

import com.se.bt2_nguyenanhhuy_18020831.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

}
