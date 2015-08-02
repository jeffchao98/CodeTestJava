package CodeTestJava;

public class rangeBitwiseAnd {
    public int rangeBitwiseAnd(int m, int n) {
        int rtVal = 0;
        int iMin = Math.min(n, m);
        int iMax = Math.max(n, m);
        
        int tmp = iMin^iMax;
        int iLength=0, iLastDiff=0;
        
        while(tmp!=0){
        	iLength++;
        	if((tmp&1)==1)
        		iLastDiff = iLength;
        	tmp = tmp>>1;
        }
        rtVal = ((iMin&iMax)>>iLastDiff)<<iLastDiff;
        return rtVal;
    }

}
