package Recursion;

import java.util.*;

public class floodFIll {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];
        floodfill(arr, 0, 0, "", visited);
        scn.close();
    }

    public static void floodfill(int[][] arr, int r, int c, String psf, boolean[][] visited) {
        if (r < 0 || c < 0 || r == arr.length || c == arr[0].length || arr[r][c] == 1 || visited[r][c] == true) {
            return;
        }
        if (r == arr.length - 1 && c == arr[0].length - 1) {
            System.out.println(psf);
            return;
        }
        visited[r][c] = true;
        floodfill(arr, r - 1, c, psf + "t", visited);
        floodfill(arr, r, c - 1, psf + "l", visited);
        floodfill(arr, r + 1, c, psf + "b", visited);
        floodfill(arr, r, c + 1, psf + "r", visited);
        visited[r][c] = false;
    }
}
