package codingChallenges;

import java.util.ArrayList;

public class Ques_4 {

	
		public static void main(String[] args) {

		
			String digit="36";
			
			ArrayList<String> ans=find(digit);
			
			System.out.println(ans);
			
		}
		
		static String[] code={"","","abc","def","ghi","jkl","mno","pqr","tuv","wxyz"};
		
		static ArrayList<String> find(String digit){
		    
		    if(digit.length()==0){
		        ArrayList<String> arr=new ArrayList<>();
		        arr.add("");
		        return arr;
		    }
		    
		    int index=digit.charAt(0)-'0';
		    digit=digit.substring(1);
		    
		    ArrayList<String> arr=find(digit);
		    ArrayList<String> ans=new ArrayList<>();
		    
		    String str=code[index];
		    
		    for(int i=0;i<str.length();i++){
		        char ch=str.charAt(i);
		        
		        for(String  s:arr){
		            ans.add(ch+s);
		        }
		    }
		    return ans;
		}

	}


