//package ex08;
///**
// * 题目1
// *  for语句的简化，对象数组，编写程序，满足以下条件：(需讲解)
// *	新建一个学生Student类，属性包括学号、姓名、数学、英语和计算机三门课程成绩及平均分
// *	新建一个学生班级类StudentClass，包含变量一个学生数组长度为5，代表5名学生Student
// *	在构造方法中新建5位学生的基本信息，要求可以通过键盘输入中修改学生除学号、平均分之外的信息
// *	要求该类具有计算学生平均分并最终输出每位学生的学号、姓名、平均分
// */
//public class Student2 {
//	
//	private String id;
//	private String name;
//	private int mathScore;
//	private int englishScore;
//	private int computerScore;
//	// private double averageScore; 平均分使用get方式获取 不使用属性存取
//	
//	public Student2(String id, String name, int mathScore, int englishScore, int computerScore) {
//		this.id = id;
//		this.name = name;
//		this.mathScore = mathScore;
//		this.englishScore = englishScore;
//		this.computerScore = computerScore;
//	}
//
//	public String getId() {
//		return id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getMathScore() {
//		return mathScore;
//	}
//
//	public void setMathScore(int mathScore) {
//		this.mathScore = mathScore;
//	}
//
//	public int getEnglisthScore() {
//		return englishScore;
//	}
//
//	public void setEnglisthScore(int englisthScore) {
//		this.englishScore = englisthScore;
//	}
//
//	public int getComputerScore() {
//		return computerScore;
//	}
//
//	public void setComputerScore(int computerScore) {
//		this.computerScore = computerScore;
//	}
//
//	public double getAverageScore() {
//		return (mathScore + englishScore + computerScore) / 2.0;
//	}
//
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", averageScore=" + getAverageScore() + "]";
//	}
//	
//}