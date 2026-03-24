package com.gal.issuetracker.repository;

import com.gal.issuetracker.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT DISTINCT e.name FROM Employee e JOIN e.issues i WHERE i.createdDate BETWEEN :start AND :end")
    List<String> findEmployeeNamesWithIssuesThisMonth(LocalDate start, LocalDate end);
}