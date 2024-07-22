package org.thread;

public class Test  {

		public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(15);
		Thread.currentThread().setPriority(7);
		Mythread t =new Mythread();
		System.out.print(t.getPriority());
		
		
		
		Mythread t1= new Mythread();
		t1.setPriority(3);
		t1.start();
		for(int i=0;i<=5;i++) {
			
			System.out.println("main thread");
		}

		}



}
