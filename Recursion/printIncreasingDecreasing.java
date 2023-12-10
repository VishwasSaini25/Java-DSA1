package Recursion;

import java.util.*;

public class printIncreasingDecreasing {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pid(n);
        sc.close();
    }

    public static void pid(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);  
        pid(n - 1);
        System.out.println(n);
    }

}
