//3. Mean of Array using Recursion

package in.com;

import java.util.*;


public class Ques03 {
	
	static int calulateSum(int[] arr , int n) {
		if(n <= 0) {
			return 0 ;
		}
		
		return arr[n -1]+ calulateSum(arr , n-1);
	}
	static double calulateMean(int[] arr, int n) {
		if(n<=0) {
			return 0 ;
		}
		return(double)calulateSum(arr , n) / n ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc =  new Scanner (System.in);
             System.out.print("Enter the number of element in a array : ");
             int length = sc.nextInt();
             
             int[] array = new int[length];
             System.out.println("Enter the element of the array: ");
             
             for(int i = 0 ; i<length ; i++) {
            	 array[i] = sc.nextInt() ;
             }
             
             double mean = calulateMean(array , length);
             System.out.println("Mean : "+mean);
             
	}
	

}
