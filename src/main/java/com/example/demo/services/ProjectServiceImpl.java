package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Project;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	List<Project> list;

	public ProjectServiceImpl() {
		list = new ArrayList<>();
		list.add(new Project(111, "Stark enterprise", "Tony Stark"));
		list.add(new Project(2222, "XYZ company", "Peter Parker"));
	}
	
	@Override
	public List<Project> getProjects() {
		// TODO Auto-generated method stub
		return list;
	}

}
 