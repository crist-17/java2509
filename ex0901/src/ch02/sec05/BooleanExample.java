package ch02.sec05;

public class BooleanExample {

	public static void main(String[] args) {
		
		//if문
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
		
		//case 2 상항연산자
		String result = stop ? "중지중지" : "시작시작";
		System.out.println("결과는 : " + result);
		
		int x = 10;
		boolean result1 = (x == 20);
		boolean result2 = (x != 20);
		System.out.println("result1: "+ result1);
		System.out.println("result2: "+ result2);
		
	}
}
