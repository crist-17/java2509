package com.net.add;

public class Student6 {
		
		String sdid;
	public	String name;
		int age;
	
		//생성자 : 객체의 초기값을 담당
	public Student6() {
		System.out.println("학생을 확인");
	}

	public Student6(String name) {
		this.name = name;
		
		 System.out.println("학생의 이름"+name);
	}

	public Student6(String sdid, String name) {
			this.sdid = sdid;
			this.name = name;
		
		 System.out.println("학생의 이름"+name+ " 카드id- "+ sdid+"학생의 나이는"+ age);
	}

	public Student6(String sdid, String name, int age) {
		this.sdid = sdid;
		this.name = name;
		this.age = age;
		 System.out.println(name +" 카드id- "+ sdid+ "학생의 나이는"+ age);
	
			 
	}
	
	//method 함수: 액션-행동
	public void introduce() {
		System.out.println(this.name+"자기소개");
		
	}

	public void study() {
		System.out.println(this.name+"공부합니다");
		
	}

	

}
