package statickeyword;

public class WithoutMain {

    // Static block executes when class is loaded
    static {
        System.out.println("Static block is invoked.");
        System.exit(0); // Terminates JVM before main() executes
    }

    public static void main(String[] args) {
        /*
         * NOTE:
         * - In older versions of Java (before Java 7),
         *   a program could run without a main() method
         *   using a static block and System.exit(0).
         *
         * - In modern Java (Java 7 and above),
         *   JVM strictly requires the main() method as
         *   the entry point of execution.
         *
         * - Even though static block executes first,
         *   the JVM will not run the program if main()
         *   method is not present.
         */
    }
}