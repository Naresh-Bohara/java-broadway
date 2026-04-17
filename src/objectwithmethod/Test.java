package objectwithmethod;

public class Test {
	public static void main(String[] args) {
		
		Test t = new Test();
		Product p = t.getProductData();
		t.printProduct(p);
	}
	
	// object as parameters:
	void printProduct(Product p) {
		System.out.println("Id = "+p.getId());
		System.out.println("Name = "+p.getName());
		System.out.println("Price = "+p.getPrice());
		System.out.println("Company = "+p.getPrice());
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
		
	}
	
	// array of object as return type:
	Product[] getAllProducts() {
		Product[] products = new Product[4];
		
		return null;
		
	}
}
