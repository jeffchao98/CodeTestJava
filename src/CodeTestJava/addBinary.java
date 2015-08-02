package CodeTestJava;

public class addBinary {
	private long StrBinaryToLong(String strInput){
		long rtVal =0;
		int iLength = 0;
		
		iLength = strInput.length();
		
		for(int i=0;i<iLength;i++){
			if(strInput.charAt(i)=='1')
				rtVal += Math.pow(2, iLength-1-i);
			else if(strInput.charAt(i)=='0')
				rtVal += 0;
			else{
				rtVal = 0;
				break;
			}
		}
		
		
		return rtVal;
	}
	
    public String addBinary(String a, String b) {
    	//long rtVal=0;
    	
    	//rtVal = StrBinaryToLong(a)+StrBinaryToLong(b);
    	
    	//return Long.toBinaryString(rtVal);
    	String rtStr = "";
    	
    	String strBase="", strAdd="";
    	int iLenBase=0, iLenAdd=0, iLenStr_a=0, iLenStr_b=0;
    	
    	iLenStr_a = a.length();
    	iLenStr_b = b.length();
    	
    	if(iLenStr_a > iLenStr_b){
    		iLenBase = iLenStr_a;
    		iLenAdd = iLenStr_b;
    		strBase = a;
    		strAdd = b;
    	}else{
    		iLenBase = iLenStr_b;
    		iLenAdd = iLenStr_a;
    		strBase = b;
    		strAdd = a;
    	}
    	
    	for(int i=0;i<(iLenBase-iLenAdd);i++)
    		strAdd = "0"+strAdd;
    	boolean bOverFlow = false;
    	int tmpSum=0;
    	for(int i=0;i<iLenBase;i++){
    		tmpSum=0;
    		if(bOverFlow){tmpSum++;bOverFlow=false;}
    		if(strBase.charAt(iLenBase-1-i)=='1')tmpSum++;
    		if(strAdd.charAt(iLenBase-1-i)=='1')tmpSum++;
    		
    		if(tmpSum/2 > 0)bOverFlow = true;
    		if(tmpSum%2==0)rtStr="0"+rtStr;
    		else if(tmpSum%2==1)rtStr="1"+rtStr;
    		
    	}
    	if(bOverFlow)rtStr="1"+rtStr;
    	
    	for(int i=0;i<rtStr.length();i++){
    		if(rtStr.charAt(i)=='0')
    			rtStr = rtStr.replaceFirst("0", "-");
    		else 
    			break;
    	}
    	rtStr = rtStr.replaceAll("-", "");
    	
    	return (rtStr.isEmpty())?"0":rtStr;
        
    }
}
