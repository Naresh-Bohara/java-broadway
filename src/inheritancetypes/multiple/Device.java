package inheritancetypes.multiple;

/*
 * # Multiple inheritance is not supported in Java using classes because it can lead to
 * 	 method ambiguity, known as the Diamond Problem.
 * 
 * # When two parent classes define the same method, the child class cannot determine 
 * 	 which implementation to inherit.
 * 
 * # This creates confusion, unpredictable behavior, and increases maintenance complexity 
 * 	 in large systems.
 * 
 * # To avoid this, Java enforces single inheritance for classes and provides interfaces to
 * 	 achieve multiple inheritance in a controlled and explicit way.
 * 
 * # Java avoids multiple inheritance in classes to prevent ambiguity and unpredictable behavior,
 * 	 and instead uses interfaces for controlled multiple inheritance.
 */

class Device {
    void start() {
        System.out.println("Device starting");
    }
}

class Camera extends Device {
    void start() {
        System.out.println("Camera starting");
    }
}

class Phone extends Device {
    void start() {
        System.out.println("Phone starting");
    }
}

// Not allowed
//class Smartphone extends Camera, Phone {
//}
