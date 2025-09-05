package ch05.sec05;

public class IndexOfContainsExample {

	public static void main(String[] args) {
		
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf ("프로그래밍");
		System.out.println(location);                 //출력
		
		String substring = subject.substring(location);
		System.out.println(substring);               //출력
		
		location = subject.indexOf("자바");
		
		if (location != -1) {
			System.out.println("자바와 관련된책");        //출력
		} else {
			System.out.println("자바와 관련없는책");
		}
		
		boolean result = subject.contains("자바");
		 if(result) {
			 System.out.println("자바와 관련이 있는책");      //출력
		 }else {
			 System.out.println("자바와 관련 없는 책");
		 }

	}

}
