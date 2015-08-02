package CodeTestJava;

public class findMin {
    public int findMin(int[] nums) {
        int rtVal = 0;
        
        rtVal = nums[0];
        for(int a=0;a<nums.length;a++){
        	if(rtVal>nums[a])
        		rtVal = nums[a];
        }
        
        return rtVal;
    }
}
