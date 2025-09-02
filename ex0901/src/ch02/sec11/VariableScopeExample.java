package ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		
		//v2 를 이용하기 위해선 v2를 블럭 밖에서 선언후 사용
		int v1 = 15;
		int v2 = 0;
		
		if(v1 > 10) {
			 v2 = v1 - 10;
		}

		System.out.println(v2);
	}

}
