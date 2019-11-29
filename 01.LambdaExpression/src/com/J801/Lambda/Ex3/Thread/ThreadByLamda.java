package com.J801.Lambda.Ex3.Thread;

public class ThreadByLamda {

	public static void main(String[] args) {

		// Lamda
		Runnable myRun = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("Inside  Child Thread");
			}
		};

		Thread myThread = new Thread(myRun);
		myThread.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("Inside  Main Thread");
		}

	}

}
