package ch03.Interface;

public class _16TestAnimalAbs {

	public static void main(String[] args) {
		//(2)���Գ������Ƿ���Դ�������
		//Animal mydog=new Animal();
		//(3)�����Ƿ���Դ�������
		_16Dog greyhound=new _16Dog("�ҹ�","��ɫ");
		_16Cat mimi=new _16Cat("����","��ɫ");
		//(4)����Ķ����Ƿ��ǳ�����Ķ���
		_16Animal myHeibei=new _16Dog("����","���ɫ");
//(5)�Ƿ���Կ��������������е�,����ΪʲômyHeibei�޷�ֱ�ӵ���getDogColor()?
		System.out.println("�ҹ��������еģ�"+greyhound.sound()+
				"������ɫ��"+greyhound.getDogColor());
		System.out.println("�ҵĺڱ�"+myHeibei.getAnimalName()+"�������еģ�"+myHeibei.sound()+",������ɫ��"+((_16Dog)myHeibei).getDogColor());
		System.out.print("è��ϲ���� "+mimi.eat());	
	}


}
