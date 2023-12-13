package Recursion;

import java.util.*;

public class allIndexInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int[] result = allIndex(arr, 0, x, 0);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }

    public static int[] allIndex(int[] arr, int idx, int x,int fsf) {
        if (idx == arr.length) {
            return new int[fsf];
        }
        if (arr[idx] == x) {
            int [] result = allIndex(arr, idx + 1, x , fsf+1);
            result[fsf] = idx;
            return result;
        } else {
            int [] result = allIndex(arr, idx + 1, x , fsf);
            return result;
        }
    }
}