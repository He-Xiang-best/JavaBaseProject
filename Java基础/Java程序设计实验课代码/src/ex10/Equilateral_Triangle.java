package ex10;

import java.io.FileNotFoundException;
import java.io.PrintStream;
/**
 * 
 * @content:��д����Equilateral_Triangleʵ���ڿ���̨�á�*�����һ�������ĵȱ������ͣ�
                       ��д���ļ�triangle.txt��
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��6��4������4:03:33
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��6��4������4:03:33
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class Equilateral_Triangle {
    static String file = "src/ex10/Triangle.txt";
	public static void main(String[] args) {
		try {
			PrintStream p = new PrintStream(file);
			printMethod1(p);
		} catch (FileNotFoundException e) {
			System.err.println("�ļ���ӡ���󣬴�ӡʧ�ܣ�");
			e.printStackTrace();
		}

	}

	public static void  printMethod1(PrintStream out) {
		System.setOut(out);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print(" ");
			for (int k = 0; k < 5 - i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}	
}
