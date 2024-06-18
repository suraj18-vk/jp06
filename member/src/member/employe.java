package member;

public class employe extends member {
	
	String specialization;
	
	public employe(String name, String address, int age, int salary,  String specialization)
	{
		super(name,age,address,salary);
		System.out.println(specialization);	
	}

	super.salary("60000");

}
