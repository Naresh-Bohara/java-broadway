package inheritancetypes;

public class InheritanceTypesDocs {

    /*
     * ================= INHERITANCE IN JAVA =================
     * 
     * Inheritance is an OOP concept where one class (child/subclass)
     * acquires the properties and behaviors of another class (parent/superclass).
     * 
     * Keyword used: extends
     * 
     * Example:
     * class Admin extends User
     * 
     * -------------------------------------------------------
     * TYPES OF INHERITANCE IN JAVA
     * -------------------------------------------------------
     * 
     * 1. Single Inheritance
     *    - One parent → One child
     *    Example: Admin → User
     * 
     * 2. Multilevel Inheritance
     *    - Chain inheritance (A → B → C)
     *    Example: User → Admin → SuperAdmin
     * 
     * 3. Hierarchical Inheritance
     *    - One parent → Multiple children
     *    Example: User → Admin, Customer
     * 
     * 4. Multiple Inheritance (NOT supported using classes)
     *    - One child → Multiple parents
     *    ❌ Not allowed in Java (to avoid ambiguity problem)
     *    ✔ Achieved using interfaces
     * 
     * 5. Hybrid Inheritance
     *    - Combination of multiple + other types
     *    ❌ Not supported directly with classes
     *    ✔ Possible using interfaces
     * 
     * -------------------------------------------------------
     * ADVANTAGES
     * -------------------------------------------------------
     * ✔ Code reusability
     * ✔ Reduces duplication
     * ✔ Easy maintenance
     * ✔ Improves code structure
     * 
     * -------------------------------------------------------
     * REAL WORLD EXAMPLE
     * -------------------------------------------------------
     * User (Parent)
     *   ├── Admin (Child)
     *   ├── Customer (Child)
     * 
     * Like:
     * A person can be a User,
     * Admin has extra powers (manage users),
     * Customer has different features (buy products)
     * 
     * -------------------------------------------------------
     * IMPORTANT NOTE
     * -------------------------------------------------------
     * Java supports:
     * ✔ Single
     * ✔ Multilevel
     * ✔ Hierarchical
     * 
     * Java does NOT support:
     * ❌ Multiple (with classes)
     * ❌ Hybrid (with classes)
     * 
     */
}