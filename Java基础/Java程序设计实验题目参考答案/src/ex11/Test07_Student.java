package ex11;

import java.util.ArrayList;

public class Test07_Student {
	public static void main(String args[ ])
    {
		String file="Student.dat";
		J_StudentOP jwSt=new J_StudentOP();
		jwSt.inputStudents();
		jwSt.writeStudent(file);
		jwSt.printStudent();
		jwSt.averageStudent();
		
    }
}
