
//1. Write a Java Program to find GCD of two given numbers. 


package in.com;

import java.util.Scanner;

public class Ques_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int x = sc.nextInt();   //12
		int y = sc.nextInt(); //8
		
		int gcd = 1;
		for(int i = 1  ; i<=x && i<=y ; i++) {   // i<= 12 && 1<=8 
			
			if(x %i == 0 && y%i==0)        // 12 % 1 ==0 && 8%1==0
				gcd =i;
		}
		System.out.printf("GCD of %d and %d is: %d" , x, y, gcd);

	}

}
