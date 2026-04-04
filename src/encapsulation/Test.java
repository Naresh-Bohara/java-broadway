package encapsulation;
// POJO or model or entity class
public class Test {
	public static void main(String[] args) {
		Customer ct = new Customer(0, null, 0, null);		
		ct.setId(111);
		ct.setName("Naresh");
		ct.setAge(23);
		ct.setCity("Dhangadhi");
		
		System.out.println(ct);
		
//		System.out.println("Id: "+ ct.getId());
//		System.out.println("Name: "+ ct.getName());
//		System.out.println("Age: "+ ct.getAge());
//		System.out.println("City: "+ ct.getCity());
	}
}
