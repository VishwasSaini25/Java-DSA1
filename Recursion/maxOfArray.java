package Recursion;

import java.util.*;

public class maxOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = maximum(arr, 0);
        System.out.println(result);
        sc.close();
    }

    public static int maximum(int[] arr, int idx) {
        if (idx == arr.length - 1) {    //if on last value return that value
            return arr[idx];
        }
        int max = maximum(arr, idx + 1);    //iterate to length-1

        if (max > arr[idx]) {       //check every returned value to the current value
            return max;
        } else
            return arr[idx];
    }
}
