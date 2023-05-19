package com.maitland.armstrongRange;
import com.maitland.armstrong.ArmstrongNumber;

public class ArmstrongRange {
private int number;
private String armstrongNumbers;


public void setNumber(int number) {
	this.number = number;
}
public String getArmstrongNumbers() {
	armstrongNumbersFromRange();
	return armstrongNumbers;
}


public void armstrongNumbersFromRange() {
	ArmstrongNumber armstrong=new ArmstrongNumber();
	int i;
	armstrongNumbers="";
	for(i=1;i<=number;i++) {
		armstrong.setNumber(i);
		if(armstrong.isArmstrong()) {
			String armstrongString = String.valueOf(i);
			System.out.println(armstrongString);
			armstrongNumbers= armstrongNumbers+", "+armstrongString;
		}
	}
}

}
