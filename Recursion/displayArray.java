package Recursion;

import java.util.*;

public class displayArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int idx = n - 1;
        dispArray(arr, idx);
        sc.close();
    }

    public static void dispArray(int[] arr, int idx) {
        if (idx < 0) {
            return;
        }
        dispArray(arr, idx - 1);
        System.out.println(arr[idx]);

    }
}