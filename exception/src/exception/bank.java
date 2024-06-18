package exception;


public class bank {

	private int bankbalance;

	public int getBankbalance() {
		return bankbalance;
	}

	public void setBankbalance(int bankbalance) {
		this.bankbalance = bankbalance;
	}

	@Override
	public String toString() {
		return "bank [bankbalance=" + bankbalance + "]";
	}
	
	public int withdraw(int bal) throws Myexception
	{
		try
		{
			if(bankbalance<3000)
			{
				throw Myexception;
			}
			
		}
		
		catch(Myexeption e)
		{
			
		}
	}
	
	
}
