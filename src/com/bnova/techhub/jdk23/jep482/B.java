package com.bnova.techhub.jdk23.jep482;

public class B extends Parent {

	private int number = 10;
	private boolean bool = true;

	public B() {
		System.out.println("B constructor");
		super();
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
		new B();
	}
}
