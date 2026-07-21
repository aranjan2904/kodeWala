package com.kodewala.interface6;

@FunctionalInterface
public interface FunctionInterfacePractice {

	public abstract int learn();
	
	public default int learnSomething() {
		
		return 6;
	}
}
