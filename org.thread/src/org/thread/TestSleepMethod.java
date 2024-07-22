package org.thread;

public class TestSleepMethod  {
	
	public static void main(String[] args) {
		
		for(int i=0;i<10;i++){
			try {Thread.sleep(500);} 
			catch (Exception exn) {
				System.out.println(exn);
			}
			System.out.println(i);
		}
		 
		
	}

}
