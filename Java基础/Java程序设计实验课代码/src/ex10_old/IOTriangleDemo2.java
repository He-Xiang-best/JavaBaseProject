package ex10_old;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOTriangleDemo2 {

	public static void main(String[] args) throws IOException {
		//ע�⣺���ļ�Ĭ�ϲ�����
		final String FilePath1 = "src/ex10/Triangle2.txt";
		OutputStream outStream = new FileOutputStream(FilePath1, false);//�ڶ����������Ƿ�׷��д��
		String content = " * * * * *\n";
		content+= "  * * * *\n";
		content+="   * * *\n";
		content+="    * *\n";
		content+="     *\n";
		outStream.write(content.getBytes());//������䣺���ַ���ת�����ֽ����飬д�뵽�ļ���
		outStream.close();
		System.out.println("����:");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print(" ");

			for (int k = 0; k < 5 - i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("�ѳɹ�д�뵽�ļ�" + FilePath1 + "��\n����!!!");

	}

}
