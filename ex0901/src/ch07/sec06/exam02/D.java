package ch07.sec06.exam02;

import ch07.sec06.exam01.A;

public class D extends A{
		public  D() {
			super();
		}
		//protected 가 자식은 접근가능
		public void method1() {
			this.field = "value";
			this.method();
		}
		
	//protected 가 접근불가 
//		public void method2() {
//			A a = new A();
//			a.field = "value";
//			a.method();
//		}
}
