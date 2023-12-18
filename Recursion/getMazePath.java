package Recursion;

import java.util.*;

public class getMazePath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> paths = getPath(0, 0, n - 1, m - 1);
        System.out.println(paths);
        scn.close();
    }

    public static ArrayList<String> getPath(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();
        if (sc < dc) {
            hpaths = getPath(sr, sc + 1, dr, dc);
        }
        if (sr < dr) {
            vpaths = getPath(sr + 1, sc, dr, dc);
        }
        ArrayList<String> paths = new ArrayList<>();
        for (String path : hpaths) {
            paths.add("h" + path);
        }
        for (String path : vpaths) {
            paths.add("v" + path);
        }
        return paths;
    }
}
