//Recursive Binary Search Implementation in Java
// This code implements a recursive binary search algorithm in Java.

public class RecursiveBinarySearch {
    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        
        int mid = (start + end) / 2;

        if (arr[mid] == target) {
            return mid;
        } 
        
        else if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, end);
        } 
        
        else {
            return binarySearch(arr, target, start, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int target = 4;
        int result = binarySearch(arr, target, 0, arr.length - 1);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
