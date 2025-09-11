package ko.co.ext;

public class Cat extends Animal {

	String breeds;

	public Cat() {
		super();
	}

	public Cat(String name, int age) {
		super(name, age);
	}

	public Cat(String name, int age, String breeds) {
		super(name, age);
		this.breeds = breeds;
	}

	@Override
	public void sound() {
		super.sound();
		System.out.println(name+ "야옹");
	}
	
public void displayInfo() {
	super.displayInfo();
	System.out.println("cat:"+this.breeds);
		
	}
}
