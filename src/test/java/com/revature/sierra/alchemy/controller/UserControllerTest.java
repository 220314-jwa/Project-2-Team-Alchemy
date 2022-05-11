package com.revature.sierra.alchemy.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.sierra.alchemy.MVC.Application;
import com.revature.sierra.alchemy.MVC.Controllers.UsersController;
import com.revature.sierra.alchemy.MVC.Service.UserService;

@SpringBootTest(classes=Application.class)
public class UserControllerTest {
	@MockBean
	private UserService userServ;
	@Autowired
	private UsersController usersController;
	@Autowired
	private WebApplicationContext context;
	
	private ObjectMapper jsonMapper= new ObjectMapper();
	// obj mapper will allow for deeper testing jackson obj mapper  to  map obj to JSON


	// set up the Mockito spring mvc setup and mock http request
	private MockMvc mockMvc;
	
	@BeforeEach
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test 
	public void getLogIn() throws Exception {
		when(userServ.getLogIn(null)).thenReturn(null);
		//perform setup HTTP request
		//and the expect methods expects from the HTTP
		mockMvc.perform(get("/login"))
			.andExpect(status().isOk());
	}
}
