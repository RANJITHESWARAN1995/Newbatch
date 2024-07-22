package org.thread;

public class Task implements Runnable{
	
	public void run(){  
		System.out.println("thread is running...");  
		}  
	
	public static void main(String[] args) {
	
		Runnable R = new Task();
		Thread thread = new Thread(R,"New Thread");
		thread.start();
		
		String str = thread.getName();  
		System.out.println(str);  


	}

}
