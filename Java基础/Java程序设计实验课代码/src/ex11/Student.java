package ex11;

import java.util.Scanner;

/**
 * 
 * @content:创建一个Student学生类，其中域变量包括name,age,javaScore和cScore
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年6月17日下午12:01:52
 * @第一次修改的时间：
 * @time:2020年6月17日下午12:01:52
 * @修改原因：课堂测验，修改内容：
 */
public class Student {
     private String name;
     private int age;
     private double javaScore;
     private double cScore;
	private Scanner input;
//     int aj=1;
     public Student(String name ,int age, double JavaScore , double CScore) {
    	 input = new Scanner(System.in);
    	 boolean judge1 = isRight1(age,JavaScore);
			while(judge1) {
//				if(aj==0)age = input.nextInt();
				JavaScore = input.nextDouble();
				judge1 = isRight1(age, JavaScore);
			}
			boolean judge2 = isRight2(name,CScore);
			while(judge2) {
//				name = input.next();
				CScore = input.nextDouble();
				judge2 = isRight1(age, CScore);
			}
    	 setName(name);setAge(age);setJavaScore(JavaScore);setcScore(CScore);
     }
     
 	/*
 	 * 判断输入类型是否为合规
 	 */
 public boolean isRight1(int age,double Jscore) {
	 String s = String.valueOf(Jscore);
 	for (int i = 0; i < s.length(); i++) {
 		if(!(Character.isDigit(s.charAt(i))||s.charAt(i)=='.')) {
 			System.out.print("Java成绩的数据类型输入错误！请重新输入：");
 			return true;
 		}
 	} 	
 	//判断成绩的正确性：
 	if(Jscore<0||Jscore>100) {
 	System.out.print("Java成绩范围录入错误！请重新输入：");
 	return true;
 }
// 	if(age<0) {
// 		System.out.print("年龄范围录入错误！请重新输入：");
// 		aj=0;
// 		return true;
// 	}
 	
 	return false;	
 }
     
 /*
  * 判断输入类型是否为合规
  */
 public boolean isRight2(String name,double Jscore) {
	 String s = String.valueOf(Jscore);
	 for (int i = 0; i < s.length(); i++) {
		 if(!(Character.isDigit(s.charAt(i))||s.charAt(i)=='.')) {
			 System.out.print("C语言成绩的数据类型输入错误！请重新输入：");
			 return true;
		 }
	 } 	 
	 	//判断成绩的正确性：
	 	if(Jscore<0||Jscore>100) {
	 	System.out.print("C语言成绩范围录入错误！请重新输入：");
	 	return true;
	 	
	 //判断姓名的正确性：
//	 for (int i = 0; i < name.length(); i++) {
//		 if(Character.isLetterOrDigit(name.charAt(i))) {
//			 System.out.print("姓名不和规范！请重新输入：");
//			 return true;
//		 }
	 } 	
	 
	 return false;	
 }
 
     
     
     @Override
    public String toString() {
    	return ("年纪"+getAge()+"岁 , 姓名为"+getName() + "的同学————Java成绩为：" +getJavaScore()
				+ "  ,  C语言的成绩为：" +getcScore() + "\n");
    }
/**
 * @content：通过Getter与Setter方法设置并获取封装好的属性变量
 * @return
 */
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
	public double getJavaScore() {
		return javaScore;
	}
	public void setJavaScore(double javaScore) {
		this.javaScore = javaScore;
	}
	public double getcScore() {
		return cScore;
	}
	public void setcScore(double cScore) {
		this.cScore = cScore;
	}
}
