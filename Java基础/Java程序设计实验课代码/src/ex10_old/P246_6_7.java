package ex10_old;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class P246_6_7 {
	public static final String FILEN_STRING = "src/ex10/data2.txt";

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		boolean judge = true;
		do {
			judge = true;
			System.out.println("请选择查看的题目：\n1.课本P246第6题\n2.课本P246第7题(要先查看完第6题才可以操作）");
			char key = input.next().charAt(0);
			switch (key) {
			case '1':
				di6ti();
				break;
			case '2':
				di7ti();
				break;
			default:
				System.out.println("题目号码输入错误！请重新输入：");
				judge = false;
				break;
			}
		} while (!judge);
		input.close();
	}

	public static void di6ti() throws FileNotFoundException {
		PrintStream p = new PrintStream(FILEN_STRING);
		for (int i = 0; i < 5; i++) {
			p.println("          *                   *");
		}
		p.println("          * * * * * * * * * * *");
		for (int i = 0; i < 5; i++) {
			p.println("          *                   *");
		}
		System.out.println("图形已绘制在data2.txt中！请查看！");
		p.close();
	}

	public static void di7ti() throws IOException {
		BufferedInputStream readData2 = new BufferedInputStream(new FileInputStream(FILEN_STRING));
		int sum = 0;
		byte[] b = new byte[readData2.available()];
		readData2.read(b);
		for (int i = 0; i < b.length; i++) {
			if (b[i] == '*')
				sum++;
		}
		readData2.close();
		System.out.println("data2.txt*的个数为： " + sum);
		System.out.println("用此字符替换*后得到的图形已保存到data2.txt中");
		PrintStream p = new PrintStream(FILEN_STRING);
		for (int i = 0; i < 5; i++) {
			p.print("         " + sum + "                   " + sum + "\n");
		}
		for (int i = 0; i < 12; i++) {
			if (i == 0)
				p.print("         " + sum);
			else if (i == 11)
				p.print("" + sum % 10 + "");
			else
				p.print("" + sum + "");
		}
		p.println();
		for (int i = 0; i < 5; i++) {
			p.print("         " + sum + "                   " + sum + "\n");
		}
		p.close();

//  方法2：
//		OutputStream outStream = new FileOutputStream(FILEN_STRING, false);
//		for (int i = 0; i < 5; i++) {
//			outStream.write(("         " + sum + "                   " + sum+"\n").getBytes());
//		}
//		for (int i = 0; i < 12; i++) {
//			if (i == 0)
//				outStream.write(("         " + sum).getBytes());
//			else if (i == 11)
//				outStream.write(("" + sum % 10 + "").getBytes());
//			else
//				outStream.write(("" + sum + "").getBytes());
//		}
//		outStream.write(("\n").getBytes());
//		for (int i = 0; i < 5; i++) {
//			outStream.write(("         " + sum + "                   " + sum+"\n").getBytes());
//		}
//
//		outStream.close();
	}

}
