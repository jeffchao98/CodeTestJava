package CodeTestJava;

public class LongestContinueSubsequence {
	public int[] LongestContinueSubsequence(int[] input){
		int iSize = 0, iOutSize = 0;
		int[] iOutPut = null;
		iSize = input.length;
		
		if(iSize == 0){
			
		}else if(iSize == 1){
			iOutPut = input;
		}else{
			LISRecord[] mProcess = new LISRecord[iSize];
			int iLastRecord;
			int iPathIndex = 0;
			for(int i=0; i<iSize; i++){
				LISRecord mTemp = new LISRecord();
				mTemp.iLastIndex = i;
				mTemp.iLength = 1;
				mTemp.iValue = input[i];
				
				for(int j=0; j<i; j++){
					LISRecord mItem = mProcess[j];
					if( (mItem.iValue+1)==mTemp.iValue ){
						mTemp.iLastIndex = j;
						mTemp.iLength = mItem.iLength + 1;
					}
				}
				
				if(mTemp.iLength > iOutSize){
					iOutSize = mTemp.iLength;
					iPathIndex = i;
				}
				
				mProcess[i] = mTemp;
				
			}
			iOutPut = new int[iOutSize];
			
			for(int i=iOutSize-1; i>=0; i-- ){
				LISRecord mTemp = mProcess[iPathIndex];
				iOutPut[i]=mTemp.iValue;
				iPathIndex = mTemp.iLastIndex;
			}
		}
		
		return iOutPut;
		
	}
	public class LISRecord{
		public int iValue = 0;
		public int iLastIndex = -1;
		public int iLength = 0;
	}

}
