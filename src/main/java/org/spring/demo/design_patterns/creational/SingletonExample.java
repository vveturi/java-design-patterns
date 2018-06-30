package org.spring.demo.design_patterns.creational;

public class SingletonExample {
	public static void main(String args[]) {
		/*
		▪ Only one instance created 
		▪ Guarantees control of a resource 
		▪ Lazily loaded 
		▪ Examples: 
			▪ Runtime 
			▪ Logger 
			▪ Spring Beans 
			▪ Graphic Managers 
		Design	
		▪ Class is responsible for lifecycle Static in nature 
		▪ Needs to be thread safe 
		▪ Private instance 
		▪ Private constructor 
		▪ No parameters required for construction	*/		
		Runtime singletonRuntime = Runtime.getRuntime();

		singletonRuntime.gc();
		
		System.out.println(singletonRuntime);
		
		Runtime anotherInstance = Runtime.getRuntime();
		
		System.out.println(anotherInstance);
		
		if(singletonRuntime == anotherInstance) {
			System.out.println("They are the same instance");
		}
		
	}

}
