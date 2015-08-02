package CodeTestJava;

import java.util.*;

public class LongestConsecutive {
	public int LongestConsecutive(int[] nums) {
        int rtVal = 0;
        
        LongestContinueSubsequence LongestContinueSubsequence = new LongestContinueSubsequence();
        
        Arrays.sort(nums);
        
        rtVal = LongestContinueSubsequence.LongestContinueSubsequence(nums).length;
        
        return rtVal;
    }
}
