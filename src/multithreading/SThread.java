package multithreading;

public class SThread extends Thread{
	@Override
	public void run() {
		System.out.println("Name = "+ Thread.currentThread().getName());
		System.out.println("Priority = "+Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		SThread t1 = new SThread();
		SThread t2 = new SThread();
		SThread t3 = new SThread();
		
		t1.setName("nari");
		t2.setName("pari");
		t3.setName("hari");
		
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		t3.setPriority(MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
