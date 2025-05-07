package day2;

import java.util.HashSet;

public class TwoStrings {
    public static String twoStrings(String s1, String s2) {
        // Write your code here
        HashSet<Character> set = new HashSet<>();
        for(char ch : s1.toCharArray()) {
            set.add(ch);
        }

        for(char ch : s2.toCharArray()) {
            if(set.contains(ch)){
                return "YES";
            }
        }
        return "NO";
    }
}
