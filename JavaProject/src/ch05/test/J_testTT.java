package ch05.test;

public class J_testTT {
	public static void main(String[] args) {
		J_testG<Circle> a=new J_testG<Circle>();
		a.println(new Circle(3.0));
		
		J_testG<Rect> b=new J_testG<Rect>();
		b.println(new Rect(4.0,5.0));
	}
}
