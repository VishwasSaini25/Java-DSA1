package Recursion;

import java.util.*;

public class indexOfLastOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int result = idxLastOccurence(arr, n - 1, x);
        System.out.println(result);
        sc.close();
    }

    public static int idxLastOccurence(int[] arr, int idx, int x) {
        if (idx == 0) {
            return -1;
        }
        if (arr[idx] == x) {
            return idx;
        } else {
            int fiisa = idxLastOccurence(arr, idx - 1, x);
            return fiisa;
        }
    }
}