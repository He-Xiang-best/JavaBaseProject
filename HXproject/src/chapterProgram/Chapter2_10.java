package chapterProgram;
import java.util.Scanner;
/**
 * 
 * @content:�ҳ�һ�������ڵ�����
 * @author:����
 * @time:2020��2��20������8:23:02
 */
public class Chapter2_10 {
	private static Scanner input;

	public static void main(String[] args) {
		int start = 0, end = 0,newline = 0,count = 0;
		input = new Scanner(System.in);
		System.out.println("ϵͳ�������ҳ����滮�������е������������밴ָ����У�");
		System.out.println("������ʼ��������");
		start = input.nextInt();
		System.out.println("��������ֹ��������");
		end = input.nextInt();
		System.out.println(start + "~" + end + "֮��������У�");
		for (int i = start; i <= end; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				count++;
				if(newline++%10==0)
				System.out.println();
				System.out.print(i + "\t");
			}
		}
		System.out.println("\n\n"+ start + "~" + end + "֮�乲�и�" + count + "����");
	}
}

