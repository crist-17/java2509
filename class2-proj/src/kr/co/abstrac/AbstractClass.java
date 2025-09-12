package kr.co.abstrac;

//추상 < - > 명확
public class AbstractClass {
	
	public AbstractClass() {
	//도형만들기 :color, x, y, 원(반지름), 사각형(w, h)
	Circle circle = new Circle("red", 10.0, 5.0);
	Rectangle rectangle = new Rectangle("blue", 30.0, 10.0,8.0, 5.0);   
	
	System.out.println(circle.getShapetype());
	System.out.println(rectangle.getShapetype());
	}
}
