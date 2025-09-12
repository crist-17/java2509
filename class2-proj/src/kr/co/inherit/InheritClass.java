package kr.co.inherit;

public class InheritClass {

		public InheritClass() {
			
			//생성자
			Dog dog = new Dog("멍머이",2, "골디" );
			Cat cat = new Cat("냐옹이", 3, true);
			
			System.out.println("---갸---");
			dog.displayInfo();
			dog.eat();
			dog.makeSound();
			dog.wagTail();
			
			System.out.println("---고양이---");
			cat.displayInfo();
			cat.eat();
			cat.makeSound();
			cat.Climb();
		}
}
