package net.javaguides.springboot.repository;

import net.javaguides.springboot.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepository extends JpaRepository<employee, Long> {
}
