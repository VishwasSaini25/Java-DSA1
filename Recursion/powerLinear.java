package Recursion;

import java.util.*;

public class powerLinear {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int result = powLinear(x, n);
        System.out.println(result);
        sc.close();
    }

    public static int powLinear(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int a = powLinear(x, n - 1);
        int result = x * a;
        return result;
    }
}
