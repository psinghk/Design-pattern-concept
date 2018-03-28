package com.sgs.factory.designpattern;

public class Samsung implements Mobile {
	private int ramSize;
	private String processor;
	
	public Samsung(int ramSize) {
		this.ramSize = ramSize;
	}

	public Samsung(String processor) {
		this.processor = processor;
		this.ramSize=2;
	}

	//  Here something try to change
	@Override
	public String toString() {
		return "Samsung [ramSize=" + ramSize + ", processor=" + processor + "]";
	}
	
	
	
}
