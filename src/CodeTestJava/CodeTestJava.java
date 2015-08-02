package CodeTestJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CodeTestJava {
	public static void main(String[] args){
		
		longestPalindrome testItem = new longestPalindrome();
		largestRectangleArea mLargestRectangleArea = new largestRectangleArea();
		isPalindrome mIsPalindrome = new isPalindrome();
		lengthOfLongestSubstring mLengthOfLongestSubstring = new lengthOfLongestSubstring();
		reverseInt mReverseInt = new reverseInt();
		addBinary mAddBinary = new addBinary();
		InseedWelcome mInseedWelcome = new InseedWelcome();
		ClimbStairs mClimbStairs = new ClimbStairs();
		LongestIncreasingSubsequence mLongestIncreasingSubsequence = new LongestIncreasingSubsequence();
		LongestConsecutive mLongestConsecutive = new LongestConsecutive();
		MaxProductSubsequence mMaxProductSubsequence = new MaxProductSubsequence();
		deleteDuplicates mdeleteDuplicates = new deleteDuplicates();
		removeDuplicates mremoveDuplicates = new removeDuplicates();
		RotateString mRotateString = new RotateString();
		intToRoman mIntToRoman = new intToRoman();
		reverse mReverse = new reverse();
		reverseBits mreverseBits = new reverseBits();
		rangeBitwiseAnd mrangeBitwiseAnd = new rangeBitwiseAnd();
		
		
		//*****CheckPerformance Time*******
		long StartTime = System.currentTimeMillis();
		//*********************************
		
		//System.out.println(testItem.longestPalindrome("abcddcba"));
		
		//int[] inItem = {2,1,5,6,2,3};
		//System.out.print(mLargestRectangleArea.largestRectangleArea(inItem)); //Panding - time exceed
		
		//System.out.println(mIsPalindrome.isPalindrome(1009001));
		
		/*Panding by alg redesign
		System.out.println(mLengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb"));
		System.out.println(mLengthOfLongestSubstring.lengthOfLongestSubstring("wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco"));
		*/
		//System.out.println(mReverseInt.reverse(-2147483648));
		//System.out.println(Integer.toBinaryString(5));
		//System.out.println(mAddBinary.addBinary("001", "10"));
		
		/*
		Scanner in = new Scanner(System.in);
		long iInputX = in.nextLong();
        in.nextLine();
        long iInputY = in.nextLong();
        long iInputZ = in.nextLong();
        in.nextLine();
        String sInputS = in.nextLine();
        System.out.println(mInseedWelcome.mProcess(iInputX, iInputY, iInputZ, sInputS));
        */
		//System.out.println(mClimbStairs.ClimbStairs(3));
		
		/*
		int[] inItem = {2,6,4,5,1,3};
		Arrays.sort(inItem);
		int[] outItem = mLongestIncreasingSubsequence.LongestIncreasingSubsequence(inItem);
		for(int i=0; i<outItem.length;i++)
		System.out.println(outItem[i]);
		*/
		/*
		int[] inItem = {100, 4, 200, 1, 3, 2};
		System.out.println(mLongestConsecutive.LongestConsecutive(inItem));
		*/
		/*
		//mMaxProductSubsequence
		int[] inItem = {2,4,5,6,1,3};
		//int[] outItem = mMaxProductSubsequence.MaxProductSubsequence(inItem);
		//for(int i=0; i<outItem.length;i++)
		System.out.println(mMaxProductSubsequence.MaxProductSubsequence(inItem));
		*/
		/*
		ListNode testNode = new ListNode(1);
		ListNode testNode_B1 = new ListNode(1);
		testNode.next = testNode_B1;
		
		mdeleteDuplicates.deleteDuplicates(testNode);
		*/
		
		/*
		int[] inItem = {1,2,3};
		mremoveDuplicates.removeDuplicates(inItem);
		*/
		
		/*
		Scanner in = new Scanner(System.in);
		in.nextLine();
		String sInput = in.nextLine();
		int iN = in.nextInt();
		String sOutput = sInput;
		for(int i=0;i<iN;i++){
			sOutput = mRotateString.RotateString(sOutput, in.nextInt(), in.nextInt(), in.nextInt());
			in.nextLine();
		}
		System.out.println(sOutput);*/
		Scanner in = new Scanner(System.in);
		int iN = in.nextInt();
		int tmpRList[] = new int [iN];
		double rtVal = 0;
		for(int i=0;i<iN;i++){
			tmpRList[i]=in.nextInt();
		}
		Arrays.sort(tmpRList);
		for(int i=0;i<iN;i++){
			rtVal = ((-1)*rtVal)+(Math.pow(tmpRList[i],2)*Math.pow(-1, iN+1));
		}
		System.out.println(Math.abs(rtVal*Math.PI));
		/**********************************************
		Scanner in = new Scanner(System.in);
		int iN = in.nextInt();
		int tmpFList[] = new int [iN];
		int tmpCFlower[] = new int [iN];
		int tmpMaxGet[] = new int [iN];
		int tmpMinGet[] = new int [iN];
		int tmpSaliy[] = new int [iN];
		
		for(int i=0;i<iN;i++){
			if(i>0)
				tmpFList[i]=in.nextInt();
			else
				tmpFList[i]=1;
			tmpMaxGet[i]=0;
			tmpMinGet[i]=0;
			tmpSaliy[i]=0;
			tmpCFlower[i]=0;
		}
		for(int i=iN-1;i>=0;i--){
			int tmpLeadID=tmpFList[i]-1;
			int tmpSaliSum = 0;
			tmpCFlower[tmpLeadID]++;
			
			if(tmpCFlower[i]==0){
				tmpSaliSum = 1;
			}else{
				tmpSaliSum = tmpMaxGet[i]+tmpMinGet[i]+1;
			}
			tmpSaliy[i] = tmpSaliSum;
			if(i>0){
				if(tmpMaxGet[tmpLeadID]==0){
					tmpMaxGet[tmpLeadID] = tmpSaliSum;
				}else{
					if(tmpSaliSum>tmpMaxGet[tmpLeadID])
						tmpMaxGet[tmpLeadID] = tmpSaliSum;
				}
				if(tmpMinGet[tmpLeadID]==0){
					tmpMinGet[tmpLeadID] = tmpSaliSum;
				}else{
					if(tmpSaliSum<tmpMinGet[tmpLeadID])
						tmpMinGet[tmpLeadID] = tmpSaliSum;
				}
			}
		}
		System.out.println(tmpSaliy[0]);
		*********************************************/
		/*********************************************
		Scanner in = new Scanner(System.in);
		int iN = in.nextInt();
		int iA = iN/2;
		int iB = iN-iA;
		
		System.out.println(iA*iB);
		*********************************************/
		
		/***********************************************
		class Order{
			int iFrom = 0;
			int iTo = 0;
			boolean bShouldKeep = true;
		}

		Scanner in = new Scanner(System.in);
		int iN = in.nextInt();
		int iK = in.nextInt();
		int iReduce = 0;
		List<Order> mOrderList = new ArrayList<Order>();
		
		ExtandableStack mExtandableStack = new ExtandableStack(8);
		
		
		for(int i=0;i<iN;i++){
			Order mTmp = new Order();
			int iTmpA=0, iTmpB=0, iTmpAQ=-1, iTmpBQ=-1;
			iTmpA = in.nextInt();
			iTmpB = in.nextInt();
			mTmp.iFrom = Math.min(iTmpA, iTmpB);
			mTmp.iTo = Math.max(iTmpA, iTmpB);
			iTmpA = mTmp.iFrom;
			iTmpB = mTmp.iTo;
			
			iTmpAQ = mExtandableStack.GetLastVal(iTmpA);
			iTmpBQ = mExtandableStack.GetLastVal(iTmpB);
			
			if( (iTmpAQ+iTmpBQ!=-2) && (iTmpAQ == iTmpBQ) ){
				mExtandableStack.RemoveLastVal(iTmpA);
				mExtandableStack.RemoveLastVal(iTmpB);
				mOrderList.get(iTmpAQ).bShouldKeep = false;
			}else{
				int iTmpLeng = mOrderList.size();
				mExtandableStack.AddVal(iTmpA, iTmpLeng);
				mExtandableStack.AddVal(iTmpB, iTmpLeng);
				mOrderList.add(mTmp);
			}
		}
		
		int iLenKillSrh = 0;
		iLenKillSrh = mOrderList.size()-1;
		for(int k=iLenKillSrh; k>-1; k--){
			if(!mOrderList.get(k).bShouldKeep)
				mOrderList.remove(k);
		}
		
		iN = mOrderList.size();
		String sOutput = "12345678";
		for(int j=0;j<iK;j++){
			for(int i=0;i<iN;i++){
				Order mTmp = mOrderList.get(i);
				sOutput = SwitchString(sOutput, mTmp.iFrom, mTmp.iTo, 1);
			}
		}
		sOutput = sOutput.substring(0, 1)+" "+
				sOutput.substring(1, 2)+" "+
				sOutput.substring(2, 3)+" "+
				sOutput.substring(3, 4)+" "+
				sOutput.substring(4, 5)+" "+
				sOutput.substring(5, 6)+" "+
				sOutput.substring(6, 7)+" "+
				sOutput.substring(7);
		System.out.println(sOutput);
		***********************************************/
		
		
		//System.out.println(mIntToRoman.intToRoman(1996));
		
		//System.out.println(mReverse.reverse(1534236469));

		//System.out.println(mreverseBits.reverseBits((1 << 31)+2147483647));
		//System.out.println(mreverseBits.reverseBits(1));
		
		//System.out.println(mrangeBitwiseAnd.rangeBitwiseAnd(0, 2147483647));
		//System.out.println(mrangeBitwiseAnd.rangeBitwiseAnd(1, 5));
		
		//System.out.println(0&1&2&3);
		
		
		
		//*****CheckPerformance Time*******
		double dConcludTime = System.currentTimeMillis()-StartTime;
		System.out.printf("Time Used => %.3f secs", dConcludTime/1000);
		//*********************************
		
	}
	public static String SwitchString(String sInput, int iBeInsert, int iCutFrom, int iTime){
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
