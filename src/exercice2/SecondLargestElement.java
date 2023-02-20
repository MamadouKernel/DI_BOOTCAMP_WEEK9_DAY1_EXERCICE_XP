package exercice2;

import java.util.Arrays;

public class SecondLargestElement {
	
	public static int findSecondLargest(int[] arr) {
        // Sort the array in descending order
        Arrays.sort(arr);
        int n = arr.length;

        // Find the second largest element
        int largest = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            if (arr[i] != largest) {
                return arr[i];
            }
        }

        // If there is no second largest element
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        int secondLargest1 = findSecondLargest(arr1);
        System.out.println("Second largest element in arr1: " + secondLargest1);

        int[] arr2 = {10, 5, 10};
        int secondLargest2 = findSecondLargest(arr2);
        System.out.println("Second largest element in arr2: " + secondLargest2);

        int[] arr3 = {10, 10, 10};
        int secondLargest3 = findSecondLargest(arr3);
        if (secondLargest3 == -1) {
            System.out.println("No second largest element in arr3.");
        }
    }

}
