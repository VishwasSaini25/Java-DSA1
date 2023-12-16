package Strings;

import java.util.*;

public class palindromeOfSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String ch = str.substring(i, j);
                if (isPlaindrome(ch) == true) {
                    System.out.println(ch);
                }
            }
        }
    }

    public static boolean isPlaindrome(String ch) {
        int low = 0;
        int high = ch.length() - 1;
        while (low <= high) {
            if (ch.charAt(low) == ch.charAt(high)) {
                low++;
                high--;
            } else
                return false;
        }
        return true;
    }
}