package kr.co.cls;

public class BasicClass {

	//class making
	public BasicClass() {
		/*
		 * //new키뭐드 객체 생성 Student st1 = new Student(); Student st2 = new Student();
		 * 
		 * //필드값 사용 st1.name = "김철수"; st1.age = 20; st1.stId = "20250715";
		 * 
		 * st2.name = "최영희"; st2.age = 24; st2.stId = "20250716";
		 */
		
		
		//객체생성과 초기화init
		//전체필드 입력
		Student st1 = new Student("김철수", 20, "20250715");
		Student st2 = new Student("최영희", "20250716");
		
		//setter 로 name 변경
		st1.setName("김삽수");
		//getter 로 구문변경
		String myName = st1.getName();
		System.out.println("myName: "+myName);
		
	//메서드호출
		st1.introduce();
		st1.study();
		st1.toString();
		st2.introduce();
		st2.study();
		
	}
}
