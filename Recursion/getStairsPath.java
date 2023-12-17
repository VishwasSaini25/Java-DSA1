package Recursion;

import java.util.*;

public class getStairsPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> paths = getPath(n);
        System.out.println(paths);
        sc.close();
    }

    public static ArrayList<String> getPath(int n) {
        if (n == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        } else if (n < 0) {
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        ArrayList<String> path1 = getPath(n - 1);
        ArrayList<String> path2 = getPath(n - 2);
        ArrayList<String> path3 = getPath(n - 3);
        ArrayList<String> paths = new ArrayList<>();
        for (String path : path1) {
            paths.add(1 + path);
        }
        for (String path : path2) {
            paths.add(2 + path);
        }
        for (String path : path3) {
            paths.add(3 + path);
        }
        return paths;
    }
}
