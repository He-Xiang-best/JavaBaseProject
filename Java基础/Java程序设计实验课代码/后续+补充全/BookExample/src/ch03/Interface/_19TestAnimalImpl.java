package ch03.Interface;

public class _19TestAnimalImpl {
	public static void main(String[] args) {
		_19AnimalInterface mydog=new _19DogImpl("����","��ɫ");
		_19AnimalInterface mycat=new _19CatImpl("è��","��ɫ");
System.out.println("�ҵĺڱ�"+((_19DogImpl)mydog).getDogName()+"�������еģ�"
			+mydog.sound()+",������ɫ��"+((_19DogImpl)mydog).getDogColor());
		System.out.print("è��ϲ���� "+mycat.eat());
	}

}
