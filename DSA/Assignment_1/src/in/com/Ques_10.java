//10. Write a Java Program check whether the given number is Automorphic Numberor NOT.

package in.com;

import java.util.Scanner;

public class Ques_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int count = 0 ;
        int square = num*num ;
        int temp = num ;
        
        while(temp>0) {
        	count++;
        
        temp =temp /10 ;
        }
        int lastDigit = (int)(square%(Math.pow(10,count)));
        	
        if(num == lastDigit) {
        	System.out.println(num+ "  is an automorphic number");
        }else {
        	System.out.println(num+ "  is not automorphic number");
        }
	}

}
