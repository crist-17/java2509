package kr.co.inherit;

public class Dog extends Animal {

	String breeds;

	public Dog(String name, int age, String breeds) {
		super(name, age);
		this.breeds = breeds;
	}

	public void wagTail() {
		System.out.println(name+"꼬리를흔든다");

	}
	
	@Override
	public void displayInfo() {
		
		super.displayInfo();
		System.out.println(name+" "+age+" "+this.breeds);
	}

	@Override
	public void eat() {
		super.eat();
		System.out.println(this.name + "오리고기먹");
	}
	
	@Override
	public void makeSound() {
		
		super.makeSound();
		
		System.out.println(name + "가 멍멍~~");
	}
	
	

}
