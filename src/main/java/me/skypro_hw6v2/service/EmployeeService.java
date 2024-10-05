package me.skypro_hw6v2.service;

import me.skypro_hw6v2.Employee;

import java.util.Collection;
import java.util.Collections;

public interface EmployeeService {
    Employee add(String firstName, String lastName);
    Employee remove(String firstName, String lastName);
    Employee find(String firstName, String lastName);
    Collections<Employee> findAll();



}
