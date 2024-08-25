package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.EmployeeService;

@RestController
@RequestMapping("/employee")

public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public String addEmployee() {
        return employeeService.addEmployee();
    }

    @GetMapping("/remove")
    public String removeEmployee() {
        return employeeService.removeEmployee();
    }

    @GetMapping("/find")
    public String findEmployee() {
        return employeeService.findEmployee();
    }
}

