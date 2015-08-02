package CodeTestJava;

public class SwitchString {
	public String SwitchString(String sInput, int iBeInsert, int iCutFrom, int iTime){
		String sRtStr = "";
		sRtStr = sInput;
		for(int i=0;i<iTime;i++){
			sRtStr = sRtStr.substring(0, iBeInsert-1)
					+sRtStr.substring(iCutFrom-1, iCutFrom)
					+sRtStr.substring(iBeInsert, iCutFrom-1)
					+sRtStr.substring(iBeInsert-1, iBeInsert)
					+sRtStr.substring(iCutFrom);
			
		}
		
		return sRtStr;
		
	}
}
