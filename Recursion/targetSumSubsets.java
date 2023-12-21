package Recursion;

import java.util.*;

public class targetSumSubsets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        printSosOfTarget(arr, 0, "", 0, tar);
        scn.close();
    }

    public static void printSosOfTarget(int[] arr, int idx, String set, int sos, int tar) {
        if (idx == arr.length) {
            if (sos == tar) {
                System.out.println(set + ".");
            }
            return;
        }
        printSosOfTarget(arr, idx + 1, set + arr[idx] + ",", sos + arr[idx], tar);
        printSosOfTarget(arr, idx + 1, set, sos, tar);
    }
}
