package com.poc;

public class TestVehicle {

	public static void aMethod(long val1, int val2) {
		System.out.println("long, int");
	}

	public static void aMethod(int val1, byte val2) {
		System.out.println("int, long");
	}

	public static void main(String[] args) {
		aMethod(9, 10);
	}
}
