// day-02 - 04
package datatypes;

import java.math.BigInteger;

public class BigNumbers {
/**
 * -------------------------------------Big Numbers---------------------------------------
 * 	1. BigInteger
 * 	2. BigDecimal
 */
	
	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE+100); // for this we have BigInteger and BigDecimal
		
		BigInteger a = BigInteger.valueOf(Long.MAX_VALUE);
		BigInteger b = BigInteger.valueOf(Long.MAX_VALUE);
		
		BigInteger s = a.add(b);
		System.out.println(s);
		
	}
}
