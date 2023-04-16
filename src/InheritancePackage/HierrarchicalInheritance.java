package InheritancePackage;

class Animal {
	int legs=4;
	public void eat() {
		System.out.println("I eat everyday");
	}
	
}

class Dog extends Animal {
	public void bark() {
		System.out.println(" I bark loudly.");
	}
	
}

class Cat extends Animal {
	public void meow() {
		System.out.println(" I meow slowly");
	}
}

public class HierrarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		Cat c = new Cat();
		System.out.println("Dog has "+ d.legs + " legs.");
		d.bark();
		System.out.println("Cat has " + c.legs + " legs.");
		c.meow();

	}

}
