package ch02.sec10;

public class OperationPromotionExample {
	public static void main(String[] args) {
		
		
		byte result11 = 10 + 20;
		System.out.println("result1: " + result11);
		
		byte v1 = 10;
		byte v2 = 20;
		int result22 = v1 + v2;
		System.out.println("result2: "+ result22);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000l;
		long result33 = v3 + v4 + v5;
		System.out.println(result33);
		
		int result1 = 10 + 2 + 8 ;
		System.out.println(result1);
		
		String result2 = 10 + 2 + "8";
		System.out.println(result2);
		
		String result3 = 10 + "2" + 8;
		System.out.println(result3);
		
		String result4 = "10" + 2 + 8;
		System.out.println(result4);
				
		String result5 = "10" + (2 + 8);
		System.out.println(result5);
	
	}
		
}
