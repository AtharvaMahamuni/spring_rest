package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Project;
import com.example.demo.services.ProjectService;

@RestController
public class MyController {
	
	@Autowired
	private ProjectService projectService;

	@GetMapping("/home")
	public String home() {
		return "This is home page";
	}

	@GetMapping("/projectlist")
	public List<Project> projectlist() {
		return this.projectService.getProjects();	
	}
}
