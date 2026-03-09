package datatypes;

public class TypeRulesDemo {
    public static void main(String[] args) {

        // 🔹 Division Rules
        System.out.println("Division Rules:");
        System.out.println("int / int = " + (5 / 2));          // 2
        System.out.println("int / double = " + (5 / 2.0));    // 2.5
        System.out.println("double / int = " + (5.0 / 2));    // 2.5
        System.out.println("double / double = " + (5.0 / 2.0)); // 2.5

        System.out.println("\nArithmetic Rules:");
        System.out.println("int + int = " + (5 + 2));          // 7
        System.out.println("int + double = " + (5 + 2.5));    // 7.5
        System.out.println("double + double = " + (5.5 + 2.5)); // 8.0

        System.out.println("\nMultiplication Rules:");
        System.out.println("int * int = " + (5 * 2));          // 10
        System.out.println("int * double = " + (5 * 2.5));    // 12.5

        System.out.println("\nAssignment Rules:");
        int a = 5;
        double b = 5;       // widening
        int c = (int) 5.9;  // casting
//        int dd = 22.3;		// not allowed 

        System.out.println("int = int -> " + a);
        System.out.println("double = int -> " + b);
        System.out.println("int = (int) double -> " + c);

        System.out.println("\nComparison Rules:");
        System.out.println("int == double -> " + (5 == 5.0));
        System.out.println("int < double -> " + (5 < 5.5));

        System.out.println("\nIncrement / Decrement:");
        int x = 5;
        System.out.println("x++ -> " + (x++)); // 5
        System.out.println("after x++ -> " + x); // 6
        System.out.println("++x -> " + (++x)); // 7

        System.out.println("\nType Promotion Order:");
        byte by = 10;
        short sh = by;
        int in = sh;
        long lo = in;
        float fl = lo;
        double db = fl;

        System.out.println("byte -> short -> int -> long -> float -> double");
        System.out.println(db);
    }
}

