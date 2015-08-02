package CodeTestJava;

public class reverseInt {
	private int iRevertIntOrder(int iInput){
		long rtVal =0;
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
		
		if(rtVal>Integer.MAX_VALUE)
			return 0;
		else
			return (int) rtVal;
	}
    public int reverse(int x) {
        
        if(x == Integer.MIN_VALUE)
        	return 0;
    	else if(x<0)
        	return (-1)*iRevertIntOrder(0-x);
        else
            return iRevertIntOrder(x);
        
    }


}
