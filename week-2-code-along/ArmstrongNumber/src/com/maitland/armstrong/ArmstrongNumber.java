package com.maitland.armstrong;
import com.maitland.numberLength.LengthOfNumber;
public class ArmstrongNumber {
	
	private int number;
	private boolean isArmstrong;
	

	public void setNumber(int number) {
		this.number = number;
	}
	public boolean isArmstrong() {
		isArmstrongNumber();
		return isArmstrong;
	}

	public void isArmstrongNumber() {
		LengthOfNumber lengthOfNumber=new LengthOfNumber();
		lengthOfNumber.setNumber(number);
		int length=lengthOfNumber.getLength();
		
		int i;
		int totalNum=0;
		int startNum=number;
		for(i=number;i>0;i=i/10) {
			int singleNumber=i%10;
			totalNum+= Math.pow(singleNumber, length);
		}
		if(totalNum==startNum) {
			isArmstrong=true;
		}else {
			isArmstrong=false;
		}
	}
	
}
