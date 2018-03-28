package com.sgs.singletone.designpattern;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestSingletone t = TestSingletone.getInstance();
		TestSingletone t1 = TestSingletone.getInstance();
		TestSingletone t2 = TestSingletone.getInstance();
		TestSingletone t3 = TestSingletone.getInstance();
	}

}
