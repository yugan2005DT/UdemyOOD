package edu.udemy.lesson_1;

public class EmployeeDAO {
	private DBConnectionManager connectionManager;
	
	public EmployeeDAO(){
		connectionManager =  DBConnectionManager.getManagerInstance();
	}

	public DBConnectionManager getConnectionManager() {
		return connectionManager;
	}

	public void setConnectionManager(DBConnectionManager connectionManager) {
		this.connectionManager = connectionManager;
	}
	
	public void saveEmployee(Employee emp){
		connectionManager.connect();
		System.out.println("Saving to DB...");
		System.out.println(emp);
		connectionManager.disconnect();
		System.out.println("Saving completed.");
	}
	
	public void deleteEmployee(Employee emp){
		connectionManager.connect();
		System.out.println("Deleting from DB...");
		System.out.println(emp);
		connectionManager.disconnect();
		System.out.println("Deleting completed.");
	}

}
