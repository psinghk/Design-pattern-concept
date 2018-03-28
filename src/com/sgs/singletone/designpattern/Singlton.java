package com.sgs.singletone.designpattern;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singlton implements Serializable,Cloneable {
	
	// This is egear instanstion of an singltone object
	// because whenever this class load that singltone object is created:
	
	 //private static Singlton singlton = new Singlton();

	 // this is lazy instanstion of an object
	private static Singlton singlton = null;
	
	
	private Singlton() {
		if(singlton!=null)
		 throw new RuntimeException("cannot create ,use getInstace()");
		//proceed with creation
		System.out.println("Creating.... ");
	}

	public static Singlton getInstance() {
		if(singlton==null){
			singlton = new Singlton();
		}
		return singlton;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return singlton;
	}
	
	 public Object readResolve() throws ObjectStreamException{
		 System.out.println("::-read resolve--");
		 return singlton;
	 }
}
