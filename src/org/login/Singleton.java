package org.login;

public class Singleton {
static Singleton a;
public static Singleton empId() {
	
	if(a==null) {
		
		a= new Singleton();
	}
	return a;
	

}public void empName() {
  System.out.println("emp name is surya");

}
public static void main(String[] args) {
	Singleton ref= new Singleton();
	ref.empId();
	Singleton id = empId();
	id.empName();

	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
}
