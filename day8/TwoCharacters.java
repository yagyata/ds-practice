package day8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoCharacters {
    public static int alternate(String s) {
        // Write your code here
        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray()) {
            set.add(c);
        }

        List<Character> l = new ArrayList<>(set);
        int maxLen = 0;
        for(int i=0; i<l.size(); i++) {
            for(int j=i+1; j<l.size(); j++) {
                char a = l.get(i);
                char b = l.get(j);

                StringBuilder sb = new StringBuilder();

                for(char ch: s.toCharArray()) {
                    if(ch==a || ch==b) {
                        sb.append(ch);
                    }
                }

                if(isAlternate(sb.toString())) {
                    maxLen = Math.max(maxLen, sb.length());
                }
            }
        }
        return maxLen;
    }

    private static boolean isAlternate(String s) {
        for(int i=0; i<s.length()-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }

}
