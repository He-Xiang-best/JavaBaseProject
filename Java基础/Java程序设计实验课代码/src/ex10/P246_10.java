package ex10;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
/**
 * @content:������һ������n���������n��0~100֮���˫���ȸ�������ӡ��data4.txt�У��ҿ�ͷ����data4.txt���ֽ���
 * @author:04191315_����
 * @��һ����ɵ�ʱ�䣺
 * @time:2020��6��4������11:03:58
 * @��һ���޸ĵ�ʱ�䣺
 * @time:2020��6��4������11:03:58
 * @�޸�ԭ�򣺿��ò��飬�޸����ݣ�
 */
public class P246_10 {
	public static final String fileName = "src/ex10/data4.txt";
	public static void main(String[] args) throws IOException {
		output();
	}
 /*
  * ͳ�Ʋ���ӡ�ļ����ֽ�������Ϣ��
  */
	public static void output() throws IOException {
		System.out.println("������һ������n�����������n��0~100֮���˫���ȸ�����");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		Double[] num = null;
        num = new Double[n];
        byte sum = 0;
        for (int i = 0; i < n; i++) {
			num[i] = (Math.random()*1000)%101;
			sum += Double.toString(num[i]).getBytes().length;
		}
        PrintStream p =new PrintStream(fileName);
        p.println("data4.txt���ֽ���Ϊ��"+sum);
        for (int i = 0; i < num.length; i++) {
        	  p.print(num[i]);
		}
        System.out.println("�Ѵ�ӡ��data4.txt����鿴��");
        input.close();
        p.close();
	}
}
