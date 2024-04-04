package Module03_DSA.Day01.Assigment;

import java.util.Scanner;

public class Multiplication {

    static void table(int n, int i) {
        if (i > 10) {
            return;
        } else {
            System.out.println(n + " * " + i + " = " + (n * i));
            table(n, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        table(n, 1);

    }
}
