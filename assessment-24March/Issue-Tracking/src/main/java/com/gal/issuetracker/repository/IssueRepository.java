package com.gal.issuetracker.repository;

import com.gal.issuetracker.entity.Issue;
import com.gal.issuetracker.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface IssueRepository extends JpaRepository<Issue, Long> {

    @Query("SELECT i FROM Issue i WHERE i.employee = :employee AND i.resolved = false")
    List<Issue> getUnresolvedIssues(@Param("employee") Employee employee);

    @Query("SELECT i FROM Issue i WHERE i.createdDate BETWEEN :start AND :end")
    List<Issue> getIssuesThisMonth(@Param("start") LocalDate start,
                                  @Param("end") LocalDate end);

    @Query("SELECT DISTINCT i.employee.name FROM Issue i WHERE i.createdDate BETWEEN :start AND :end")
    List<String> getEmployeeNamesThisMonth(@Param("start") LocalDate start,
                                          @Param("end") LocalDate end);
}