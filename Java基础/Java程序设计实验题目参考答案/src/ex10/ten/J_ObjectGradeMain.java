package ex10.ten;

import ex10.J_Student;
import ex2.InputPara;

public class J_ObjectGradeMain {

	
	public static void main(String[] args) {
		J_ObjectGradeOutput objOut=new J_ObjectGradeOutput();
		System.out.print("打算输入几位同学的成绩：");
		int length=InputPara.inputIntNumber();
		J_Student[] st=objOut.getScore(length);		
		objOut.writeFile("data.dat", st);
		StringBuffer bs=J_ObjectGradeInput.readFile("data.dat");
		//for (String s:stu)
			System.out.println(bs);
	}
}
