package com.bnova.techhub.jdk23.jep482;

public abstract class Parent {

	public Parent() {
		System.out.println("Parent constructor");
		System.out.println("Number: " + getNumber());
		System.out.println("Boolean: " + whatDoesTheBooleanSay());
	}

	abstract int getNumber();

	boolean whatDoesTheBooleanSay() {
		return false;
	}
}
