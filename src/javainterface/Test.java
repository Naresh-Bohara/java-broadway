package javainterface;

public class Test {
	public static void main(String[] args) {
//		UserService us = new UserService(); // can't be done for interface
		
		UserService us = new UserServiceImpl();
		us.addUSer();
		us.deleteUSer();
		
//		CommonService cs = new UserServiceImpl();
//		cs.print();
		
		us.print();
	}
}
