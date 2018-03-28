package com.sgs.factory.designpattern;

public class Sony  implements Mobile{

	private int ramSize;
	private String processor;
	
	public Sony(int ramSize, String processor) {
		this.ramSize = ramSize;
		this.processor = processor;
	}

//	 private void Syso() {
//		// TODO Auto-generated method stub
//
//	}
	@Override
	public String toString() {
		return "Sony [ramSize=" + ramSize + ", processor=" + processor + "]";
	}
	
	
}
