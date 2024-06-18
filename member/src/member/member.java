package member;

public class member {
	
	private String name,address;
	private int age,salary;
	
	public member(String name2, int age2, String address2, int salary2) {
		
		System.out.printf("Name is ", name2);
		System.out.printf("Age is ", age2);
		System.out.printf("Address is ", address2);
		System.out.printf("Salary  is ", salary2);
	}

	public void printsalary(int salary)
	{
		System.out.println(salary);
	}

	@Override
	public String toString() {
		return "member [name=" + name + ", address=" + address + ", age=" + age + ", phone=" + phone + ", salary="
				+ salary + "]";
	}
	
	

}
