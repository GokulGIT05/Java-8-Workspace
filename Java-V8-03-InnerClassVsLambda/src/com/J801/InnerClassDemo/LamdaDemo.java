package com.J801.InnerClassDemo;

public class LamdaDemo {

	public static void main(String[] args) {
		
		// First Way

		/*Runnable theRunnable = () -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Inside Inner Class");
			}
		};
		
		

		Thread theThread = new Thread(theRunnable);
		theThread.start();
*/
		
		
		
		// Second Way
		
		Thread theThread = new Thread(() -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Inside Inner Class");
			}
		});
		
		
		theThread.start();

		for (int i = 0; i <= 5; i++) {
			System.out.println("Outside Inner Class");
		}

	}

}
