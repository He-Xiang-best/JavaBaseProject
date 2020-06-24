package ex08;
/**
 * @content:新建一个学生Student类，属性包括学号、姓名、数学、英语和计算机三门课程成绩及平均分。
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月27日下午6:39:35
 * @第一次修改的时间：
 * @time:2020年6月4日下午10:45:35
 * @修改原因：课堂测验，修改内容：增加学号是否为八位的判断合法性，以及是否为计算机学院的学生
 */
public class Student {
       private String name;
       private String ID;
       private double averageScore;
       private float Computer,Math,English;
public Student() {
     //在构造方法中新建5位学生的基本信息，要求可以通过键盘输入中修改学生除学号、平均分之外的信息；
	//但是实际情况之下，一般录入成绩都是键盘输入，此处就不设置默认信息了
}
	public double getAverageScore() {
		return averageScore;
	}
	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}
	public float getComputer() {
		return Computer;
	}
	public void setComputer(float computer) {
		Computer = computer;
	}
	public float getMath() {
		return Math;
	}
	public void setMath(float math) {
		Math = math;
	}
	public float getEnglish() {
		return English;
	}
	public void setEnglish(float english) {
		English = english;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		String str = "04";
		if(ID.subSequence(0, 2).equals(str))
		return ("计算机学院学号为："+ID+"的"+name+"同学三门科目的平均成绩为:"+(float)averageScore);
		else
		return ("非计算机学院学号为："+ID+"的"+name+"同学三门科目的平均成绩为:"+(float)averageScore);
	}	
	
}
