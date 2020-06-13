package ch03;

public class _8ParamRef {
	public static void reftest(_8Ref c) { // 对象传递后的引用地址;
		System.out.println("对象传递到方法后，方法中的对象变量c的引用地址值c=" + c);
		// 对象传递后的属性变量值;
		System.out.println("in the reftest before cnt++,c.cnt=" + c.cnt);
		c.cnt++;
		// 显示修改后的属性变量值；
		System.out.println("在方法内，修改后的属性变量值c.cnt=" + c.cnt);
	}

	public static void main(String args[]) {
		_8Ref d = new _8Ref();
		// 对象传递前的引用地址；
		System.out.println("_8ref类的对象变量d的引用地址值d=" + d);
		System.out.println("在调用reftest( )方法前，对象d的属性变量值为d.cnt=" + d.cnt);
		reftest(d);
		System.out.println("在调用reftest( )方法后，对象d的属性变量值d.cnt=" + d.cnt);
	}
}
