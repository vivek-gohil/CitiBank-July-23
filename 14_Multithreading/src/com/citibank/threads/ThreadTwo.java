package com.citibank.threads;

public class ThreadTwo implements Runnable {

	public void run() {
		System.out.println("ThreadTwo start");
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("ThreadTwo " + i);
		}
		System.out.println("ThreadTwo end");
	}

}
