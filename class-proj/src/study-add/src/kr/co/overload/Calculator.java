package kr.co.overload;

public class Calculator {

//	int cnt;
	//반드시 클래스를 통해서 접근
	static int cnt = 0;
	static int total;
	
	public static int getCnt() {
		
		return cnt;
	}
	

	public static int initCnt() {
		
		cnt = 0;
		return cnt;
	}

	
	
	
	// add(5,3)
	public int add(int num1, int num2) {
		++cnt;
		return num1+num2;
	}

	public double add(double num1, double num2) {
		++cnt;
		return num1+num2;
	}

	public int add(int num1, int num2, int num3) {
		++cnt;
		return num1+num2+num3;
	}

	

	


}
