package ch03;

public class _15DynamicPoly {
	public static void main(String args[]) {
		_15MyShape ts = new _15MyShape();
		ts.draw();//调用_15Shape类的成员方法draw()画图	
		_15MyRect tr = new _15MyRect("mycube");
		tr.draw();//调用矩形成员方法draw()画图 	
		_15MyCircle tc = new _15MyCircle();
		tc.draw();//调用圆的成员方法draw()画图
		//父类_15MyShape对象polyts使用子类_15MyCircle的构造方法初始化
		ts = new _15MyCircle();
		ts.draw();//父类的对象调用子类中覆盖的方法draw()画图
	}

}
