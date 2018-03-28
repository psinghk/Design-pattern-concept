package com.sgs.factory.designpattern;

public class IPhone  implements Mobile{
	private int ramSize;
	private String processor;
	private String GPU;
	
	public IPhone(int ramSize, String processor, String GPU) {
		
		this.ramSize = ramSize;
		this.processor = processor;
		this.GPU = GPU;
	}
  
	// for checking on git
	@Override
	public String toString() {
		return "IPhone [ramSize=" + ramSize + ", processor=" + processor + ", GPU=" + GPU + "]";
	}
	
	
}
