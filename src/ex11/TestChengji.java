package ex11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestChengji {
	public static void main(String[] args) throws IOException {
		final String filepath = "src/ex11/ChengJi.txt";
		Student[] studentInfo = new Student[3];
			PrintWriter p = new PrintWriter(new File(filepath));
			BufferedWriter w = new BufferedWriter(p);
			Scanner input = new Scanner(System.in);
			System.out.println("请分别输入三个学生的信息：");
			String name = "";
			double javaScore = 0;
			double cScore = 0;
			for (int i = 0; i < studentInfo.length; i++) {	
				studentInfo[i] = new Student();
				System.out.println("请输入第" + (i + 1) + "个学生的姓名");
			    name = input.next();
				studentInfo[i].setName(name);
				System.out.println("请输入第" + (i + 1) + "个学生的Java成绩：");
			 javaScore = input.nextDouble();
				studentInfo[i].setJavaScore(javaScore);
				System.out.println("请输入第" + (i + 1) + "个学生的C语言成绩：");
			 cScore = input.nextDouble();
				studentInfo[i].setcScore(cScore);
				w.write("第" + (i + 1) + "个同学" + studentInfo[i].getName() + "的Java成绩为：" + studentInfo[i].getJavaScore()
						+ ", C语言的成绩为：" + studentInfo[i].getcScore() + "\n");
			}
			System.out.println("\n成绩信息录入完毕，请前往查看！");
          w.close();
          input.close();

	}
}
