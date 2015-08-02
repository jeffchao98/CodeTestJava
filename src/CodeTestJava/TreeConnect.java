package CodeTestJava;

public class TreeConnect {
    public void connect(TreeLinkNode root) {
    	ConnectNode(root, false);
    }
    private TreeLinkNode ConnectNode(TreeLinkNode root, boolean bIsFromLast){
    	TreeLinkNode rtMostLNode=null, mNextNodeOfChildren = null;
    	if(root!=null){
    		mNextNodeOfChildren = ConnectNode(root.next, true);
        	if(root.right!=null && root.left!=null){
        		root.left.next = root.right;
        		root.right.next = mNextNodeOfChildren;
        		rtMostLNode = root.left;
        	}else if(root.left==null && root.right!=null){
        		rtMostLNode = root.right;
        		root.right.next = mNextNodeOfChildren;
        	}else if(root.right==null && root.left!=null){
        		rtMostLNode = root.left;
        		root.left.next = mNextNodeOfChildren;
        	}else{
        		rtMostLNode = mNextNodeOfChildren;
        	}
        	
        	if(!bIsFromLast){
        		ConnectNode(root.left, false);
        		ConnectNode(root.right, false);
        	}
        	
    	}
    	
    	return rtMostLNode;
    }
}
