package Recursion;

import java.util.*;

public class factorial {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = fact(n);
        System.out.println(f);
        sc.close();
    }

    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        int fm1 = fact(n - 1);
        int fn = n * fm1;
        return fn;
    }
}
