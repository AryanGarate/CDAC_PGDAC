
//7. Write a Java Program to check whether the given number is Perfect Numberor NOT. 

package in.com;

import java.util.Scanner;

public class Ques_7 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num  , sum=0;
		Scanner sc =  new Scanner (System.in);
		System.out.println("Enter the number :");
		num = sc.nextLong();
		int i   = 1 ;
		while(i<=num/2) {
			if(num%i==0) {
			sum = sum + i;
			}
			i++  ;
		}
		
		if(sum==num) {
			System.out.println(num+ " is a prefect number");
		}else {
	
	System.out.println(num+ " is not a perfect number");
		}			
				
	 }
	}
