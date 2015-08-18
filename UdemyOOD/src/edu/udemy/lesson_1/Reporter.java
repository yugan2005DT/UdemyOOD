package edu.udemy.lesson_1;

public class Reporter {
	
	private Employee emp;
	private FormatType format;
	
	public Reporter(Employee emp, FormatType format){
		this.emp = emp;
		this.format = format;
	}
	
	public String report(){
		return format.reportToFormat(emp);
	}

}
