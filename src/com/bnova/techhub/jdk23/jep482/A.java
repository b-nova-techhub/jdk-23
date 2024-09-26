package com.bnova.techhub.jdk23.jep482;

public class A extends Parent {

	private int number = 10;
	private boolean bool = true;

	public A() {
		System.out.println("A constructor");
	}

	@Override
	int getNumber() {
		return number;
	}

	@Override
	boolean whatDoesTheBooleanSay() {
		return bool;
	}

	public static void main() {
		new A();
	}
}
