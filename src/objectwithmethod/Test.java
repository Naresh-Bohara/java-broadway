package objectwithmethod;

//import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Test t = new Test();
		Product p = t.getProductData();
		t.printProduct(p);
//		System.out.println(Arrays.toString(t.getAllProducts()));
		t.printAllProducts(t.getAllProducts());
	}
	
	// object as parameters:
	void printProduct(Product p) {
		System.out.println("Id = "+p.getId());
		System.out.println("Name = "+p.getName());
		System.out.println("Price = "+p.getPrice());
		System.out.println("Company = "+p.getCompany());
	}
	
	// object as return type:
	Product getProductData() {
		Product p = new Product();
		p.setId(112);
		p.setName("Redmi note-14");
		p.setPrice(120000);
		p.setCompany("Redmi");
		
		return p;
	}
	
	// array of object as a parameter: 
	void printAllProducts(Product[] prods) {
		for(Product x:prods) {
			System.out.println(x);
		}
	}
	
	// array of object as return type: 
	Product[] getAllProducts() {
		
		Product[] products = new Product[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<products.length; i++) {
			Product p = new Product();
			System.out.println("Please enter product Id: ");
			p.setId(sc.nextInt());
			System.out.println("Please enter product Name: ");
			p.setName(sc.next());
			System.out.println("Please enter product Price: ");
			p.setPrice(sc.nextInt());
			System.out.println("Please enter product Company: ");
			p.setCompany(sc.next());
			
			products[i] = p; 
		}
		sc.close();
		return products;
		
	}
}
