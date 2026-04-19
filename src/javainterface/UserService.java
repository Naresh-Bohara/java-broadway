package javainterface;

import java.io.Serializable;
import java.util.List;

public interface UserService extends CommonService, Serializable, List<String> {
//	private int age = 23; // not allowed
	
	public static final int age = 23;
	
	void addUSer();
	void deleteUSer();
	default void editUser() {
		
	}
	
	static void getUser() {
		System.out.println("User fetched!");
	}
	
}
