package kr.co.interf;

public  class Bird extends Animal implements Flyable, Walkble {

	double kg;
	
	public Bird(String name, int age, double kg) {
		super(name, age);
		this.kg = kg;
		
	}
	public void info() {
		System.out.println(name + " 나이: "+ age + " 몸무게: "+kg);
		
	}
	
	

	@Override
	public void fly() {
		System.out.println("날아보자");
		
	}



	@Override
	public void walk() {
		System.out.println("짹짹");
		
	}


	}
