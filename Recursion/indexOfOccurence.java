package Recursion;

import java.util.*;

public class indexOfOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt(); 
        int result = idxOccurence(arr, 0, x);
        System.out.println(result);
        sc.close();
    }

    public static int idxOccurence(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == x) {
            return idx;
        } else {
            int fiisa = idxOccurence(arr, idx + 1, x);
            return fiisa;
        }
    }
}