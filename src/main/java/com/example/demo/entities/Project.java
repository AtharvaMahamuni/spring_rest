package com.example.demo.entities;

public class Project {

	private long id;
	private String title;
	private String owner;
	
	public Project(long id, String title, String owner) {
		super();
		this.id = id;
		this.title = title;
		this.owner = owner;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", title=" + title + ", owner=" + owner + "]";
	}
	
	
}
