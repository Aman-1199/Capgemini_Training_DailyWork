package com.gal.issuetracker.service;

import com.gal.issuetracker.entity.Employee;
import com.gal.issuetracker.entity.Issue;
import com.gal.issuetracker.repository.EmployeeRepository;
import com.gal.issuetracker.repository.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class IssueServiceImpl implements IssueService {

    @Autowired
    private IssueRepository issueRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Issue> getUnresolvedIssues(Long empId) {
        Employee emp = employeeRepository.findById(empId)
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        return issueRepository.getUnresolvedIssues(emp);
    }

    @Override
    public List<Issue> getIssuesThisMonth() {
        LocalDate start = LocalDate.now().withDayOfMonth(1);
        LocalDate end = LocalDate.now();

        return issueRepository.getIssuesThisMonth(start, end);
    }

    @Override
    public List<String> getEmployeeNamesThisMonth() {
        LocalDate start = LocalDate.now().withDayOfMonth(1);
        LocalDate end = LocalDate.now();

        return issueRepository.getEmployeeNamesThisMonth(start, end);
    }
}