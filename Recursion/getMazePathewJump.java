package Recursion;

import java.util.*;

public class getMazePathewJump {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> paths = getPath(1, 1, n, m);
        System.out.println(paths);
        scn.close();
    }

    public static ArrayList<String> getPath(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> paths = new ArrayList<>();
        for (int h = 1; h <= dc - sc; h++) {
            ArrayList<String> hpaths = getPath(sr, sc + h, dr, dc);
            for (String path : hpaths) {
                paths.add("h" + h + path);
            }
        }
        for (int v = 1; v <= dr - sr; v++) {
            ArrayList<String> vpaths = getPath(sr + v, sc, dr, dc);
            for (String path : vpaths) {
                paths.add("v" + v + path);
            }
        }
        for (int d = 1; d <= dc - sc && d <= dr - sr; d++) {
            ArrayList<String> dpaths = getPath(sr + d, sc + d, dr, dc);
            for (String path : dpaths) {
                paths.add("d" + d + path);
            }
        }
        return paths;
    }
}
