//2. Sum of natural numbers using recursion

package in.com;

import java.util.Scanner;

public class Ques02 {
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the value of n = ");
		
		int n = sc.nextInt();
		System.out.print("The sum of first N natural number is = ");
		
		int result = sum(n);
		System.out.print(result);

	}
	
	static int sum(int n)
	{
	   int addition=0;
	   if(n>0)
	   {
	    addition = n + sum(n-1);     
	   }
	   return addition;
	}
}
