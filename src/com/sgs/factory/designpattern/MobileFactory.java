package com.sgs.factory.designpattern;

public class MobileFactory {
	public static Mobile createMobile(String type){
		
		if(type.equals(Mobile.IPHONE)){
			return new IPhone(2, "G9", "A9GPU");
		}else if(type.equals(Mobile.Samsung)){
			return new Samsung("Intel");
		}else if(type.equals(Mobile.SONY)){
			return new Sony(2, "ARM");
		}else{
			return null;
		}
	}
}
