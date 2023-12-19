package Recursion;

import java.util.*;

public class printEncoding {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        getEncoding(str, "");
        scn.close();
    }

    public static void getEncoding(String str, String asf) {
        if (str.length() == 0) {
            System.out.println(asf);
            return;
        } else if (str.length() == 1) {
            char ch = str.charAt(0);
            if (ch == '0') {
                return;
            } else {
                int chv = ch - '0';
                char code = (char) ('a' + chv - 1);
                asf = asf + code;
                System.out.println(asf);
            }
        } else {
            char ch = str.charAt(0);
            String ros = str.substring(1);
            if (ch == '0') {
                return;
            } else {
                int chv = ch - '0';
                char code = (char) ('a' + chv - 1);
                getEncoding(ros, asf + code);
            }
            String ch12 = str.substring(0, 2);
            String roq = str.substring(2);
            int ch12v = Integer.parseInt(ch12);
            if (ch12v <= 26) {
                char code = (char) ('a' + ch12v - 1);
                getEncoding(roq, asf + code);
            }
        }
    }
}
