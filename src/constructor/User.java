package constructor;

public class User {
	String username;
	String password;
	
	// default constructor
//	User(){
//		username="root";
//		password = "password";
//	}
	
	// parameterized constructor
	User(String un, String psw){
		username = un;
		password = psw;
		
	}
	
	void printUser() {
		System.out.println("Username = "+username);
		System.out.println("Password = "+password);
	}
	
	public static void main(String[] args) {
		User u = new User("naresh", "password");
		u.printUser();
		
		// above is equivalent to below:
//		new User().printUser();
	}
}
