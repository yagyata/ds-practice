package day7;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0; i<n; i++) {
            int[] arr = matrix[i];

            int first = 0;
            int last = arr.length - 1;

            while(first<last) {
                int k = arr[first];
                arr[first] = arr[last];
                arr[last] = k;
                first++;
                last--;
            }
        }
    }
}
