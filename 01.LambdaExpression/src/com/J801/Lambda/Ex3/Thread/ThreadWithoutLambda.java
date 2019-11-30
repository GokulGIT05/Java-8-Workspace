package com.J801.Lambda.Ex3.Thread;

public class ThreadWithoutLambda {

	public static void main(String[] args) {
		
		MyRunnable myThread = new MyRunnable();
		Thread thread = new Thread(myThread);
		thread.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("Inside  Main Thread");
		}

	}

}

class MyRunnable implements Runnable {

	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Inside  Child Thread");
		}
	}
}



