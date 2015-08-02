package CodeTestJava;

public class removeElement {
    public int removeElement(int[] nums, int val) {
        int rtNewLen = 0, iRemovedCount = 0;
        int iSize = nums.length;
        
        for(int i=0;i<iSize;i++){
        	if(i==iSize-iRemovedCount)
        		break;
        	if(nums[i]==val){
        		int iTmp = nums[i];
        		nums[i] = nums[iSize-iRemovedCount-1];
        		nums[iSize-iRemovedCount-1] = iTmp;
        		iRemovedCount++;
        		if(nums[i]==val)
        			--i;
        	}
        }
        rtNewLen = iSize - iRemovedCount;
        return rtNewLen;
    }
}
