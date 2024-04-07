//5. Sum of digit of a number using recursion

package in.com;

import java.util.Scanner;

public class Ques05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter an number : ");
   int num = sc.nextInt();
   
   int sum = sumofDigit(num);
   System.out.println("Sum of digits : "+sum);
   
	}
  static int sumofDigit(int num) {
	  if(num < 10) {
		  return num ;
		  
	  }
	  return num  % 10 + sumofDigit(num  / 10);
  }
}
