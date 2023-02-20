package exercice3;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        
        while (count < n) {
            nums[count++] = 0;
        }
    }
	
}
