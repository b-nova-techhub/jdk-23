package com.bnova.techhub.jdk23.jep482;

public class C extends Parent {

	private int number;
	private boolean bool;

	public C() {
		System.out.println("C constructor");
		this.number = 10;
		this.bool = true;
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
		new C();
	}
}
