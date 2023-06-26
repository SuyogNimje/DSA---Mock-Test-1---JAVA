import java.util.Arrays;

public class MockExam1Question1 {

    public static void moveZeros(int[] nums) {
        int i = 0;
        int j = 0;
        
        while (i < nums.length) {
            if (nums[i] != 0) {
                // Swap non-zero element with the element at index j
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }
        
        // Fill the remaining elements from index j to the end with zeros
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }
    
    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeros(nums1);
        System.out.println(Arrays.toString(nums1)); // Output: [1, 3, 12, 0, 0]
    
        int[] nums2 = {0};
        moveZeros(nums2);
        System.out.println(Arrays.toString(nums2)); // Output: [0]
    }
    
}
