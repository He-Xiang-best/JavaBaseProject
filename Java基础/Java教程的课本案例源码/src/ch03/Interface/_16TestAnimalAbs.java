package ch03.Interface;

public class _16TestAnimalAbs {

	public static void main(String[] args) {
		//(2)测试抽象类是否可以创建对象
		//Animal mydog=new Animal();
		//(3)子类是否可以创建对象
		_16Dog greyhound=new _16Dog("灰狗","灰色");
		_16Cat mimi=new _16Cat("咪咪","白色");
		//(4)子类的对象是否是抽象类的对象
		_16Animal myHeibei=new _16Dog("虎子","深黑色");
//(5)是否可以看看虎子是怎样叫的,想想为什么myHeibei无法直接调用getDogColor()?
		System.out.println("灰狗是这样叫的："+greyhound.sound()+
				"它的颜色是"+greyhound.getDogColor());
		System.out.println("我的黑贝"+myHeibei.getAnimalName()+"是这样叫的："+myHeibei.sound()+",它的颜色是"+((_16Dog)myHeibei).getDogColor());
		System.out.print("猫咪喜欢吃 "+mimi.eat());	
	}


}
