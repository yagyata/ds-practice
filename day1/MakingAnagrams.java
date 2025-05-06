package day1;

import java.io.*;

public class MakingAnagrams {
    public static int makingAnagrams(String s1, String s2) {
        int[] freqArr = new int[26];

        for(char ch : s1.toCharArray()) {
            freqArr[ch-'a']++;
        }
        for(char ch : s2.toCharArray()) {
            freqArr[ch-'a']--;
        }
        int delete = 0;
        for(int i=0; i<freqArr.length; i++) {
            delete += Math.abs(freqArr[i]);
        }
        return delete;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = bufferedReader.readLine();

        String s2 = bufferedReader.readLine();

        int result = MakingAnagrams.makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
