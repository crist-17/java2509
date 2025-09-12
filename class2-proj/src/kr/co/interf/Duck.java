package kr.co.interf;

public class Duck extends Animal implements Flyable, Walkble, Swimmable{

	public Duck(String name, int age) {
		// 	super(); 생략 가능
		super(name, age);
	}
	
	public void info() {
		System.out.println(name + " 나이: "+ age );
		
	}
	

	@Override
	public void swim() {
		System.out.println("오리두둥");
		
	}

	@Override
	public void fly() {
		System.out.println("나는 못날아요");
		
	}

	@Override
	public void walk() {
		System.out.println("뚜벅뚜버ㅓㄱ");
		
	}




}
