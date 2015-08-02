package CodeTestJava;

import java.util.ArrayList;
import java.util.List;

public class ExtandableStack {
	public static int DEF_TYPE_STACK = 0;
	public static int DEF_TYPE_QUEUE = 1;
	
	private int iType = 0;
	private int iCountStack = 1;
	private List<ArrayList<Integer>> mStackGraup = new ArrayList<ArrayList<Integer>>();
	
	public ExtandableStack(int iSetVal){
		SetInitExtandRange(iSetVal);
	}
	public ExtandableStack(int iSetVal, int iType){
		this.iType = iType;
		SetInitExtandRange(iSetVal);
	}
	private void SetInitExtandRange(int iSetVal){
		if(iCountStack>0){
			iCountStack = iSetVal;
		}
		for(int i=0;i<iCountStack;i++){
			ArrayList<Integer> tmpAdd = new ArrayList<Integer>();
			tmpAdd.add(-1);
			mStackGraup.add(tmpAdd);
		}
	}
	
	public void AddVal(int iID, int iVal){
		if(iVal>-1){
			if(iID>-1 && iID<iCountStack){
				mStackGraup.get(iID).add(iVal);
			}
		}
	}
	public int GetLastVal(int iID){
		int rtVal = -2;
		if(iID>-1 && iID<iCountStack){
			int iLength = mStackGraup.get(iID).size();
			if(this.iType == DEF_TYPE_STACK)
				rtVal = mStackGraup.get(iID).get(iLength-1);
			else
				rtVal = mStackGraup.get(iID).get(Math.min(iLength, 1));
		}
		return rtVal;
		
	}
	public void RemoveLastVal(int iID){
		if(iID>-1 && iID<iCountStack){
			int iLength = mStackGraup.get(iID).size();
			if(iLength>1){
				if(this.iType == DEF_TYPE_STACK)
					mStackGraup.get(iID).remove(iLength-1);
				else
					mStackGraup.get(iID).remove(1);
			}
		}
	}
	//public

}
