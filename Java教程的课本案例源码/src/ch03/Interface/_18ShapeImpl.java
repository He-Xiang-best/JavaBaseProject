package ch03.Interface;

public class _18ShapeImpl {
	public static void main(String[] args) {
		_17ShapeInterface circle=new _18CircleImpl(5.0);
		circle.showArea();
		_17ShapeInterface rect=new _18RectImpl(12,10);
		rect.showPerimeter();
		}

}
