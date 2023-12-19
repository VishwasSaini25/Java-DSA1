package Recursion;

import java.util.*;

public class printPermutations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        getPermutations(str, "");
        scn.close();
    }

    public static void getPermutations(String str, String asf) {
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String lpart = str.substring(0, i);
            String rpart = str.substring(i + 1);
            String roq = lpart + rpart;
            getPermutations(roq, asf + ch);
        }
    }
}