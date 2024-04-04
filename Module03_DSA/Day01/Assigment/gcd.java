package Module03_DSA.Day01.Assigment;

import java.util.Scanner;

public class gcd {
     static void greatestComonDivisor(int n)
    {
        if(n==0)
        {
            System.out.print("Enter a valid number");
        }
        else if(n==1)
        {
            System.out.print("int");
        }
        else{
            System.out.print("gcd(int, ");
            greatestComonDivisor(n-1);
            System.out.print(")" );
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();
         
        greatestComonDivisor(n);
    }
}



