package CodeTestJava;

public class swapPairs {
	public ListNode swapPairs(ListNode head) {
		return doSwapPairs(head, true);
    }
	
	private ListNode doSwapPairs(ListNode head, boolean bIsNeedDo){
		
		if(head!=null){
			if(bIsNeedDo && head.next!=null){
				int iTemp = head.val;
				head.val = head.next.val;
				head.next.val = iTemp;
				
			}
			doSwapPairs(head.next, !bIsNeedDo);
		}
		
		
		return head;
	}
}
