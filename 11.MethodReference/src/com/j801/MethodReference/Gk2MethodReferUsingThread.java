package com.j801.MethodReference;

public class Gk2MethodReferUsingThread {

	public static void main(String[] args) {

		// First Method: Lamda Expression:

		/*
		 * Runnable thelambda = () -> { for (int i = 0; i <= 5; i++) {
		 * System.out.println("Inside Child Thread"); }
		 * 
		 * };
		 * 
		 * Thread theThread = new Thread(thelambda); theThread.start();
		 * 
		 * for (int i = 0; i <= 5; i++) { System.out.println("Inside Main Thread"); }
		 * 
		 * System.out.println("--------------------------------------------------------"
		 * );
		 */

		// Second Approach:
		// Lambda Alternative: Method Reference Appraoch

		Gk2MethodReferUsingThread theReference = new Gk2MethodReferUsingThread();
		// Because of instance method we need to call by using reference object.
		Runnable mRefer = theReference::methodReference;

		Thread theThread = new Thread(mRefer);
		theThread.start();

		for (int i = 0; i <= 5; i++) {
			System.out.println("Main Thread");
		}

	}

	// This method will act like run() method inside Runnable Interface.
	public void methodReference() {

		for (int i = 0; i <= 5; i++) {
			System.out.println("Inside Child Thread method Reference");
		}
	}

}
