package multithreading;

public class TestThread extends Thread{
	@Override
	public void run() {
		System.out.println("---------Test Thread -----------");
	}
	
	public static void main(String[] args) {
		TestThread t1 = new TestThread();
		t1.start();
		
		System.out.println("------- Main Thread ----------");
	}
}
