package ch07.sec06.exam02;

import ch07.sec06.exam01.A;

public class C {
	//protected 가 접근불가 
		public void method() {
			A a = new A();
			a.field = "value";
			a.method();
		}
}
