package CodeTestJava;

public class longestPalindrome {
	public String longestPalindrome(String s) {
        String rtStr = "";
        int iLenRtStr = 0;
        
        int iLenS = 0;
        iLenS = s.length();
        
		if(iLenS == 1){
			rtStr = s;
			iLenRtStr = 1;
		}else if(iLenS>0){
        	for(int a=1;a<iLenS-1;a++){
        		int iSubLenL = a;
        		int iSubLenR = iLenS - 1 -a;
        		int iSubLenCheck = (iSubLenL>iSubLenR)?iSubLenR:iSubLenL;
        		
        		for(int sub1_a=1;sub1_a<=iSubLenCheck;sub1_a++ ){
        			char cSubChkL = s.charAt(a-sub1_a);
        			char cSubChkR = s.charAt(a+sub1_a);
        			if(cSubChkL == cSubChkR){
        				if(sub1_a*2+1>=iLenRtStr){
        					iLenRtStr = sub1_a*2+1;
            				rtStr = s.substring(a-sub1_a, a+sub1_a+1);
        				}
        			}else{
        				break;
        			}
        		}
        	}
        	for(int a=0;a<iLenS-1;a++){
        		int iSubLenL = a + 1;   //include index a
        		int iSubLenR = iLenS - a - 1;   //exclude index a
        		int iSubLenCheck = (iSubLenL>iSubLenR)?iSubLenR:iSubLenL;
        		for(int sub1_a=1;sub1_a<=iSubLenCheck;sub1_a++ ){
        			char cSubChkL = s.charAt(a-sub1_a+1);
        			char cSubChkR = s.charAt(a+sub1_a);
        			if(cSubChkL == cSubChkR){
        				if(sub1_a*2>=iLenRtStr){
        					iLenRtStr = (sub1_a+1)*2;
            				rtStr = s.substring(a-sub1_a+1, a+sub1_a+1);
        				}
        			}else{
        				break;
        			}
        		}
        	}
        }
        
        
		return rtStr;
		
    }
}
