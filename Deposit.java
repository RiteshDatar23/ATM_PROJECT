
package atm_Package_1;

public class Deposit implements Transaction{
	 @Override
	public void process(int amt) {
	 System.out.println("Amt deposited:"+amt);
	 b.bal=b.bal+amt;
	 System.out.println("Balance amt:"+b.getBalance());
	 System.out.println("Transaction Completed....");
	 }
	}
