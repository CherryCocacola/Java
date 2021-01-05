package exception;

public class ClassCast {

	public static void main(String[] args) {
		Dog dog = new Dog();
		chageDog(dog);
		
//		Cat cat = new Cat();
//		.chageCat(cat);
		
	}
	public static void chageDog(Animal animal) {
		Dog dog = (Dog)animal;
		Dog dog = new Dog();
	}
}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

