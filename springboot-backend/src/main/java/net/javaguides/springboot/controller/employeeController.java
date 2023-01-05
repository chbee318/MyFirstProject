package net.javaguides.springboot.controller;

import net.javaguides.springboot.entity.employee;
import net.javaguides.springboot.repository.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:8081/")
public class employeeController {
    @Autowired
    private employeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<employee> fetchEmployees(){
        return employeeRepository.findAll();
    }
}
