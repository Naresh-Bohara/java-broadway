package controlstm.looping;

public class PrintNumbers {
public static void main(String[] args) {
	int sum = 0;
	int odd_sum = 0;
	int even_sum = 0;
	for(int i=0; i<=100; i++) {
//		System.out.println(i);
//		sum += i;
		
		System.out.println(i);
		if(i%2 == 0) {
			even_sum += i;
		}else {
			odd_sum +=i;
		}
		
		sum = even_sum + odd_sum;
	}
	System.out.println("Your sum is: "+sum);
	System.out.println("Your sum is: "+odd_sum);
	System.out.println("Your sum is: "+even_sum);
}
}
