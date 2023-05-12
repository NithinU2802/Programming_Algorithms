
/******************************************************************************

           Print nth fibonacci Series

*******************************************************************************/

import java.util.*;


class Fibonacci {
    public static int fibonacci(int n) {
        if (n==0 || n==1)
            return n;
        return (fibonacci(n-1)+fibonacci(n-2));
    }

    public static void main(String[] arg) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        System.out.println(fibonacci(n-1));
    }
}