package edu.udemy.lesson_1;

public class ReportFormatter {
	
	private String parseObjToXML(Object obj){
		String output = "converting " + obj + "to XML format..." + System.lineSeparator()+obj+" XML format convertting is done!";
		System.out.println("parseObjToXML is done");
		return output;
	}
	
	private String parseObjToCSV(Object obj){
		String output = "converting " + obj + "to CSV format..." + System.lineSeparator()+obj+" CSV format convertting is done!";
		System.out.println("parseObjToCSV is done");
		return output;
	}
	
	public void getFormattedValue()
}

