package CodeTestJava;

import Define.ListNode;

public class addTwoNumbersLinkList {
	private int ListDepth(ListNode mItem){
		int rtVal=0;
		boolean bIsLast=false;
		ListNode tmpChkItem;
		
		if(mItem==null)
			return 0;
		else{
			tmpChkItem = mItem;
			rtVal++;
		}
		
		while(!bIsLast){
			if(tmpChkItem.next!=null){
				tmpChkItem = tmpChkItem.next;
				rtVal++;
			}else{
				bIsLast=true;
			}
		}
		return rtVal;
	}
	private ListNode PreFillNodes(ListNode mItem, int iFillCount){
		ListNode rtNode=new ListNode(0);
		rtNode = mItem;
		for(int i=0;i<iFillCount;i++){
			ListNode tmpNode = new ListNode(0);
			tmpNode.next = rtNode;
			rtNode = tmpNode;
		}
		
		return rtNode;
	}
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rtItem = new ListNode(0);
        ListNode mTmpL1, mTmpL2;
        int iDepL1=0, iDepL2=0, iDepRt=0;;
        
        iDepL1 = ListDepth(l1);
        iDepL2 = ListDepth(l2);
        
        if(iDepL1>iDepL2){
        	l2 = PreFillNodes(l2, iDepL1-iDepL2);
        	iDepRt = iDepL1;
        }else{
        	l1 = PreFillNodes(l1, iDepL2-iDepL1);
        	iDepRt = iDepL2;
        }
        mTmpL1 = l1;
        mTmpL2 = l2;
        for(int i=0;i<iDepRt;i++){
        	
        	int iTmpSum = mTmpL1.val + mTmpL2.val;
        	if(iTmpSum>9){
        		
        	}
        	
        	mTmpL1 = mTmpL1.next;
        	mTmpL2 = mTmpL2.next;
        }
        
        
        return rtItem;
    }

}
