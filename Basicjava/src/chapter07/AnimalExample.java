package chapter07;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog =new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("---------");
		
		Animal animal=null;
		animal=new Dog;
		animal.sound();
	}

}
