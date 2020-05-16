package ch03;



public class _14TransType {
	public static void main(String[] args) {
		//（1）隐式类型转换
		_12Student studentLi=new _12Student();
		_12Person Lisi=studentLi;
		System.out.println("李四的年龄是"+Lisi.getAge());
		//注意转换
		System.out.println("李四的年龄是"+((_12Person)studentLi).getAge());
		//（2）显式类型转换
	_12Student s_Li=new _12Student();
		_12Person Li=s_Li;
		_12Person laoLi=(_12Student)Li;
		System.out.println("老李教的姓名是"+laoLi.getName());
		//注意转换
		_12Person liu=new _12Person("刘芳","女",30);
	// _12Student xiaoLiu=(_12Student)liu;
	 //System.out.println("刘芳的年龄是"+xiaoLiu.getAge());		
		
//（3）instanceof的用法
		//不同类型不能直接转换
//		_12Student xiaoLi=new _12Student();
//		System.out.println((_12Student)xiaoLi);
		//利用instanceof来判断引用表达式所指向的实例对象是否是目标实例对象。
		_12Student wang;
		if(liu instanceof _12Student)
		{
			wang=(_12Student)liu;
		}
		else
			{wang=new _12Student("王刚","男",50,"2512","c语言程序设计");}
			System.out.println("学生的姓名为"+wang.getName());
			}

}
