package com.gal.issuetracker.service;

import com.gal.issuetracker.entity.Issue;
import java.util.List;

public interface IssueService {

    List<Issue> getUnresolvedIssues(Long empId);

    List<Issue> getIssuesThisMonth();

    List<String> getEmployeeNamesThisMonth();
}