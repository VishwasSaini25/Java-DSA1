package Recursion;

import java.util.*;

public class displayArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int idx = n - 1;
        dispArrayRev(arr, idx);
        sc.close();
    }

    public static void dispArrayRev(int[] arr, int idx) {
        if (idx < 0) {
            return;
        }
        System.out.println(arr[idx]);
        dispArrayRev(arr, idx - 1);

    }
}