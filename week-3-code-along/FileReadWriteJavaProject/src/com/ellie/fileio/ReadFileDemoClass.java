package com.ellie.fileio;

import java.io.BufferedReader;
import java.util.Scanner;
import java.io.FileReader;

public class ReadFileDemoClass {

	public static void main(String[] args) throws Exception {
		FileReader fileReader=new FileReader("DemoFile");
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		Scanner scanner=new Scanner(bufferedReader);
		while(scanner.hasNext()) {
			String currentLine=scanner.nextLine();
			System.out.println(currentLine);
		}
		fileReader.close();
		bufferedReader.close();

	}

}
