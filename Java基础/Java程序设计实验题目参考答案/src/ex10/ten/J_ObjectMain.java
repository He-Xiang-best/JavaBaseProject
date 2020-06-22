package ex10.ten;

import ex10.J_ObjectOutputStream;
import ex10.J_Student;
import ex2.InputPara;
/**
 * 第七章实验十
 * 采用对象输入输出流
 * 代码更为简化，适用变化的需求。
 * @author 郭晓燕
 * 2017.5.18
 */
public class J_ObjectMain {
	
	public static void main(String[] args) {
		System.out.print("打算输入几位同学的成绩：");
		int length=InputPara.inputIntNumber();
		J_Student[] js=J_ObjectGradeOutput.getScore(length);
		
		J_ObjectOutputStream.writeFile("data1.dat",js);
		
		StringBuffer bs=J_ObjectInputStream.readFile("data1.dat");
		System.out.print(bs);
	}

}
