package day8;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int[] arr = new int[nums.length + 1];

        for(int i=0; i<nums.length; i++) {
            int n = nums[i];
            if(n > 0 && n <= nums.length) {
                arr[n] = 1;
            }
        }

        for(int i=1; i<arr.length; i++) {
            if(arr[i] == 0) {
                return i;
            }
        }

        return arr.length;

    }
}
