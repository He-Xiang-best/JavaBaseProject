package ch03.Interface;

public class _19TestAnimalImpl {
	public static void main(String[] args) {
		_19AnimalInterface mydog=new _19DogImpl("虎子","黑色");
		_19AnimalInterface mycat=new _19CatImpl("猫咪","白色");
System.out.println("我的黑贝"+((_19DogImpl)mydog).getDogName()+"是这样叫的："
			+mydog.sound()+",它的颜色是"+((_19DogImpl)mydog).getDogColor());
		System.out.print("猫咪喜欢吃 "+mycat.eat());
	}

}
