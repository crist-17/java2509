package com.net.add;

public class Student5 {


	public Student5() {
		System.out.println("학생이 생성됨");
	}
	
	public Student5(String str) {
		System.out.println(str+"학생이 생성됨");
	}

	public Student5(String name, int age) {
		
		System.out.println(name + "학생의 나이는"+ age);
	}

	public Student5(String name, int age, String stid) {
		 System.out.println(name + "학생의 나이는"+ age+" 카드id- "+ stid);
	}

	

}
