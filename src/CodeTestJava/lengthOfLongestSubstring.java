package CodeTestJava;

public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
    	int rtRes = 0;
    	String sTmp = s;
    	int tmpCount = 0, breakIndex =0;
    	
    	while(sTmp.length()>0){
    		
    		//tmpCount = 0;
    		//char cTmp = 0;
    		String sTmpChk ="";
    		
    		
    		for(int i=0;i<sTmp.length();i++){
    			
    			sTmpChk = sTmp.substring(i,i+1);
    			if(sTmpChk.compareTo("@")!=0){
    				sTmp = sTmp.replaceAll(sTmpChk, "@");
    				sTmp = sTmp.replaceFirst("@", sTmpChk);
    			}else{
    				tmpCount = i;
    				breakIndex = i+1;
    				break;
    			}
    			
    		}
    		sTmp = sTmp.substring(breakIndex);
    		//if(tmpCount > rtRes)
    			rtRes += tmpCount;
    		
    		
    	}
    	
    	//if(!s.isEmpty())
    		//rtRes++;
    	
    	return rtRes;
        
    }

}
