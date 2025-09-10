package com.net;

import com.net.add.AddStudent;
import com.net.add.Student6;

public class MainClass {

	public static void main(String[] args) {
//		학생등록 기능을 com.net.add 로 설정
		AddStudent addSt = new AddStudent();
		
		/*
		 * Student2 st2 = new Student2(); 
		 * st2.name = "박창일"; st2.age = 30; 
		 * st2.studentId
		 * = "20250706";
		 * 
		 * System.out.println(st2.name); System.out.println(st2.age);
		 * System.out.println(st2.studentId);
		 */
		
		//ex3 객체생성, 메소드 정의와 사용
		/*
		 * Student3 st3 = new Student3(); st3.introduce(); st3.study();
		 */
		
		//ex4 생성자 constructor
		
		//선언부
		/*
		 * Student4 st4; //구현부 st4 = new Student4();
		 */
		
		//ex5 객체 생성자 (argument 전달 사용)
		/*
		 * Student5 st5; st5 = new Student5(); Student5 st5_a = new Student5("a");
		 * Student5 st5_b = new Student5("b", 29); Student5 st5_c = new
		 * Student5("c",22,"20250722");
		 */
		
		//ex6 종합 _객체생성,필드생성, 생성자에서 필드초기화, 메서드 생성 
		Student6 st6;
		st6 = new Student6();
		//매개 1개
		Student6 st6_a = new Student6("a");
		//매개 2개 -필수 필드입력
		Student6 st6_b = new Student6("20250824","b");
		//매개 3개 - 필수 필드입력
		Student6 st6_c = new Student6("20250824","c",26);
		
	System.out.println(st6_a.name);
		st6_a.introduce();
		st6_b.study();
		st6_c.study();
		
		
	}

}
