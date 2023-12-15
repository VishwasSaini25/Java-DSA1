package Recursion;

import java.util.*;

public class getSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> res = gss(str);
        System.out.println(res);
        sc.close();
    }

    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0); // a
        String ros = str.substring(1); // bc
        ArrayList<String> rres = gss(ros);
        ArrayList<String> mres = new ArrayList<>();
        for (String rstr : rres) {
            mres.add("" + rstr);
            mres.add(ch + rstr);
        }
        return mres;
    }

}
