package ex8;

import java.util.Scanner;
/**
 * 第八次实验
 * 第五章 泛型、枚举和递归
 * @author 郭晓燕
 *
 */
public class Five_1 {
	Five_1_Student[]  students;
	
	/**
	 * 初始化，设置学生数组每个元素的基本信息
	 * @throws Exception
	 */
	public   Five_1(){
		students=new Five_1_Student[3];
	}
    public void init() throws Exception{
		String inputs;
		int input,grade1,grade2,grade3;
		
		Scanner sc=new Scanner(System.in);
		
		for (int i=0;i<students.length;i++){
		
			System.out.print("请输入学号");
			input=sc.nextInt();
			System.out.print("请输入姓名");
			inputs=sc.next();
			students[i]=new Five_1_Student(input,inputs);
			//没有处理异常情况
			System.out.print("请输入成绩1");
			grade1=sc.nextInt();		
			System.out.print("请输入成绩2");
			grade2=sc.nextInt();		
		
			System.out.print("请输入成绩3");
			grade3=sc.nextInt();
		
			students[i].setGrade1(grade1);
			students[i].setGrade2(grade2);
			students[i].setGrade3(grade3);
			
		}
		
	}
	/**
	 * 打印学生的基本情况
	 */
	public void printInfo(){
		int i=1;
		
		for (Five_1_Student s:students){
			System.out.println
			("第"+i+"个学生学号"+s.getId());
			System.out.print("姓名"+s.getName());
			System.out.print("平均成绩"+s.getAverage());
			System.out.println();
			i++;
			
		}
	}
	
	public static void main(String[] args) {
		Five_1 five=new Five_1();
		try{
			five.init();
		}catch(Exception e){
			System.out.println(e);
		}
		five.printInfo();
	}	
}
