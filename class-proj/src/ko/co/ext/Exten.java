package ko.co.ext;

public class Exten {

	public Exten() {

		// 상속 기능궇련

		// 최상위 클래스
		Dog dog = new Dog("똘이", 2, "골디");
		Cat cat = new Cat("나비", 3, "페르시안");
		
//		dog.name =  "나의 멍멍이";
//		cat.name = "나의 야옹이";
//		
//		System.out.println(dog.name);
//		System.out.println(cat.name);
		
		System.out.println(dog.name + dog.age + dog.breeds);
		System.out.println(cat.name + cat.age + cat.breeds);
		dog.displayInfo();
		System.out.println("-----------------------");
		cat.displayInfo();
		
		dog.sound();
		cat.sound();
//		System.out.println(dog.displayInfo());
//		System.out.println(cat.displayInfo());
		
	}
}
