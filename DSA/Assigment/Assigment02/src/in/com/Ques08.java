//. Program for length of a string using recursion

package in.com;

import java.util.Scanner;

public class Ques08 {
	static int SumArray(int[] arr) { 
		return Helper(arr,0 ,0);
	}

	static int Helper(int[] arr ,int index , int sum) {
		if(index == arr.length) {
			return sum ;
		}
		return Helper(arr , index+1 ,  sum + arr[index]);
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
        int sum = SumArray(array);
        System.out.println(sum);
	}

}
