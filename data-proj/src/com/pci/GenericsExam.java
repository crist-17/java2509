package com.pci;

class Box {
	private Object item;
	public void setItem(Object item) {
		this.item = item;
	}
	public Object getItem() {
		return item;
	}
}

class Box2<T> {
	private T item;
	
	public void setItem(T item) {
		this.item = item;
	}
	public T getItem() {
		return item;
	}
}





public class GenericsExam {
public GenericsExam() {
	Box box = new Box();
	box.setItem("hello"); // 문자열 저장
	
	//형변환 필요(런타임 오류가능성 있음
	String str = (String) box.getItem();
	System.out.println(str);
	
	Box2<String> box2 = new Box2<>();
	box2.setItem("Hello2");
	
	String str2 = box2.getItem();
	System.out.println(str2);
	
	Box2<Integer> box3 = new Box2<>();
	box3.setItem(100);
	//형변환 불필요 (런타임 오류 가능성 x)
	int str3 = box3.getItem();
	System.out.println(str3);
	
			
}
}
