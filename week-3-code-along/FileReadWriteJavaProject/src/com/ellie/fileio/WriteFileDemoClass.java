package com.ellie.fileio;

import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteFileDemoClass {

	public static void main(String[] args) throws Exception {
		//Opening the file for writing
		FileWriter fileWriter=new FileWriter("DemoFile");
//		printWriter is referring to the file
		PrintWriter printWriter=new PrintWriter(fileWriter);
		
		printWriter.println("Demonstrating writing in the file...");
		printWriter.println("Happy Learning!");
		printWriter.println("Hope to have great learning Session!");
		
		printWriter.flush();
		printWriter.close();
		fileWriter.close();
		
		System.out.println("File Created!");

	}

}
