package CodeTestJava;

public class RotateString {
	public String RotateString(String sInput, int iBeInsert, int iCutFrom, int iTime){
		String sRtStr = "";
		sRtStr = sInput;
		for(int i=0;i<iTime;i++){
			sRtStr = sRtStr.substring(0, iBeInsert-1)
					+sRtStr.substring(iCutFrom-1, iCutFrom)
					+sRtStr.substring(iBeInsert-1, iCutFrom-1)
					+sRtStr.substring(iCutFrom);
			
		}
		
		return sRtStr;
		
	}
}
