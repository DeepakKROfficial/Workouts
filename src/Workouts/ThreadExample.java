package Workouts;

public class ThreadExample {
	public static void main(String[] args) throws InterruptedException {
		myThread thread = new myThread();
		thread.start();
		thread.run();
		thread.stop();	
		
		myThreadInterface thread2 = new myThreadInterface();
		thread2.run();
		
		threadHi hi = new threadHi();
		threadHello hello = new threadHello();
		hi.start();
		hello.start();
	}
}
class myThread extends Thread{
	int[] numberList = {6,7,8,9,10};
	public void run() {
		for (int i=0; i<5;i++) {
			System.out.println(numberList[i] *=2); 
		}
	}
	
}

class myThreadInterface implements Runnable{
	int[] numberList = {6,7,8,9,10};
	public void run() {
		for (int i=0; i<5;i++) {
			System.out.println(numberList[i]); 
		}
	}
	
}

class threadHi extends Thread{
	int[] numberList = {6,7,8,9,10};
	public void run() {
		for (int i=0; i<5;i++) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Hi"); 
		}
	}
	
}

class threadHello extends Thread{
	int[] numberList = {6,7,8,9,10};
	public void run() {
		for (int i=0; i<5;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Hello"); 
		}
	}
	
}