package day1;

public class CommonChild {
    public static int solve(int i,int j,String s1, String s2,int[][] arr){
        if(i==s1.length() || j == s2.length()){
            return 0;
        }

        if(arr[i][j] != -1) return arr[i][j];

        if(s1.charAt(i) == s2.charAt(j)) return arr[i][j] = 1 + solve(i+1,j+1,s1,s2,arr);

        else return arr[i][j]= Math.max(solve(i+1,j,s1,s2,arr),solve(i,j+1,s1,s2,arr));
    }

    public static int commonChild(String s1, String s2) {
        // Write your code here
        int[][] arr = new int[s1.length()+1][s2.length()+1];

        for(int i=0 ; i<s1.length() ; i++){
            for(int j=0 ; j<s2.length() ; j++){
                arr[i][j] = -1;
            }
        }
        return solve(0,0,s1,s2,arr);
    }
}
