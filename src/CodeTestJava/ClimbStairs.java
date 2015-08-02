package CodeTestJava;

public class ClimbStairs {
	public int ClimbStairs(int iInput){
		int rtVal = 0;
		
		//rtVal = rtStair(iInput);
		rtVal = rtStair_inter(iInput);
		
		return rtVal;
	}
	
	private int rtStair(int n){
		
		if(n==1)return 1;
		if(n==2)return 2;
		return rtStair(n-1)+rtStair(n-2);
		
	}
	private int rtStair_inter(int n){
		
		if(n==1)return 1;
		if(n==2)return 2;
		
		int[] mem={1,2};
		int iStatus = 2;
		while(iStatus<n){
			
			int iTmpAll = mem[0] + mem[1];
			mem[0] = mem[1];
			mem[1] = iTmpAll;
			++iStatus;
			
		}
		
		return mem[1];
		
	}
	
}
