/*
 * */
package ch05;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args){
		ArrayList al=new ArrayList();
		//���뷺��
		//ArrayList<Dog> al=new ArrayList<Dog>();
		//����һֻ��
		Dog dog1=new Dog();
		//���뵽����
		al.add(dog1);
		//ȡ��
		Dog temp=(Dog)al.get(0);
		//�����쳣
		//Cat temp=(Cat)al.get(0);
		//���뷺��
		//Dog temp=al.get(0);
	}
	
}
class Cat
{
	private String color;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
	
}

class Dog
{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
}