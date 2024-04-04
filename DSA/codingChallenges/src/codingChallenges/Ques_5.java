

/*Find the smallest non repeating element is the first arrayFind the smallest non repeating element is the first arra arr1[]={10,-4,2,0,2,3,7}4,2,0,2,3,7 arr2[]={7,3,-4,0,3,2}  
 * Output:- 10 arr1[]={-2,5,1,-10,5}  arr2[]={-2,-10}  Output:- 1 ind the smallest non repeating element is the first arrayFind the smallest non repeating element is the first array,2,0,2,3,7}4,2,0,2,3,7}*/

package codingChallenges;

public class Ques_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr1[]= {-2,5,1,-10,5}	;
        int arr2[] = {-2,-10};
        
        int min = Integer.MAX_VALUE;
        
        for(int i =0 ; i<arr1.length ; i++) {
        	boolean flag = true ;
        	for(int j = 0 ; j<arr2.length ; j++) {
        		if(arr1[i] == arr2[j]) {
        			flag = false ;
        			break ;
        		}
        	}
        	if(flag) {
        		if(arr1[i]<min) {
        			min = arr1[i];
        		}
        	}
        }
        System.out.println(min);
	}

}
