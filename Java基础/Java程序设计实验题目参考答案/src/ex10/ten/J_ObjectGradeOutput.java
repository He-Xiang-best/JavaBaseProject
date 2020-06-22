package ex10.ten;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

import ex10.J_Student;
import ex2.InputPara;

public class J_ObjectGradeOutput {
	/**
	 * 往对象流PrintStream中写入一个对象数组
	 * @param out 输出对象流
	 * @param st 对象数组
	 */
	public static void  GradeOutput(PrintStream out,J_Student[] st){
		 try
	        {
			  for(J_Student stu:st){
	            out.println(stu);
	            }
			  //out.close( );
	        }
	        catch (Exception e)
	        {
	            System.err.println("发生异常:" + e);
	            e.printStackTrace( );
	        } // try-catch结构结束
		}
	/**
	 * 将一个对象数组写入文件中
	 * @param filename 写入文件的文件名
	 * @param st 写入的数据，一个对象数组
	 */
	public void  writeFile(String filename,J_Student[] st){
		try{
			
			PrintStream obout=new PrintStream(new FileOutputStream(filename,true));
			//for(J_Student s:st)
			GradeOutput(obout,st);
			obout.close();
		}catch (Exception e)
        {
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
	}
	/**
	 * 从控制台获取学生信息，将内容保存在相应的对象数组中
	 * @param length 对象数组的长度
	 * @return 返回对象数组
	 */
	public static J_Student[] getScore(int length){
		J_Student[] st=new J_Student[length];
		String name;
		int age,cScore,javaScore;
		for (int i=0;i<length;i++){
			System.out.print("输入姓名");
			name=InputPara.inputString();
			System.out.print("输入年龄");
			age=InputPara.inputIntNumber();
			System.out.print("输入c成绩");
			cScore=InputPara.inputIntNumber();
			System.out.print("输入java成绩");
			javaScore=InputPara.inputIntNumber();
			st[i]=new J_Student(name,age,cScore,javaScore);
		}
		/*for (J_Student s:st)
			System.out.println(s);*/
		return st;
	}
}
