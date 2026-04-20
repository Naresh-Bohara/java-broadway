package javacollection.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProductTest {
public static void main(String[] args) {
	Set<Product> pSet = new HashSet<>();
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter no. of products: ");
	int n = sc.nextInt();
	
	for(int i = 0; i< n; i++) {
		Product p = new Product();
		System.out.println("Please enter product id for product "+(i+1)+": ");
		p.setId(sc.nextInt());
		
		System.out.println("Please enter product Name for product "+(i+1)+": ");
		p.setName(sc.next());
		
		System.out.println("Please enter product company for product "+(i+1)+": ");
		p.setCompany(sc.next());
		
		System.out.println("Please enter product price for product "+(i+1)+": ");
		p.setPrice(sc.nextInt());
		
		pSet.add(p);
		
	}
	
	for(Product p: pSet) {
		System.out.println(p);
	}
}
}
