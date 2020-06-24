package ex10_old;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class P246_4_5 {
	public final static String pathName = "src/ex10/data.txt";
	private static Scanner input;
    private static int[] gradeInfo = null;
	public static void main(String[] args) throws IOException {
		boolean judge = true;
		for (;;) {
			do {
				judge = true;
 System.out.println(
  "请选择您要进行的操作选项：\n1.写入5名学生成绩到data.txt中\t" + "2.从data.txt中读取5名学生\n"
	+ "3.编辑data.txt中学生的信息\t4.退出程序");
				input = new Scanner(System.in);
				char key = input.next().charAt(0);
				switch (key) {
				case '1':
					writeData();
					break;
				case '2':
					ReadData();
					break;
				case '3':
					edit();
					break;
				case '4':
					System.out.println("\n程序已退出！");
					System.exit(0);
					break;
				default:
					System.out.println("输入错误请重新输入！\n");
					judge = false;
					break;
				}
			} while (!judge);
			System.out.println("\n\n您要继续对信息进行操作么？(y/n)");
			char key2 = input.next().charAt(0);
			while (key2 != 'y' && key2 != 'n') {
				System.out.println("输入错误！请重新输入！");
				key2 = input.next().charAt(0);
			}
			if(key2=='n') {
				System.out.println("程序已结束！");
				System.exit(0);
			}
		}
	}
/*
 * 写入数据：
 */
	public static void writeData() throws FileNotFoundException {
		System.out.println("请分别输入五位学生的成绩（0~100的整数）：");
		PrintStream p = new PrintStream(pathName);
		input = new Scanner(System.in);
		int[] grade = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("第" + (i + 1) + "位同学的成绩是： ");
			//暂不实现类型错误重新输入功能，因为前面的很多都是抛出异常
			try {
				grade[i] = input.nextInt();
			} catch (Exception e) {
				System.err.println("数据输入错误，不是整型！");
				e.printStackTrace();
			}
			//判断成绩的正确性：
			while(grade[i]<0||grade[i]>100) {
				System.out.println("成绩录入错误！请重新输入：");
				grade[i] = input.nextInt();
			}
			//打印到对应的文件当中：
			p.println(grade[i]);
		}
		gradeInfo = grade.clone();
		System.out.println("成绩录入完毕！\n");
		p.flush();
		p.close();

	}
/*
 * 读数据：
 */
	public static void ReadData() throws IOException {
		BufferedReader readData = new BufferedReader(new FileReader(pathName));
		String str = null;
		int[] newGrade = new int[5];
		int sum = 0;
		for (int i = 0; (str = readData.readLine()) != null; i++) {
			sum += Integer.parseInt(str);
			newGrade[i] = Integer.parseInt(str);
		}
		gradeInfo = newGrade.clone();
		System.out.println("成绩信息读取如下：\n");
		System.out.print("学生：\t1\t2\t3\t4\t5\n成绩：\t");
		for (int i = 0; i < gradeInfo.length; i++) {
			System.out.print(gradeInfo[i]+"\t");
		}
		System.out.println("\n五位学生的成绩平均分为： " + (float) sum / 5);
		Arrays.sort(newGrade);
		System.out.println("\n成绩从低到高的排序为：");
		for (int i = 0; i < newGrade.length; i++) {
			System.out.print(newGrade[i] + "\t");
		}
		readData.close();
	}
/*
 * 编辑学生信息：
 */
	public static void edit() throws NumberFormatException, IOException {
		PrintStream p = new PrintStream(pathName);
		input = new Scanner(System.in);
		System.out.println("你想修改第几个学生的成绩？");
		int num = input.nextInt();
		System.out.println("请重新输入该学生的成绩(请四舍五入取整)：");
		gradeInfo[num-1] = input.nextInt();
		for (int i = 0; i < 5; i++) {
			p.println(gradeInfo[i]);
		}
		System.out.println("成绩编辑完毕！新的信息读取如下：\n");
		ReadData();
		p.flush();
		p.close();
	}

}

