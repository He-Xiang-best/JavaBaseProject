//package ex08;
//
//import java.util.HashMap;
//import java.util.Scanner;
////04191412沈泽驰
////第一次完成时间为0604_10:50
////第一次完成时间为0604_10:50 修改原因：修改原因：课堂测验，修改内容：判断学号
///**
// * 题目1
// *  for语句的简化，对象数组，编写程序，满足以下条件：
// *	新建一个学生Student类，属性包括学号、姓名、数学、英语和计算机三门课程成绩及平均分
// *	新建一个学生班级类StudentClass，包含变量一个学生数组长度为5，代表5名学生Student
// *	在构造方法中新建5位学生的基本信息，要求可以通过键盘输入中修改学生除学号、平均分之外的信息
// *	要求该类具有计算学生平均分并最终输出每位学生的学号、姓名、平均分
// */
//public class StudentClass2 {
//	
//	// 哈希表 key为学号 value为学生
//	public HashMap<String, Student> students;
//	
//	public StudentClass2() {
//		students = new HashMap<String, Student>();
//		students.put("12311539", new Student2("12311539", "小A", 65, 85, 95));
//		students.put("14511539", new Student2("14511539", "小B", 80, 90, 90));
//		students.put("12455391", new Student2("12455391", "小C", 90, 85, 80));
//		students.put("12411539", new Student2("12411539", "小D", 80, 85, 90));
//		students.put("12311889", new Student2("12311889", "小E", 80, 85, 75));
//	}
//	
//	//打印所有学生
//	public void printStudents() {
//		students.values().forEach(System.out::println);
//	}
//	
//	public static void main(String[] args) {
//		
//		StudentClass stuClass = new StudentClass();
//		
//		@SuppressWarnings("resource")
//		Scanner sca = new Scanner(System.in);
//		
//		stuClass.printStudents();
//		
//		while (true) {
//			
//			try {
//				
//				System.out.println("请输入学生信息从而修改或添加: (学号 姓名 数学成绩 英语成绩 计算机成绩)");
//				
//				String   id       = sca.next();
//				String   name     = sca.next();
//				int      math     = Integer.parseInt(sca.next());
//				int      english  = Integer.parseInt(sca.next());
//				int      computer = Integer.parseInt(sca.next());
//				
//				if (!id.matches("\\d+")) {
//					throw new IllegalArgumentException("学号必须为数字");
//				}
//				
//				if (id.length() != 8) {
//					throw new IllegalArgumentException("学号必须为8位数");
//				}
//
//				if (id.startsWith("04")) {
//					System.out.println("是计算机学院学生");
//				}
//				
//				stuClass.students2.put(id, new Student2(id, name, math, english, computer));
//				
//				stuClass.printStudents();
//			}
//			catch(IllegalArgumentException exce) {
//				
//				System.out.println("捕获异常:"+exce.getMessage());
//				
//			}
//		}
//		
//	}
//}
//
