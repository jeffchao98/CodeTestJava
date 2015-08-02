package CodeTestJava;

public class reverse {
    public int reverse(int x) {
        int rtVal = 0, tmpX = x;
        boolean bIsPastv = true;
        
        if(tmpX<0){
        	bIsPastv = false;
        	tmpX = tmpX*(-1);
        }
        /*
        while(tmpX>0){
        	int iTmp = 0;
        	iTmp = tmpX % 10;
        	tmpX = tmpX / 10;
        	rtVal = rtVal*10 + iTmp;
        }
        if(!bIsPastv)
        	rtVal = rtVal*(-1);*/
        
        String strOut = "", strTmp = String.valueOf(tmpX);
        char[] aryTmp = strTmp.toCharArray();
        
        for(int a=aryTmp.length-1; a>=0; a--){
        	strOut = strOut+aryTmp[a];
        }
        if(!bIsPastv)
        	strOut = "-"+strOut;
        try{
        	rtVal = Integer.parseInt(strOut);
        }catch(NumberFormatException e){
			//e.printStackTrace();
			return 0;
		}
        
        return rtVal;
    }
}
