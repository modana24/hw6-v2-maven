package me.skypro_hw6v2.service;

import me.skypro_hw6v2.Employee;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class DepartamentService {

    private final EmployeeService employeeService;

    public DepartamentService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public Employee getMaxSalary(int departmentId) {
        return employeeService.findAll().stream()
                .filter(emp -> emp.getDepartmentId == departmentId)
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow();
    }


    public Employee getMinSalary(int departmentId) {

        return employeeService.findAll().stream()
                .min(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow();
        ;
    }

    public List<Employee> getAllEmployeesByDepartment(int departmentId) {
        return employeeService.findAll().stream()
                .filter(emp -> emp.getDepartmentId == departmentId)
                .collect(Collectors.toList());
    }


    public Map<Integer, List<Employee>> getAllEmployees() {
        return employeeService.findAll().stream()
                .collect(Collectors.groupingBy(emp-> emp.getDepartmentId));;
    }
}
