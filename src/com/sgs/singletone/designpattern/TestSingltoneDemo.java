package com.sgs.singletone.designpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSingltoneDemo {
	
	static void useSingltone(){
		Singlton singlton = Singlton.getInstance();
		print("Singlton", singlton);
	}
    static void print(String name,Singlton Object){
		System.out.println(String.format("Object : %s, Hashcode : %d",name,Object.hashCode()));
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	
		
		// for creating singltone object 
		Singlton s1 = Singlton.getInstance();
		Singlton s2 = Singlton.getInstance();
		System.out.println(" HAshcode of S1 is :  " + s1.hashCode());
		System.out.println(" HAshcode of S2 is :  " + s2.hashCode());
		System.out.println(s1.equals(s2));
		//print("s1",s1);
		// By Reflaction API
		Class clazz = Class.forName("com.sgs.designpattern.test.Singlton");
		Constructor<Singlton> cons = clazz.getDeclaredConstructor();
		cons.setAccessible(true);
		Singlton s3 = cons.newInstance();
		System.out.println(" HAshcode of S3 is :  " + s3.hashCode());
		System.out.println(s3.equals(s2));

		System.out.println("-- serlization part output --- ");
		// By serlization & De-serlization
	

		 ObjectOutputStream oos = new ObjectOutputStream(new
		 FileOutputStream("/Serlizabled-concept/abc.txt"));
		 oos.writeObject(s2);
		
		// // de-serlization
		
		 ObjectInputStream ois = new ObjectInputStream(new
		 FileInputStream("/Serlizabled-concept/abc.txt"));
		 Singlton s4 = (Singlton) ois.readObject();
		 System.out.println(s4.hashCode());
		 System.out.println(s2.equals(s4));
		
		
		// By clone method
		 System.out.println("---Clone Method Output ----- ");
		 Singlton s5 = (Singlton) s2.clone();
		 System.out.println(" HAshcode of S5 is :  " + s5.hashCode());
		 System.out.println(s2.equals(s5));
		 
		 // mutithreaded system output
		 ExecutorService service = Executors.newFixedThreadPool(2);
		 service.submit(TestSingltoneDemo::useSingltone);
		 service.submit(TestSingltoneDemo::useSingltone);
		 service.shutdown();
		 
	}
	
	
}
