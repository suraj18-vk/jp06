package exception;

public class mainn {

	public static void main(String[] args) {
		
		bank v = new bank();
		v.setBankbalance(3000);
		System.out.println(v.getBankbalance());
		v.withdraw(4000);
		

	}

}
