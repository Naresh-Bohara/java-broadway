package typecasting;

public class TypeCastingDocs {
	/*
	 * ----------------- Type casting -------------------------
	 * 	 # syntax: 
	 * 			data_type var = (data_type) value;
	 * 
	 * 	1. implicit casting (automatic)
	 * 		byte -> short -> int -> long -> float -> double
	 * 
	 * 	2. explict casting (manual)
	 * 		double -> float -> long -> int -> short -> byte -> char
	 * */
	
	public static void main(String[] args) {
		byte c = 111;
		int d  = c;	// auto casting
		
		double k = 534535.234;
//		int m = k; // not allowed
		int m = (int) k;	// explict casting
	}
}
