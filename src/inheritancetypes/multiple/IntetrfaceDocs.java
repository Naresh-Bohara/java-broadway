package inheritancetypes.multiple;

public class IntetrfaceDocs {

    /*
     * ================= INTERFACE IN JAVA =================
     *
     * Definition:
     * An interface is a contract that defines a set of methods
     * that a class must implement. It specifies what to do, not how to do.
     *
     * -------------------------------------------------------
     * KEY FEATURES
     * -------------------------------------------------------
     *
     * - Methods are public and abstract by default
     * - Variables are public, static, and final (constants)
     * - Cannot create object of interface
     * - A class uses 'implements' keyword to use interface
     * - A class must implement all abstract methods
     *
     * Java 8+:
     * - default methods (with body)
     * - static methods
     *
     * Java 9+:
     * - private methods (for internal use)
     *
     * -------------------------------------------------------
     * SYNTAX
     * -------------------------------------------------------
     *
     * interface Payment {
     *     void pay(double amount);
     * }
     *
     * class Esewa implements Payment {
     *     public void pay(double amount) {
     *         System.out.println("Payment done");
     *     }
     * }
     *
     * -------------------------------------------------------
     * MULTIPLE INHERITANCE
     * -------------------------------------------------------
     *
     * - A class can implement multiple interfaces
     * - Helps achieve multiple inheritance in Java
     *
     * Example:
     *
     * interface A { void show(); }
     * interface B { void display(); }
     *
     * class Test implements A, B {
     *     public void show() {}
     *     public void display() {}
     * }
     *
     * -------------------------------------------------------
     * REAL WORLD USE
     * -------------------------------------------------------
     *
     * - Payment systems (Esewa, Khalti, Card)
     * - Notification services
     * - Logging systems
     * - API design and microservices
     *
     * -------------------------------------------------------
     * ADVANTAGES
     * -------------------------------------------------------
     *
     * - Provides abstraction
     * - Supports multiple inheritance
     * - Promotes loose coupling
     * - Improves scalability and maintainability
     *
     * -------------------------------------------------------
     * KEY POINT
     * -------------------------------------------------------
     *
     * Interface = Contract (rules that classes must follow)
     *
     */
}