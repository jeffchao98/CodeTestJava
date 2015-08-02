package CodeTestJava;

public class deleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
    	
    	doDeleteDuplicates(head, 0, 0);
    	
    	return head;
        
    }
    private ListNode doDeleteDuplicates(ListNode head, int iIndexND, int iIndex){
    	
    	ListNode rtNode = null;
    	
    	if(head == null){
    		rtNode = null;
    	}else if(head.next == null){
    		rtNode = head;
    		if(iIndexND!=iIndex)
    			rtNode = null;
    	}else{ 
    		ListNode tmpNext = null;
    		if(head.val == head.next.val){
    			tmpNext = doDeleteDuplicates(head.next, iIndexND, iIndex+1);
	    	}else{
	    		tmpNext = doDeleteDuplicates(head.next, iIndex+1, iIndex+1);
	    	}
    		if(iIndexND == iIndex){
    			head.next = tmpNext;
    			rtNode = head;
    		}else{
    			rtNode = tmpNext;
    		}
    	}
    	
    	return rtNode;
    }
}
