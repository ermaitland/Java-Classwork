package com.sg.classroster.ui;

import java.util.Scanner;

public class UserIOConsoleImpl implements UserIO {
	Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

    }

	@Override
	public void print(String msg) {
		System.out.println(msg);
	}

	@Override
	public double readDouble(String prompt) {
		double value=scanner.nextDouble();
		return value;
	}

	@Override
	public double readDouble(String prompt, double min, double max) {
		double value=scanner.nextDouble();
		return value;
	}

	@Override
	public float readFloat(String prompt) {
		float value=scanner.nextFloat();
		return value;
	}

	@Override
	public float readFloat(String prompt, float min, float max) {
		float value=scanner.nextFloat();
		return value;
	}

	@Override
	public int readInt(String prompt) {
		int value=scanner.nextInt();
		return value;
	}

	@Override
	public int readInt(String prompt, int min, int max) {
		int value=scanner.nextInt();
		return value;
	}

	@Override
	public long readLong(String prompt) {
		long value=scanner.nextLong();
		return value;
	}

	@Override
	public long readLong(String prompt, long min, long max) {
		long value=scanner.nextLong();
		return value;
	}

	@Override
	public String readString(String prompt) {
		System.out.println(prompt);
		String value=scanner.nextLine();
		return value;
	}}
