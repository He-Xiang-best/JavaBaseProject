/*
 * */
package ch05;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args){
		ArrayList al=new ArrayList();
		//引入泛型
		//ArrayList<Dog> al=new ArrayList<Dog>();
		//创建一只狗
		Dog dog1=new Dog();
		//放入到集合
		al.add(dog1);
		//取出
		Dog temp=(Dog)al.get(0);
		//出现异常
		//Cat temp=(Cat)al.get(0);
		//引入泛型
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