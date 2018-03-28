package com.sgs.singletone.designpattern;

public class TestSingletone {

	private static TestSingletone ts = null;
	
	private TestSingletone(){
		System.out.println(" object is created by call getinstance()");
	}
	
	
	public static TestSingletone getInstance(){
		if(ts==null){
			ts=new TestSingletone();
		}
		return ts;
	}
}
