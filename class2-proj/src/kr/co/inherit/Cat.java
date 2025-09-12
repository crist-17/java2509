package kr.co.inherit;

public class Cat extends Animal {

	boolean isIndoor;

	public Cat(String name, int age, boolean isIndoor) {
		super(name, age);
		this.isIndoor = isIndoor;
	}

	public void Climb() {
		System.out.println(name+"점프점프");
		
	}

	@Override
	public void eat() {
		super.eat();
		System.out.println(this.name + " 가 추루를 먹");
	}
	@Override
	public void displayInfo() {
		
		super.displayInfo();
		System.out.println("실내묘: "+ (isIndoor ? "예" : "아니오"));
	}
	
	@Override
	public void makeSound() {
		
		super.makeSound();
		System.out.println(name + " 가 야옹~~~");
	}



	

//	@Override
//	public void climb() {
//		
//		super.climb();
//		System.out.println(name + " 점프");
//	}

	
}
