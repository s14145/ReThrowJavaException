package com.package1;

public class ReThrowExcep {
	
	// Method "someMethod2" throwing Null Pointer Exception
	static void someMethod2() {
		String s=null;
		s.length();
	}

	// Method calling above "someMethod2" method
	// Re-throwing Exception
	static void someMethod() {
		try {
			someMethod2();
		}catch(NullPointerException e) {
			System.out.println("Caught Null Pointer Exception in someMethod");;
			throw e;
		}
	}
	
	public static void main(String[] args) {
		
		// Catch the re-thrown exception
		try {
		someMethod();
		}catch(NullPointerException e) {
			System.out.println("Caught in main method");
			// Printing the stack trace of this exception
			e.printStackTrace();
		}
	}
	
	
	
	
}
