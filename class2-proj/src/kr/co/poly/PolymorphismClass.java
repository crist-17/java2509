package kr.co.poly;

import kr.co.inherit.Animal;
import kr.co.inherit.Cat;
import kr.co.inherit.Dog;

public class PolymorphismClass {
	
	public  PolymorphismClass() {
		//다형성 배열   ..upCasting 
		Animal[] animals = {
				new Dog("바둑이",5 , "진돗개"),
				new Cat("나비",3 , false),
				new Dog("체리",2 , "푸들"),
				new Cat("까망이",4 , true)
		};
		System.out.println("---------동물소리---------");
		//for - each 문 으로 객체넣어서 배열출력
		for (Animal animal: animals) {
			animal.makeSound();
		}
		System.out.println("----동물들의 행동");
		
		for(Animal animal: animals) {
			if(animal instanceof Dog) {
				//여러개 호출할때 용의 (다운캐스팅)
				Dog dog = (Dog) animal;
				dog.wagTail();
			}else if(animal instanceof Cat) {
				Cat cat = (Cat) animal;
				cat.Climb();
			}
		}
		
//--------------------------------------------------------
		
		
	playwithAnimal(new Dog("루피", 1, "비글"));
	playwithAnimal(new Cat("츄츄", 2, true));
		
	}

	public void playwithAnimal(Animal animal) {
	System.out.println("+++++나의 아이들과 놀아주기+++++");
	animal.eat();
	animal.makeSound();
	
	System.out.println("---------나의 아가들의 행동--------");
	if(animal instanceof Dog) {
		//1개 호출할때 용의 (다운캐스팅)
		((Dog) animal).wagTail();
	}else if (animal instanceof Cat) {
		((Cat) animal).Climb();
	}
		
	}
	

}
