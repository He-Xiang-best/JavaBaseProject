package ex11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;




public class J_StudentOP {
	ArrayList<Student> st=new ArrayList<Student>();


	//从键盘中获得学生成绩基本信息，存入一个学生列表
	public void inputStudents(){
		boolean flag=false;
		int gradeJava,gradeC;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入学生个数");
		try{
			int n=sc.nextInt();

			if (n>0) {
				for(int i=0;i<n;i++){
					System.out.println("请输入学生姓名，java成绩及C成绩");
					Student student=new Student();				
					student.setName(sc.next());
					gradeJava=input(sc);
					gradeC=input(sc);
					student.setGradeJava(gradeJava);
					student.setGradeC(gradeC);					
					st.add(student);
				}
			}//end for if
			else throw new Exception("个数非法");
		}catch(Exception e){
			System.out.print("输入非法"+e);
		}
	}
	/*接收从键盘输入的数字，
	**如果是0-100的符合要求,返回数字
	**否则提示用户输入错误，再次输入
	*/	
	public int input(Scanner sc){
		int grade=0;
		boolean flag=true;
		do{				
		     grade=sc.nextInt();
				if ((grade>0)&&(grade<=100)){
					flag=false;
					break;
				}
				else {
					System.out.print("分数要在0-100之间，请重新输入");
				}
		}while(flag);	
		return grade;
	}

	//将学生数组写入指定的文件中
	public void writeStudent(String file){
		ObjectOutputStream f_out=null;
		try{
			f_out= new ObjectOutputStream(new FileOutputStream((file)));
			for(Student s:st)
				f_out.writeObject(s);
		}catch(Exception ex){
			System.out.print(ex);
		}
	}

	//从文件中读出对象数组
	public ArrayList<Student> readStudents(String file){
		ObjectInputStream f;

		try {
			f = new ObjectInputStream(
					new FileInputStream(file));
			Student s;
			do{	
				s = new Student();
				s=	(Student)(f.readObject( ));
				if(s!=null) {
					st.add(s);
					System.out.println(s);
				}
			}while (s!=null);
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (Exception e) {
			System.out.print(e);
		}
		return st;   
	}

	//计算平均成绩
	public void averageStudent(){
		for (Student s:st){
			s.average();
			System.out.print(s);
			System.out.print("平均成绩"+s.getAverage());
			System.out.println();
		}
	}
	//打印学生成绩
	public void printStudent(){
		for (Student s:st){
			System.out.println(s);
		}
	}

}
