package edu.udemy.lesson_1;

public class CSVFormatType implements FormatType {

	@Override
	public String reportToFormat(Object obj) {
		String output = "converting " + obj + "to CSV format..." + System.lineSeparator()+obj+" CSV format convertting is done!";
		System.out.println("parseObjToCSV is done");
		return output;
	}

}
