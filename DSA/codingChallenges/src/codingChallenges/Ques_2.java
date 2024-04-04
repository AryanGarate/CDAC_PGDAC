//2. How Convert lower to upper case without using toUppercase() in java?

package codingChallenges;

import java.util.Scanner;

public class Ques_2 {
   


 	public static void main(String args[]) {
 		Scanner sc  = new Scanner(System.in);
 		System.out.println("Enter a string ");
 		String str = sc.next();
 		
 		String ans = " ";
 		
 		for(int i = 0 ; i<str.length(); i++) {
 			char ch = str.charAt(i);
 			ans +=(char)(ch-32)+ "";
 		}
 		System.out.println(ans);
 		
 	}

}
