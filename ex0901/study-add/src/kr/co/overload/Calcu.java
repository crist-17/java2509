package kr.co.overload;

public class Calcu {
	
	//계산기 역할
	public Calcu() {
		
		Calculator calc1 = new Calculator();
		Calculator calc2 = new Calculator();
		
//		 calc1.add(5,3);
//		
//		int re = calc2.add(7,8);  리턴값받음
		
		
		//메소드 오보로딩
		int result1  = calc1.add(5,3);
			// 8
		
		double result2 = calc2.add(2.2, 3.3 );
		int result3 = calc2.add(5, 3,2);
		
		System.out.println(result2);
		System.out.println(result3);
		
//		calc1.cnt =100;
		Calculator.cnt = 99;
		Calculator.total = 1000;
		
		int resultCnt = Calculator.getCnt();
		System.out.println("resultCnt: "+ Calculator.getCnt());
		
		Calculator.initCnt();
		System.out.println("초기화resultCnt: "+ Calculator.initCnt());
		
		
		}
}
  