package CodeTestJava;

import java.util.Arrays;

public class findKthLargest {
	public int findKthLargest(int[] nums, int k) {
        int rtVal = -1;
        Arrays.sort(nums);
        rtVal = nums[nums.length-k];
        
        return rtVal;
    }
}
