package com.hanains.gof.singleton;

public class Singleton1 {
	private static Singleton1 single = new Singleton1();

	public static Singleton1 getInstance() {
		return single;
	}

	private Singleton1() {
	}
}
