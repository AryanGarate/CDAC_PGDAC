package in.com;

import java.util.Scanner;

public class Ques10 {
	static int fibo(int n) {
		if(n<=1) {
			return  n ;
		}
		return fibo(n-1)+fibo(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Enter an number : ");
          int count = sc.nextInt();
          System.out.println("Fibo in reverse order:");
          for(int i = count - 1; i>=0 ;i--) {
        	  System.out.println(fibo(i)+ " ");
          }
	}

}
