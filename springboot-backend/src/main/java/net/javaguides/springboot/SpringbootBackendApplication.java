package net.javaguides.springboot;

import net.javaguides.springboot.repository.employeeRepository;
import net.javaguides.springboot.entity.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendApplication.class, args);
    }

    @Autowired
    private employeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        employee employee1 = employee.builder()
                .firstName("Ramesh")
                .lastName("Ali")
                .email("ramesh@gmail.com")
                .build();

        employee employee2 = employee.builder()
                .firstName("Mutu")
                .lastName("Lee")
                .email("mutu@gmail.com")
                .build();

        employee employee3 = employee.builder()
                .firstName("John")
                .lastName("Kee")
                .email("john@gmail.com")
                .build();

        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
        employeeRepository.save(employee3);
    }
}
