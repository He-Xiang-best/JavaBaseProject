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
			System.out.println("��ֱ���������ѧ������Ϣ��");
			String name = "";
			double javaScore = 0;
			double cScore = 0;
			for (int i = 0; i < studentInfo.length; i++) {	
				studentInfo[i] = new Student();
				System.out.println("�������" + (i + 1) + "��ѧ��������");
			    name = input.next();
				studentInfo[i].setName(name);
				System.out.println("�������" + (i + 1) + "��ѧ����Java�ɼ���");
			 javaScore = input.nextDouble();
				studentInfo[i].setJavaScore(javaScore);
				System.out.println("�������" + (i + 1) + "��ѧ����C���Գɼ���");
			 cScore = input.nextDouble();
				studentInfo[i].setcScore(cScore);
				w.write("��" + (i + 1) + "��ͬѧ" + studentInfo[i].getName() + "��Java�ɼ�Ϊ��" + studentInfo[i].getJavaScore()
						+ ", C���Եĳɼ�Ϊ��" + studentInfo[i].getcScore() + "\n");
			}
			System.out.println("\n�ɼ���Ϣ¼����ϣ���ǰ���鿴��");
          w.close();
          input.close();

	}
}
