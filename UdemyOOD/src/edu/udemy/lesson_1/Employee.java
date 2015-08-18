package edu.udemy.lesson_1;

public class Employee {
	private int id;
	private String name;
	private String department;
	private boolean working;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public boolean isWorking() {
		return working;
	}
	public void setWorking(boolean working) {
		this.working = working;
	}
	
	public String toString(){
		return String.format("Name: %1$s%nID: %2$d%nDepartment: %3$S%nWorking: %4$B%n" , name, id, department, working);
	}
	

}
