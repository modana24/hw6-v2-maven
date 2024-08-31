package me.skypro_hw6v2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.EmployeeService;
import service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")

public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public String addEmployee(@RequestParam String firstName,
                              @RequestParam String lastName) {
        return service.add(firstName,lastName);
    }

    @GetMapping("/remove")
    public String removeEmployee(@RequestParam String firstName,
                                 @RequestParam String lastName) {
        return service.remove(firstName,lastName);
    }

    @GetMapping("/find")
    public String findEmployee(@RequestParam String firstName,
                               @RequestParam String lastName)  {
        return service.find(firstName,lastName);
    }

}