package edu.udemy.lesson_1;

public class XMLReportType implements FormatType {

	@Override
	public String reportToFormat(Object obj) {
		String output = "converting " + obj + "to XML format..." + System.lineSeparator()+obj+" XML format convertting is done!";
		System.out.println("parseObjToXML is done");
		return output;
	}

}
