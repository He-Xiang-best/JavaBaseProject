package ch03.multi;

public class Teacher {
	private String name; //教师姓名
	private String center; //所在单位
	public Teacher(String myName, String myCenter) {
	name = myName; 
	center = myCenter;
	}
	public void giveLession(){
	System.out.println("知识点讲解");
	}
	public void introduction() {
		System.out.println("大家好！我是"+ center + "的" + name + ".");
	         }
	}
