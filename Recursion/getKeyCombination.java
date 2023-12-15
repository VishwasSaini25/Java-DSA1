package Recursion;

import java.util.*;

public class getKeyCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> words = gkc(str);
        System.out.println(words);
        sc.close();
    }

    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> gkc(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String rest = str.substring(1);
        ArrayList<String> rres = gkc(rest);
        ArrayList<String> mres = new ArrayList<>();
        String codeforch = codes[ch - '0'];
        for (int i = 0; i < codeforch.length(); i++) {
            char charfcode = codeforch.charAt(i);
            for (String words : rres) {
                mres.add(charfcode + words);
            }
        }
        return mres;
    }
}
