//Write a Java program to find the second most frequent character in a given string. 
//a. Example : “Classrooms” o is the second most frequent character .


package codingChallenges;

import java.util.HashMap;

public class Ques_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str = "Classrooms";
       
       HashMap<Character,Integer> hm = new HashMap<>();
       
       for(int i = 0 ; i<str.length(); i++) {
    	   char ch = str.charAt(i);
    	   if(hm.containsKey(ch)) {
    		   hm.put(ch, hm.get(ch)+1);
    		   
    	   }else {
    		   hm.put(ch, 1);
    	   }
       }
       int max =Integer.MIN_VALUE ;
       int secondMax = Integer.MIN_VALUE;
       
       char second = ' ';
       char maxchar = ' ';
       for(int i=0 ;i<str.length(); i++) {
    	   char ch  = str.charAt(i);
    	   if(hm.get(ch)>max) {
    		   second = maxchar ;
    		   maxchar = ch ;
    		   secondMax = max ;
    		   max= hm.get(ch);
    		   
    	   }else if(hm.get(ch) > secondMax && hm.get(ch)<max) {
    		   secondMax = hm.get(ch);
    		   second  = ch ;
    	   }
       }
       System.out.println(second+" is the second most frequent character");
        
	}

}
