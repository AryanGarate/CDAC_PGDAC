package in.com;

import java.util.Scanner;

public class Ques09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc =  new Scanner (System.in);
     System.out.println("Enter a string : ");
     String input =  sc.nextLine();
     if(isPalindrome(input)) {
    	 System.out.println("String is Palindrome");
    	 
     }else {
    	 System.out.println("String not a palindrome");
    	 
     }
	}
  public   static boolean isPalindrome(String str ) {
	   str =  str.toLowerCase();
	   return Helper( str, 0 ,str.length()- 1);
   }
   static boolean Helper(String str , int start , int end) {
	   if(start>=end) {
		   return true ;
	   }
	   if(str.charAt(start) == str.charAt(end)) {
		   return Helper(str, start + 1, end -1);
	   }
	   return false ;
   }
}
