package CodeTestJava;

public class reverseBits {
    public int reverseBits(long n) {
        int rtVal = 0;
        long tmpRtItem = n, tmpMulti = 1;
        
        boolean tmpBitTr[] = new boolean [32];
        
        for(int i=0;i<32;i++){
        	tmpBitTr[i] = false;
        }
        
        for(int i=0;i<32;i++){
        	if(tmpRtItem == 0){
        		break;
        	}else{
        		if(tmpRtItem%2 != 0){
        			tmpBitTr[i] = true;
        		}
        		tmpRtItem >>>=1;
        	}
        }
        
        for(int i=31;i>0;i--){
        	if(tmpBitTr[i])
        		rtVal+=tmpMulti;
        	tmpMulti = tmpMulti * 2;
        }
        
        
        if(tmpBitTr[0]){
        	return (rtVal) + (1 << 31);
         }else{
        	return rtVal; 
         }
    }
}
