package edu.udemy.ood;

public class Human {
	
	String name;
	int age;
	int heightInInches;
	String eyeColor;
	

	
	public Human(String name, int age, int heightInInches, String eyeColor) {
		super();
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
	}

	public void speak() {
		System.out.println("Hello, my name is " + name);
		System.out.println("my age is "+age);
	}
	
	public void eat() {
		System.out.println("eating...");
	}

	public void  walk() {
		System.out.println("Walking...");
	}
	
	public void work() {
		System.out.println("Working...");
	}
	
	
}
