package me.skypro_hw6v2.controller.controller;

import me.skypro_hw6v2.Employee;
import me.skypro_hw6v2.service.DepartamentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departaments")

public class DepartamentController {

    private DepartamentService departamentService;

    public DepartamentController(DepartamentService departamentService) {
        this.departamentService = departamentService;
    }

    @GetMapping("/max-salary")
    public Employee getMaxSalary(@RequestParam("departmentId") int departmentId) {
return departamentService.getMaxSalary(departmentId);
    }

    @GetMapping("/min-salary")
    public Employee getMinSalary(@RequestParam("departmentId") int departmentId) {
return departamentService.getMinSalary(departmentId);
    }

    @GetMapping("/all/by-department")
    public List<Employee> getAllEmployeesByDepartment(@RequestParam("departmentId") int departmentId) {
return departamentService.getAllEmployeesByDepartment(departmentId);
    }

    @GetMapping("all")
    public Map<Integer, List<Employee>> getAllEmployees() {
return departamentService.getAllEmployees();
    }
}

