package CodeTestJava;

public class removeDuplicates {
    public int removeDuplicates(int[] nums) {
    	int rtVal = 1;
    	int iIndexChk = 0;
    	
    	int iLength = nums.length;
    	if(iLength>1){
    		for(int i=1;i<iLength;i++){
    			if(nums[i]!=nums[i-1]){
    				rtVal++;
    				if(iIndexChk!=(i-1)){
    					int tmp = nums[i];
    					//nums[i] = nums[iIndexChk+1];
    					nums[iIndexChk+1] = tmp;
    				}
					iIndexChk++;
    			}else{
    				
    			}
    		}
    	}else{
    		rtVal = iLength;
    	}
    	
    	return rtVal;
    	
        
    }
}
