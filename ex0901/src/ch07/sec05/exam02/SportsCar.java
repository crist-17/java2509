package ch07.sec05.exam02;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
		
		//stop 은 final 선언을 했기때문에 override 가 안됨.
		
	}
	
	
	
	
}
