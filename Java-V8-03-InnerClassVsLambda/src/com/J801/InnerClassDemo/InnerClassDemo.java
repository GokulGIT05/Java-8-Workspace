package com.J801.InnerClassDemo;

public class InnerClassDemo {

	public static void main(String[] args) {

		Runnable theRunnable = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 5; i++) {
					System.out.println("Inside Inner Class");
				}

			}

		};

		Thread theThread = new Thread(theRunnable);
		theThread.start();

		for (int i = 0; i <= 5; i++) {
			System.out.println("Outside Inner Class");
		}

	}

}
