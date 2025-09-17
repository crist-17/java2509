package com.pci.listex;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
	public ListExam() {
		List<String> arrList = new ArrayList<>();
		arrList.add("사과");
		arrList.add("오렌지");
		arrList.add("포도");
		arrList.add("배");
		//데이터 특정 위치에 값 추가
		arrList.add(1, "딸기");
		
	
		
		
		System.out.println(arrList);
		
		System.out.println(arrList.get(0));
		System.out.println(arrList.get(1));
		System.out.println(arrList.get(2));
		System.out.println(arrList.get(3));
		System.out.println("----------");
		//데이터 특정 위치값의 수정
		arrList.set(2, "포도2");
		System.out.println(arrList);
		System.out.println("----------");
		//데이터 특정 위치값 삭제
		arrList.remove(0);
		System.out.println(arrList);
		System.out.println("----------");
		//리스트 내부의 요소값을 전부삭제
		arrList.clear();
		System.out.println(arrList);
		System.out.println("----------");
		
		System.out.println("for~ (size())");
		List<String> arrList3 = new ArrayList<>();
		arrList3.add("사과3");
		arrList3.add("오렌지3");
		arrList3.add("포도3");
		for (int i = 0; i < arrList3.size(); i++) {
				System.out.println(arrList3.get(i));
		}
		System.out.println("for~ (3)");
		for (int i = 0; i < 3; i++) {
			System.out.println(arrList3.get(i)+"12");
	}
		System.out.println("for~ (each)");
	for (String str : arrList3) {
		System.out.println(str);
	}
		
		List<Integer> arrList2 = new ArrayList<>();
		
		System.out.println("------------");
		arrList2.add(10);
		arrList2.add(20);
		arrList2.add(30);
		System.out.println(arrList2.get(0));
		System.out.println(arrList2.get(1));
		System.out.println(arrList2.get(2));
		
		
	}
}
