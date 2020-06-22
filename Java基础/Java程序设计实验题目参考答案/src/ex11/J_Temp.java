package ex11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;


public class J_Temp {
	ArrayList<Student> st=new ArrayList<Student>();


	//从键盘中获得学生成绩基本信息，存入一个学生列表
	public void inputStudents(){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入学生个数");
		try{
			int n=sc.nextInt();
			for(int i=0;i<n;i++){
				//循环已获得每个学生的基本信息
			}
		}catch(Exception e){
			System.out.print(e);
		}

	}

	//将学生数组写入指定的文件中
	public void writeStudent(String file){
		ObjectOutputStream f_out=null;
		try{
			//将列表写入文件
		}catch(Exception ex){
			System.out.print(ex);
		}
	}
	
	//从文件中读出对象数组
	public ArrayList<Student> readStudents(String file){
		ObjectInputStream f;

		try {
			//从文件里读取信息，将其对象写入对象列表中
		} catch (Exception e) {
			System.out.print(e);
		}
		return st;   
	}

	//计算平均成绩
	public void averageStudent(){
		//计算平均成绩并按大小排列后输出。
	}
	//打印学生成绩
	public void printStudent(){
		for (Student s:st){
			System.out.println(s);
		}
	}

}
