package kr.co.cls;

public class Student {

	private String name;
	int age;
	private String stId;
	 
	//getter
	 public String getName() {
		return name;
	}
	 //setter
	public void setName(String name) {
		this.name = name;
	}
	//getter
	public String getStId() {
		return stId;
	}
	//setter
	public void setStId(String stId) {
		this.stId = stId;
	}

	//전체필드를 사용자에게 입력받는 생성자constructor
	 public Student(String name, int age, String stId) {
		this.name = name;
		this.age = age;
		this.stId = stId;
		
	}
	 
	 //필수입력필드를 사용자에게 입력받는 생성자constructor
	public Student(String name, String stId) {
		this.name = name;
		this.stId = stId;
	}
	
	
	void introduce() {
	
		System.out.println(this.name+"소개합");
	}
	 void study() {
		
		 System.out.println(this.name+"공부합니다.");
		
	}
	@Override
	public String toString() {
		
		return "student(name=" + name;
	}

}
