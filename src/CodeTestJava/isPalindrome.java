package CodeTestJava;

public class isPalindrome {
	private int iGemerateAll1(int iLength){
		int rtVal = 0;
		iLength--;
		for(int i=0;i<=iLength;i++)
			rtVal+=Math.pow(10, i);
		
		
		return rtVal;
		
	}
	private int iRevertIntOrder(int iInput){
		int rtVal =0;
		int iLenNum=0;
		int tmpInput = 0;
		tmpInput = iInput;
		
		if(iInput==0){
			
		}else{
			iLenNum = (int) Math.log10(iInput);
			iLenNum++;
			
			for(int i=0;i<iLenNum;i++){
				rtVal += (tmpInput % 10) * (Math.pow(10, iLenNum-i-1)) ;
				tmpInput = tmpInput / 10;
			}
		}
		
		
		return rtVal;
	}
	private int iGatherAllDig(int iInput){
		int rtVal =0;
		int iLenNum=0;
		int tmpInput = 0;
		tmpInput = iInput;
		
		if(iInput==0){
			
		}else{
			iLenNum = (int) Math.log10(iInput);
			iLenNum++;
			
			for(int i=0;i<iLenNum;i++){
				rtVal += tmpInput % 10;
				tmpInput = tmpInput / 10;
			}
		}
		
		
		return rtVal;
	}
    public boolean isPalindrome(int x) {
    	
    	boolean rtRes = false;
    	
    	int iLenNum=0;
    	if(x==0)
    		x=1;
    	else if(x<0)
    		return false;
    	
    	iLenNum = (int) Math.log10(x);
    	
    	if(iLenNum == 0)
    		rtRes = true;
    	else if(iLenNum == 1){
    		if(x%11 == 0)
    			rtRes = true;
    	}else if(iLenNum>1){
    		int iCutLength = 0, iDivBase =0, iSubL=0, iSubR=0;
    		if( (iLenNum+1)%2==0 ){
    			iCutLength = (iLenNum+1)/2;
    			iDivBase = (int) Math.pow(10, iCutLength);
    			//iChkBase = iGemerateAll1(iCutLength);
    			iSubL = x/iDivBase;
    			iSubR = x%iDivBase;
    			
    		}else{
    			iCutLength = iLenNum/2;
    			iDivBase = (int) Math.pow(10, iCutLength);
    			//iChkBase = iGemerateAll1(iCutLength);
    			iSubL = x/(iDivBase*10);
    			iSubR = x%iDivBase;
    		}
    		//if(( (iSubL + iSubR)%iChkBase == 0 ) && (iGatherAllDig(iSubL) == iGatherAllDig(iSubR)) )
    		if(iRevertIntOrder(iSubL) == iSubR)
				rtRes = true;
    	}
    	
    	
    	return rtRes;
        
    }
}
