package in.com;

import java.util.Scanner;

public class Ques04 {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc =  new Scanner(System.in);
           
           System.out.println("Enter a decimal number :");
           int decimal  = sc.nextInt() ;
           
           System.out.println("Binary representation: "+ToBinary(decimal));
	}
	static String ToBinary(int decimal) {
		StringBuilder binary  = new StringBuilder();
		
		if(decimal == 0) {
			return "0" ;
			
		}
		while(decimal >0) {
			int remainder = decimal % 2 ;
			
			binary.insert(0 , remainder);
			
			decimal /= 2 ;
		}
		return binary.toString();
	}

}
