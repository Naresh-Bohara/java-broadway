package multithreading;

public class PrintThread extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		PrintThread t1 = new PrintThread();
		PrintThread t2 = new PrintThread();
		PrintThread t3 = new PrintThread();
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}
}
