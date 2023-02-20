package exercice4;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] A = {1, 2, 2, 1};
        rearrangeArray(A);
        System.out.println(Arrays.toString(A));
    }
    
    public static void rearrangeArray(int[] A) {
        int n = A.length;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0 && A[i] < A[i - 1]) {
                // swap A[i] and A[i-1]
                int temp = A[i];
                A[i] = A[i - 1];
                A[i - 1] = temp;
            }
            else if (i % 2 != 0 && A[i] > A[i - 1]) {
                // swap A[i] and A[i-1]
                int temp = A[i];
                A[i] = A[i - 1];
                A[i - 1] = temp;
            }
        }
    }
}
