
//6. Write a Java Program to check whether the given number is Armstrong Numberor NOT. 

package in.com;

import java.util.Scanner;

public class Ques_6 {
	static boolean isArmstrong(int num) {
		int temp ,digits = 0 , last = 0 , sum =0 ;
		
		temp =num ;
		while(temp>0) {
			temp = temp/10 ;
			digits++ ;
		}
		temp = num ;
		while(temp>0) {
			last = temp % 10 ;
			sum+=(Math.pow(last, digits));
			
			temp = temp /10 ;
		}
		if(num==sum)
		
		return true ;
		else return false  ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num ;
		Scanner sc =  new Scanner (System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt();
		
		if(isArmstrong(num)) {
			System.out.println(num+" Armstrong");
		}else {
			System.out.println(num+" Not Armstrong");
		}
		
		
	 }
	}
