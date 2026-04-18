package aggregation;

public class Test {
	public static void main(String[] args) {
		Car c  = new Car();
		c.setColor("Red");
		c.setModel("M-21");
		c.setName("Bugati");
		c.setPrice(12000000);
		
		Employee emp = new Employee();
		emp.setId(123);
		emp.setCompany("Apple");
		emp.setSalary(130000);
		emp.setName("Naresh Bohara");
		emp.setCar(c);
		System.out.println("--------- Employee Info ------------");
		System.out.println("Id = "+emp.getId());
		System.out.println("Name = "+emp.getName());
		System.out.println("Company = "+emp.getCompany());
		System.out.println("Salary = "+emp.getSalary());
		
//		System.out.println("Car = "+emp.getCar());
		System.out.println();
		System.out.println("--------- Car Info ------------");
		System.out.println("Color = "+emp.getCar().getName());
		System.out.println("Color = "+emp.getCar().getColor());
		System.out.println("Color = "+emp.getCar().getModel());
		System.out.println("Color = "+emp.getCar().getPrice());
		
	}
}
