package kr.co.interf;

public class InterfaceClass {
	//생성자
	public InterfaceClass() {
		Bird bird  = new Bird("참새", 1,  25.5);
		Duck duck = new Duck("도널드", 3);
		
		bird.info();
		bird.fly();
		bird.walk();
		System.out.println("-------------");
		duck.info();
		duck.swim();
		duck.fly();
		duck.walk();
	}
	
}
