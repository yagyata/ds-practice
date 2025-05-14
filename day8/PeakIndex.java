package day8;

public class PeakIndex {
    public int peakIndexInMountainArray(int[] arr) {
        return binarySearch(arr, 1, arr.length-2);
    }

    private int binarySearch(int[] arr, int left, int right) {
        if(left > right) return -1;

        int mid = left + (right-left)/2;

        if(arr[mid+1] < arr[mid] && arr[mid-1] < arr[mid]) return mid;
        if(arr[mid-1] < arr[mid]) {
            return binarySearch(arr, mid+1, right);
        }
        else {
            return binarySearch(arr, left, mid-1);
        }
    }
}
