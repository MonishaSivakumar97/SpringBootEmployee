package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;

import com.example.demo.controller.EmployeeController;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTests {
	@MockBean
    private EmployeeController employeeController;
	@MockBean
    private EmployeeService employeeService;
	 @MockBean
	  private Employee Employee;
	  
    @BeforeEach
    public void setUp() {
    	employeeController = new EmployeeController();
    	employeeService = mock(EmployeeService.class);
    }
    @Test
    public void testViewHomePage() {
    	Model model = mock(Model.class);
    	when(employeeService.getAllEmployees()).thenReturn(Collections.emptyList());
    	
    	String viewName = employeeController.viewHomePage(model);
    	verify(model,times(1)).addAttribute(eq("listEmployees"),anyList());
    	assertEquals("index",viewName);
    }
  
}