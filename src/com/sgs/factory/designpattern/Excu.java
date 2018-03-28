package com.sgs.factory.designpattern;

public class Excu {

	public static void main(String[] args) {
		// MobileFactory factory = new MobileFactory();
		Mobile SamsungMobile = MobileFactory.createMobile(Mobile.Samsung);
		System.out.println("---Samsung Mobile Confrigration ---");
		System.out.println(SamsungMobile.toString());
		System.out.println();
		
		// 
		System.out.println(" Check commit test:");

		Mobile SonyMobile = MobileFactory.createMobile(Mobile.SONY);
		System.out.println("---Sony Mobile Confrigration ---");
		System.out.println(SonyMobile.toString());
		System.out.println();

		Mobile iphoneMobile = MobileFactory.createMobile(Mobile.IPHONE);
		System.out.println("---Iphone Mobile Confrigration---");
		System.out.println(iphoneMobile.toString());
	}
}
