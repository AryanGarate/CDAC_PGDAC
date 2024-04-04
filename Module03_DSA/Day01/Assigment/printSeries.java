package Module03_DSA.Day01.Assigment;

public class PrintSeries {
    static double seriesSum(int n) { 
        // Base case: If n is 1, return 1
        if (n == 1) {
            return 1.0;
        }
        // Recursive case: If n is even, subtract 1/n from the sum
        if (n % 2 == 0) {
            return seriesSum(n - 1) - 1.0 / n;
        }
        // If n is odd, add 1/n to the sum
        return seriesSum(n - 1) + 1.0 / n;
    }

    public static void main(String[] args) {
        int n = 1; // Change n to the desired value
        double sum = seriesSum(n);
        System.out.println("Sum of the series for N = " + n + ": " + sum);
    }
}

