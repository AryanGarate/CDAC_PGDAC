public class Recursion02 {

    // static int i = 0 ;

    static int show(int n) {

        if (n == 4)
            return n;
        else
            return 2 * show(n + 1);

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(show(2));
    }

}
