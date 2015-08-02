package CodeTestJava;

public class MaxProductSubsequence {
	public int MaxProductSubsequence(int[] input){
		int iSize = 0, iOutSize = 0, iOutProduct = 0;
		//int[] iOutPut = null;
		iSize = input.length;
		
		if(iSize == 0){
			
		}else if(iSize == 1){
			//iOutPut = input;
			iOutProduct = input[0];
		}else{
			LISRecord[] mProcess = new LISRecord[iSize];
			int iLastRecord;
			int iPathIndex = 0;
			iOutProduct = input[0];
			for(int i=0; i<iSize; i++){
				LISRecord mTemp = new LISRecord();
				mTemp.iLastIndex = i;
				mTemp.iLength = 1;
				mTemp.iValue = input[i];
				mTemp.iProduct = input[i];
				
				//for(int j=0; j<i; j++){
				if(i>0){
					LISRecord mItem = mProcess[i-1];
					if( mItem.iValue<=mTemp.iValue){
						mTemp.iLastIndex = i-1;
						mTemp.iLength = mItem.iLength + 1;
						if(mItem.iProduct > 0){
							mTemp.iProduct = mTemp.iProduct * mItem.iProduct;
						}
					}else if(mItem.iValue>mTemp.iValue){
						mTemp.iLastIndex = i;
						mTemp.iLength = 1;
						mTemp.iValue = input[i];
						mTemp.iProduct = input[i];
					}
				}
				//}
				
				if(mTemp.iLength > iOutSize){
					iOutSize = mTemp.iLength;
					iPathIndex = i;
				}
				if(mTemp.iProduct > iOutProduct){
					iOutProduct = mTemp.iProduct;
				}
				mProcess[i] = mTemp;
				
			}
			/*
			for(int i=0; i<iSize; i++){
				if(input[i]>iOutProduct)
					iOutProduct = input[i];
			}*/
		}
		
		return iOutProduct;
		
	}
	public class LISRecord{
		public int iValue = 0;
		public int iLastIndex = -1;
		public int iLength = 0;
		public int iProduct = 1;
	}
}
