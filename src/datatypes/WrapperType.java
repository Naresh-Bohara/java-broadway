package datatypes;

public class WrapperType {
/**
 * ------------------------------Wrapper Classes----------------------------------
 * 	 # Every primitive data type have their respective class is known as wrapper class.
 * 		
 * 		Primitive Type                          Wrapper Type
 * 		byte									Byte
 * 		short									Short
 * 		int										Integer
 * 		long									Long
 * 		float									Float
 * 		double									Double
 * 		char									Character
 * 		boolean									Boolean
 */
	

/**
 * ---------------------------------------Auto boxing------------------------------------------
 * 	# conversion of primitive type into wrapper type
 * 
 * ---------------------------------------Auto unboxing----------------------------------------
 *	# conversion of wrapper classes into primitive classes
 * 		
 */
	
	
	public static void main(String[] args) {
//		int x = 400;
//		Integer y  = 890;
//		y.doubleValue();
		
//		int k = 123;
//		Integer p = k; // auto-boxing
//		
//		Double m = 2132313.132213;
//		double j = m; //auto-unboxingint k = 123;
//		Integer p = k; // auto-boxing
//		
//		Double m = 2132313.132213;
//		double j = m; //auto-unboxing
		
		System.out.println(Integer.toBinaryString(123));
		System.out.println(Integer.toHexString(1321));
		System.out.println(Integer.toOctalString(324390));
		
		System.out.println(Long.MAX_VALUE+100); // for this we have BigInteger and BigDecimal
	}
	

		
}
