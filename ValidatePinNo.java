package atm_Package_1;

public class ValidatePinNo {
	 int c=0;
	 public int getdigitCount (int n) {
		 while(n>0) {
			 c++;
			 n=n/10;
			 
		 }
		 return c; 	 	 	
	 }
	}