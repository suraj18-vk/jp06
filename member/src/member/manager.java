package member;

public class manager extends member{
	
	String department;
    
	public manager(String name, String address, int age, int salary ,String department)
	{
		super(name,age,address,salary);
		System.out.println(department);
	}
}
