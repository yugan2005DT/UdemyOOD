package edu.udemy.lesson_1;

public class DBConnectionManager {
	

	
	public static DBConnectionManager getManagerInstance(){
		return new DBConnectionManager();
	}
	
	public void connect(){
		System.out.println("Database connected...");
	}

	public void disconnect(){
		System.out.println("Database disconnected...");
	}
	

}
