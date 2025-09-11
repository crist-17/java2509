package ko.co.ext;

public class Dog extends Animal {

	String breeds;

	public Dog() {
		super();
	}

	public Dog(String name, int age) {
		super(name, age);
	}

	public Dog(String name, int age, String breeds) {
		super(name, age);
		this.breeds = breeds;
		
	}
	
	

	@Override
	public void sound() {
		super.sound();
		System.out.println(name+ "멍멍");
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println("dog:"+this.breeds);
	}

	
}

