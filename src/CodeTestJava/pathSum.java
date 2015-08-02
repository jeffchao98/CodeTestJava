package CodeTestJava;

import java.util.ArrayList;
import java.util.List;

public class pathSum {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    	List<List<Integer>> rtRes = new ArrayList<List<Integer>>();
    	List<List<Integer>> tmpL = new ArrayList<List<Integer>>();
    	List<List<Integer>> tmpR = new ArrayList<List<Integer>>();
    	boolean bIsBottom = false;
    	
    	if(root == null){
    		
    	}else{
	    	if(root.left==null && root.right==null){
	    		if(sum != root.val){
	    			
	    		}else{
		    		List<Integer> tmpOut = new ArrayList<Integer>();
		    		tmpR.add(tmpOut);
	    		}
	    		bIsBottom = true;
	    		/*
	    		if(sum==root.val){
	    			//List<Integer> tmpOut = new ArrayList<Integer>();
	    			tmpOut.add(root.val);
	    			rtRes.add(tmpOut);
	    		}*/
	    	}else if(root.left==null){
	        	tmpR = pathSum(root.right, sum-root.val);
	    	}else if(root.right==null){
	        	tmpL = pathSum(root.left, sum-root.val);
	    	}else{
	        	tmpL = pathSum(root.left, sum-root.val);
	        	tmpR = pathSum(root.right, sum-root.val);
	    	}
	    	if(!tmpL.isEmpty()){
	    		int iLen_tmpL = tmpL.size();
	    		for(int a=0;a<iLen_tmpL;a++){
	    			List<Integer> tmpOut = tmpL.get(a);
	    			tmpOut.add(0, root.val);
	    			rtRes.add(tmpOut);
	    		}
	    	}
	    	if(!tmpR.isEmpty()){
	    		int iLen_tmpR = tmpR.size();
	    		for(int a=0;a<iLen_tmpR;a++){
	    			List<Integer> tmpOut = tmpR.get(a);
	    			tmpOut.add(0, root.val);
	    			rtRes.add(tmpOut);
	    		}
	    	}
    	}
    	
    	
    	return rtRes;
    }
    
    
}
