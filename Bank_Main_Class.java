
package atm_package_2;
import atm_Package_1.*;

import atm_Package_1.CheckPinNo;

import java.util.Scanner;

           public class Bank_Main_Class {
           public static void main(String args[]) {
           Scanner s=new Scanner(System.in);
               int count=0;
               boolean b=true;
               xyz:
	           while (b) {
		       System.out.println("ENTER THE PINNO");
		       int pinNo=s.nextInt();
		       if(pinNo>0) {
			   ValidatePinNo vpn=new ValidatePinNo();
			   int c=vpn.getdigitCount(pinNo);
			   if(c==4) {
				   CheckPinNo cpn=new CheckPinNo();
				   boolean k=cpn.verify(pinNo);
				   if(k) {
					   b=false;
					   System.out.println("*****Choice*****");
					   System.out.println("1.WithDraw\n2.Deposit");
					   System.out.println("Enter the Choice:");
					   switch(s.nextInt()) 
					   {
					   case 1:
					   System.out.println("Enter the amt:");
					   int a1 = s.nextInt();
					   if(a1>0 && a1%100==0) {
					   Withdraw wd = new Withdraw();
					   wd.process(a1);
					   }
					   else {
					   System.out.println("Invalid amt...");
					   }
					   break xyz;            //stop the loop
					   case 2:
					   System.out.println("Enter the amt:");
					   int a2 = s.nextInt();
					   if(a2>0 && a2%100==0)  
					   {
					   Deposit dp = new Deposit();
					   dp.process(a2);
					   }
					   else {
					   System.out.println("Invalid amt...");
					   }
					   break xyz;                //stop the loop
					   default:
					   System.out.println("Invalid Choice....");
					   break xyz;                //stop the loop
					   }                          //end of switch
					   }
				       else {
					   System.out.println("Incorrect PinNo...");
					   count++;
					   }
					   if(count==3) {
					   System.out.println("Transaction blocked temporarly...");
					   break;                    //stop the loop
					   }
					   }
			           else {
					   System.out.println("Invalid pinNo...");
					   break;
					   }
					   }
		               else {
					   System.out.println("Invlid PinNo...");
					   System.exit(0);//Program stopped
					   }
					   
					   }         //end of loop
					  }
					  

			   }
		   
	   

