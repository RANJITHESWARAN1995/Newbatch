package org.thread;

public class Mythread extends Thread {

	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++) {
			
			System.out.println("Child thread");
		}
	}

}
