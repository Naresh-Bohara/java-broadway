package constructor;

public class User {
	// instance variables
	String username;
	String password;
	
	// default constructor
	User(){
		username="root";
		password = "password";
	}
	
	// parameterized constructor
	User(String username, String password){
		
		// constructor
		//default
//		this(); // default constructor
//		this(123,323); //parameterized constructor
		
		// instance variables
		this.username = username;
		this.password = password;
		
		
		// instance methods
//		this.printUser();
//		or
//		printUser();
		
		/*
		 * # 'this' keyword represents current object.
		 * 
		 * # we can call:
		 *    -> instance variables,
		 *    -> instance methods, 
		 *    -> constructors
		 */
		
	}
	
	// parameterized constructor
	User(String username){

		this.username = username;
		
	}
	
	void printUser() {
		System.out.println("Username = "+username);
		System.out.println("Password = "+password);
	}
	
	public static void main(String[] args) {
		User u = new User("naresh", "password");
		u.printUser();
//		Object
		
		// above is equivalent to below:
//		new User().printUser();
	}
}
