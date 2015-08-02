package CodeTestJava;

public class largestRectangleArea {
    public int largestRectangleArea(int[] height) {
    	int rtVal = 0;
    	int iLenMatrix = 0;
    	int iMaxSum = 0;
    	int tmpSum=0, standVal=0;
    	int i=0, sub_l=0, sub_r=0, chkVal=0;
    	
    	if(height!=null)
    	iLenMatrix = height.length;
    	
    	if(iLenMatrix == 1){
    		rtVal = height[0];
    	}else if(iLenMatrix > 1){
    		for(i=0;i<iLenMatrix;i++){
    			iMaxSum+=height[i];
    		}
    		for(i=0;i<iLenMatrix;i++){
        		tmpSum = 0;
        		standVal = height[i];
        		tmpSum = standVal;
        		for(sub_l=0;sub_l<i;sub_l++){
        			chkVal = height[i-sub_l-1];
        			if(chkVal<standVal)
        				break;
        			else{
        				tmpSum+=standVal;
        			}
        		}
        		for(sub_r=0;sub_r<iLenMatrix-i-1;sub_r++){
        			chkVal = height[i+sub_r+1];
        			if(chkVal<standVal)
        				break;
        			else{
        				tmpSum+=standVal;
        			}
        		}
        		if(tmpSum > rtVal){
        			rtVal = tmpSum;
        		}
        		if(iMaxSum == rtVal)
        			break;
    		}
    	}else{
    		
    	}
    	return rtVal;
        
    }

}
