
//3. Write a Java Program to print all the Prime Factorsof the Given Number

package in.com;

import java.util.Scanner;

public class Ques_3 {
	 public static void primeFactors(int n, int divisor) {
	        
	        if (n == 1)
	            return;

	        
	        if (n % divisor == 0) {
	            System.out.print(divisor + " ");
	            primeFactors(n / divisor, divisor);
	        } else {
	          
	            primeFactors(n, divisor + 1);
	        }
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt();   
	
		System.out.println("Prime factors of " +num+"are: ");
		primeFactors(num , 2);
		
		


	}

}
