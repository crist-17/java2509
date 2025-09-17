package com.pci.setex;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExam {
	public SetExam() {
	
		//HashSet = 중복제거,순서 보장안됨
			Set<String> hashSet = new HashSet<>();
			
			hashSet.add("Java");
			hashSet.add("Python");
			hashSet.add("JavaScript");
			hashSet.add("Java"); // 중복 X : 추가되지 않음
			System.out.println(hashSet);
			System.out.println("-----------");
			
			//TreeSet = 중복제거, 자동정렬
			Set<Integer> treeSet = new TreeSet();
			
			treeSet.add(30);
			treeSet.add(10);
			treeSet.add(50);
			treeSet.add(20);
			treeSet.add(10);//중복 추가되지않음
			System.out.println("TreeSet(정렬됨) : "+treeSet);
			
			Set<String> linkedHashSet = new LinkedHashSet<>();
			linkedHashSet.add("첫째");
			linkedHashSet.add("둘째");
			linkedHashSet.add("셋째");
			linkedHashSet.add("첫째"); // 중복x 추가되지 않음
			
			System.out.println("LinkedHashSet (순서유지): "+linkedHashSet);
	
	}
}
