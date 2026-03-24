package com.gal.issuetracker.controller;

import com.gal.issuetracker.service.IssueService;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(IssueController.class)
public class IssueControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private IssueService issueService;

    @Test
    void testGetUnresolvedIssues() throws Exception {

        Mockito.when(issueService.getUnresolvedIssues(1L))
                .thenReturn(List.of());

        mockMvc.perform(get("/issues/employee/1/unresolved"))
                .andExpect(status().isOk());
    }

    @Test
    void testGetIssuesThisMonth() throws Exception {

        Mockito.when(issueService.getIssuesThisMonth())
                .thenReturn(List.of());

        mockMvc.perform(get("/issues/this-month"))
                .andExpect(status().isOk());
    }

    @Test
    void testGetEmployeeNamesThisMonth() throws Exception {

        Mockito.when(issueService.getEmployeeNamesThisMonth())
                .thenReturn(List.of("Aman", "Aditya"));

        mockMvc.perform(get("/issues/employees/this-month"))
                .andExpect(status().isOk());
    }
}