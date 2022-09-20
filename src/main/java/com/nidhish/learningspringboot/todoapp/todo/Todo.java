package com.nidhish.learningspringboot.todoapp.todo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

//JPA
//Bean -> Database

@Entity
public class Todo {
	
	@Id
	@GeneratedValue
	private int id;
	private String username;
	
	@Size(min=10, message="Enter atleast 10 character")
	private String description;
	private LocalDate dateTarget;
	private boolean done;
	
	public Todo() {};
	
	public Todo(int id, String username, String description, LocalDate dateTarget, boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.dateTarget = dateTarget;
		this.done = done;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", dateTarget="
				+ dateTarget + ", done=" + done + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDateTarget() {
		return dateTarget;
	}
	public void setDateTarget(LocalDate dateTarget) {
		this.dateTarget = dateTarget;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
}
