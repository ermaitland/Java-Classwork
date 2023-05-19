package com.maitland.height;

import java.util.Scanner;

public class HeightMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Height height1=new Height();
		height1.inputHeight(4,16);
		height1.displayHeight();
		Height height2=new Height();
		height2.inputHeight(5,7);
		height2.displayHeight();
		
		Height height3=new Height();
		height3.complexSum(height2, height1);
		height3.displayHeight();

	}

}
