package edu.udemy.ood;

public class Earth {
	
	public static final void main(String[] args){
		Human tom, john;
		
		tom  = new Human("Tom Cruze", 43, 56, "Blue");

		john = new Human("John Smith", 23, 24, "Green");
		
		tom.speak();
		john.speak();
		
	}

}
