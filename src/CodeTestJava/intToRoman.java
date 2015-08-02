package CodeTestJava;

import java.util.ArrayList;
import java.util.List;

public class intToRoman {
    public String intToRoman(int num) {
        String rtStr = "";
        
        List<RomanTableUnit> table = genRomanTable();
        while(!table.isEmpty()){
        	int iSize = table.size();
        	RomanTableUnit tmpItem = table.get(iSize-1);
        	
        	if(num - tmpItem.val>=0){
        		rtStr = rtStr + tmpItem.val_R;
        		num = num - tmpItem.val;
        		if(num == 0)
        			table.clear();
        	}else{
        		table.remove(iSize-1);
        	}
        }
        
        
        return rtStr;
    }
    class RomanTableUnit{
    	int val = 1;
    	String val_R = "I";
    }
    private List<RomanTableUnit> genRomanTable(){
    	List<RomanTableUnit> rtOut = new ArrayList<RomanTableUnit>();
    	
    	RomanTableUnit tmpItem = new RomanTableUnit();
    	tmpItem.val = 1;
    	tmpItem.val_R = "I";
    	rtOut.add(tmpItem);
    	tmpItem = new RomanTableUnit();
    	tmpItem.val = 4;
    	tmpItem.val_R = "IV";
    	rtOut.add(tmpItem);
    	tmpItem = new RomanTableUnit();
    	tmpItem.val = 5;
    	tmpItem.val_R = "V";
    	rtOut.add(tmpItem);
    	tmpItem = new RomanTableUnit();
    	tmpItem.val = 9;
    	tmpItem.val_R = "IX";
    	rtOut.add(tmpItem);
    	tmpItem = new RomanTableUnit();
    	tmpItem.val = 10;
    	tmpItem.val_R = "X";
    	rtOut.add(tmpItem);
    	tmpItem = new RomanTableUnit();
    	tmpItem.val = 40;
    	tmpItem.val_R = "XL";
    	rtOut.add(tmpItem);
    	tmpItem = new RomanTableUnit();
    	tmpItem.val = 50;
    	tmpItem.val_R = "L";
    	rtOut.add(tmpItem);
    	tmpItem = new RomanTableUnit();
    	tmpItem.val = 90;
    	tmpItem.val_R = "XC";
    	rtOut.add(tmpItem);
    	tmpItem = new RomanTableUnit();
    	tmpItem.val = 100;
    	tmpItem.val_R = "C";
    	rtOut.add(tmpItem);
    	tmpItem = new RomanTableUnit();
    	tmpItem.val = 400;
    	tmpItem.val_R = "CD";
    	rtOut.add(tmpItem);
    	tmpItem = new RomanTableUnit();
    	tmpItem.val = 500;
    	tmpItem.val_R = "D";
    	rtOut.add(tmpItem);
    	tmpItem = new RomanTableUnit();
    	tmpItem.val = 900;
    	tmpItem.val_R = "CM";
    	rtOut.add(tmpItem);
    	tmpItem = new RomanTableUnit();
    	tmpItem.val = 1000;
    	tmpItem.val_R = "M";
    	rtOut.add(tmpItem);
    	
    	return rtOut;
    }
}
