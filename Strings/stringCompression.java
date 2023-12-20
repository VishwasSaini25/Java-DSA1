package Strings;
import java.util.*;
public class stringCompression{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder s1 = compress(str);
        StringBuilder s2 = compress2(str);
        System.out.println(s1);
        System.out.println(s2);
        sc.close();
    }
    public static StringBuilder compress(String s){
        StringBuilder s1 = new StringBuilder();
        s1.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(i-1)){
                s1.append(s.charAt(i));
            }
        }
        return s1;
    }
    public static StringBuilder compress2(String s){
        StringBuilder s1 = new StringBuilder();
        int k = 1;
        for (int i = 0; i < s.length(); i++) {
            if(i == s.length() - 1){
                s1.append(s.charAt(i));
                if(k !=1){
                    s1.append(k);
                }
            } else{
                if(s.charAt(i) != s.charAt(i+1)){
                    s1.append(s.charAt(i));
                    if(k !=1 ){
                        s1.append(k);
                    } k =1;
                } else if(s.charAt(i) == s.charAt(i+1)){
                    k++;
                }
            }
        }
        return s1;
    }
}