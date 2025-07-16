package sub6;

public class Main {

	static void printSound(Pet o) {
		o.makeSound();
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		
		printSound(d);
		printSound(c);
		printSound(d);
		printSound(c);

	}

}
