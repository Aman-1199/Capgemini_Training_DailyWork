package com.gal.issuetracker.controller;

import com.gal.issuetracker.entity.Issue;
import com.gal.issuetracker.service.IssueService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/issues")
public class IssueController {

    private static final Logger logger = LoggerFactory.getLogger(IssueController.class);

    @Autowired
    private IssueService issueService;

    @GetMapping("/employee/{id}/unresolved")
    public List<Issue> getUnresolved(@PathVariable Long id) {
        logger.info("Fetching unresolved issues for employee {}", id);
        return issueService.getUnresolvedIssues(id);
    }

    @GetMapping("/this-month")
    public List<Issue> getThisMonthIssues() {
        logger.info("Fetching issues for this month");
        return issueService.getIssuesThisMonth();
    }

    @GetMapping("/employees/this-month")
    public List<String> getEmployeeNames() {
        logger.info("Fetching employee names who raised issues this month");
        return issueService.getEmployeeNamesThisMonth();
    }
}