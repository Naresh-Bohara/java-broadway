package polymorphism.overriding;

public class OverridingDemo {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Dog();
		Animal a3 = new Cat();

		a1.sound();
		a2.sound();
		a3.sound();
	}
}
