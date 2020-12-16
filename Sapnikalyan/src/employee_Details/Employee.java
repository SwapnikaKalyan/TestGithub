package employee_Details;

public class Employee {
	String Name;
	String Gender;
	String DateOfBirth;
	String[] Details;
	
	
	//System.out.println("Employee's Name:" + Name);
	//System.out.println("Employee's Gender:" + Gender);
	//System.out.println("Employee's DOB:" + DOB);
	public void EmployeeDetails (String Name, String Gender, String DateOfBirth) {
		String[] Details = {Name, Gender ,DateOfBirth};
		for (int i = 0; i<Details.length; i++) {
		
			  System.out.println(Details[i]);
			}
	}
}
	
	
	

	
		
		   