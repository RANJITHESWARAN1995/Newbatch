package org.thread;

public class ABC extends Thread{
	
	public void run() {
		
		System.out.println("Thread class is Running");
	}
	
public static void main(String[] args) {
		
		ABC abc = new ABC();
		abc.start();
	}

}
