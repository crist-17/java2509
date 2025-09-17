package com.pci.mapex;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExam {
	public MapExam() {
		
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("사과", 1000);
		hashMap.put("바나나", 500);
		hashMap.put("오렌지", 800);
		hashMap.put("사과", 1200); //기존값 덮어쓰기
		
		System.out.println("HashMap: "+ hashMap);
		System.out.println("사과가격: "+ hashMap.get("사과"));
		System.out.println("---------------");
		
		//키 순회
		System.out.println("키: ");
		for (String key : hashMap.keySet()) {
			System.out.println(key + " ");
		}
		System.out.println();
		//값 순회
		System.out.println("값: ");
		for (Integer vlaue : hashMap.values()) {
			System.out.println(vlaue + " ");
					}
		System.out.println();
		System.out.println("-------------");
		
		
		// TreeMap - 키 기준 자동정렬
		Map<String, String> treeMap = new TreeMap<>();
		treeMap.put("서울", "seoul");
		treeMap.put("부산", "Busan");
		treeMap.put("대구", "Deagu");
		treeMap.put("인천", "Incheon");
		
		System.out.println("TreeMap (키정렬) "+treeMap);
		
		//LinkedHashMap = 입력순서 유지
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(3, "셋");
		linkedHashMap.put(2, "툴");
		linkedHashMap.put(1, "하나");
		
		System.out.println("LinkedHashMap(순서유지): "+linkedHashMap);
		
		
	}
}
