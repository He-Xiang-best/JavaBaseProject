package ex08;

import java.util.Scanner;
/**
 * 
 * @content:新建一个学生班级类StudentClass，包含变量一个学生数组长度为5，代表5名学生Student；
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年5月27日下午6:35:45
 * @第一次修改的时间：
 * @time:2020年6月4日下午10:45:35
 * @修改原因：课堂测验，修改内容：增加学号是否为八位的判断合法性，以及是否为计算机学院的学生
 */
public class StudentClass {

	private static Scanner input;
	public static void main(String[] args) {
		//使用对象数组存储学生的信息：
		input = new Scanner(System.in);
		Student[] s = new Student[5];
		//给对象赋予空间
		for (int i = 0; i < s.length; i++) {
			if(s[i]==null)
				s[i]=new Student();
		}
		
		writeIn(s);//也可以在构造方法里面实现信息的录入
		
       for(;;) {
    	   System.out.println("\n以上的信息是否需要修改(y/n)？");
       if(input.next().charAt(0)=='y')
    	   correct(s);
       else 
    	   break;
       }
       
       System.out.println("**************************************************************");
       System.out.println("录入的5名学生平均成绩信息如下：");
       //for语句简化打印对象的信息：（重写toString方法）
       
       for (Student student : s) {
		System.out.println(student.toString());
	}
       
}
	
	private static void correct(Student[] s) {
		//简单的修改程序：
		System.out.println("请问修改几号同学(填入学号查找)？");
		String find = input.next();
		boolean canfind = false;
         for (Student student : s) {
			if(student.getID().equals(find)){
				canfind = true;
				System.out.println("请问你要修改哪个信息？");
				//注意，一般学号不更改，作为查找来源，科目成绩更改后，平均分要随之变化，
				//题目说不能改平均分应该是说不去手动修改吧，实际的话是会变的
				System.out.println("1.姓名  2.计算机成绩  3.数学成绩  4.英语成绩");
				int choose = input.nextInt();
				switch (choose) {
				case 1:
					System.out.println("请输入新名字：");
					student.setName(input.next());
					break;
				case 2:
					System.out.println("此学生的计算机成绩为：");
					student.setComputer(input.nextFloat());
					student.setAverageScore((student.getComputer()+student.getMath()+student.getEnglish())/3);
					break;
				case 3:
					System.out.println("此学生的数学成绩为：");
					student.setMath(input.nextFloat());
					student.setAverageScore((student.getComputer()+student.getMath()+student.getEnglish())/3);
					break;
				case 4:
					System.out.println("此学生的英语成绩为：");
					student.setEnglish(input.nextFloat());
					student.setAverageScore((student.getComputer()+student.getMath()+student.getEnglish())/3);
					break;
				default:
					System.out.println("选择不存在，请返回重新选择！");
					break;
				}
			}
		}
         if(!canfind)
         System.out.println("此学生不存在，是否学号输错了呢？再试一次吧");
	}
	
	public static void writeIn(Student[] s) {
		System.out.println("请依次录入5个学生的基本信息，以及数、英、计算机三门课程的成绩:");
		String str;
	       for (Student student : s) {   	  
			System.out.print("请输入学生的姓名：");
			student.setName(input.next());
			System.out.print("请输入学生的学号：");
			str = input.next();
			student.setID(judge(str));
			System.out.println("此学生的计算机，数学，英语三门学科的成绩依次是：");
			student.setComputer(input.nextFloat());
//			System.out.print("请输入学生的数学成绩：");
			student.setMath(input.nextFloat());
//			System.out.print("请输入学生的英语成绩：");
			student.setEnglish(input.nextFloat());
			student.setAverageScore((student.getComputer()+student.getMath()+student.getEnglish())/3);
			System.out.println("**************************************************************");
		}
	}
	
	/*
	 * 增加学号是否为八位的判断合法性:
	 */
	public static String judge(String str) {
		while(str.length()!=8) {
			System.out.println("学号不是八位数，输入错误！请重新输入学号：");
			str =input.next();
		}
		return str;
	}
}
