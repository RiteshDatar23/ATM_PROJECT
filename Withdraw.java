
package atm_Package_1;

 public class Withdraw implements Transaction {
 @Override
 public void process(int amt) {
 if(amt<=b.bal) {
 System.out.println("Amt withdrawn:"+amt);
 b.bal=b.bal-amt;
 System.out.println("Balance amt:"+b.getBalance());
 System.out.println("Transaction Completed...");
 }else {
 System.out.println("Insufficient fund...");
 }
 }
}
