package Recursion;

import java.util.*;

class powerLogarithmic {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int result = powLog(x, n);
        System.out.println(result);
        sc.close();
    }

    public static int powLog(int x, int n) {
        if (n == 0) {                   //base case
            return 1;
        }
        int nb2 = powLog(x, n / 2);     //half the power
        int xn = nb2 * nb2;             
        if (n % 2 == 1) {               
            xn = xn * x;
        }
        return xn;
    }
}