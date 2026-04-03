package statickeyword;

public class CountWithStatic {
	static int count = 0; // will get memory only once and retain its value.
	
	public CountWithStatic() {
		count++;
	}
	
	private void showCount() {
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		new CountWithStatic().showCount();
		new CountWithStatic().showCount();
		new CountWithStatic().showCount();
	}
}
