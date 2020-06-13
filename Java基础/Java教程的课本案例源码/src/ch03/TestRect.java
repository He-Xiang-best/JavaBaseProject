package ch03;

public class TestRect {
	static _1Rect rect;
	public static void main(String args[ ])
    {
		rect=new _1Rect(7.9,8.9);
		System.out.print("long是"+rect.getRectLong());
		System.out.print("周长是"+rect.getPerimeter());
    }

}
