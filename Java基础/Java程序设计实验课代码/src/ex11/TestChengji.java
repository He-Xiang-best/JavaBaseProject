package ex11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * @content:要求从DOS控制台以提问对话的形式，
 * 输入三个同学的姓名、年龄、c语言成绩与java成绩,
 * 并将成绩保存到一个“chengji.txt”的文件中.
 * @author:04191315_何翔
 * @第一次完成的时间：
 * @time:2020年6月17日上午11:55:18
 * @第一次修改的时间：
 * @time:2020年6月17日上午10:30:18
 * @修改原因：课堂测验，修改内容：改为统计任意个数学生成绩
 */
public class TestChengji {
	static final String filepath = "src/ex11/ChengJi.txt";
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("请问你要计算几个学生的成绩？");
		int num = input.nextInt();
		Student[] studentInfo = new Student[num];
		System.out.println("请依次输入这些学生的信息：");
		for (int i = 0; i < studentInfo.length; i++) {
			if(studentInfo[i]==null) {
				System.out.println("请输入第"+(i+1)+"个学生的姓名，年龄，Java成绩和C语言成绩：");
       studentInfo[i] = new Student(input.next(),input.nextInt(),input.nextDouble(),input.nextDouble());
                System.out.println("-----------------------------------------------------");
			}
		}
			BufferedWriter w = new BufferedWriter(new PrintWriter(filepath));
			int i =1;
			for (Student student : studentInfo) {
				w.write("第"+i+"个"+student.toString());
				i++;
			} 
			  w.flush();
	          w.close();
			System.out.println("成绩信息录入完毕！是否现在从文件中读取数据？（y/n）");
			char choose = input.next().charAt(0);
			while(choose!='y'&&choose!='n') {
				System.out.print("输入错误！请重新输入您要进行的操作：");
				choose = input.next().charAt(0);
			}
			if(choose=='y') {
				Readata();
			}
			else
				System.out.println("数据写入ChengJi.txt成功，请前往查看！");
	          input.close();
	}
/*
 * 读取数据：
 */
	private static void Readata() throws IOException {
		BufferedReader readata = new BufferedReader(new FileReader(filepath));
		String content = null;
		System.out.println("Chengji.txt的信息如下：");
		while((content = readata.readLine())!=null) {
			System.out.println(content);
		}
		readata.close();
	}
}
