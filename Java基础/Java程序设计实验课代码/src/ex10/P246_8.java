package ex10;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class P246_8 {
    public static final String fileName = "src/ex10/data3.txt";
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("������һ�����������䷶Χ�ڵ�������ӡ��data3.txt��");
        Scanner input =new Scanner(System.in);
        PrintStream p = new PrintStream(fileName);
        int n = input.nextInt();
        p.println("    "+n+" ���ڵ������У�");
        int j = 2;
        int i = 2;
        int count=0;
        for ( i = 2; i < n ; i++) {
			for (j = 2; j < i; j++) {
				if(i%j==0) {
					break;
				}
			}
			
			if(i==j) {
				p.print("\t"+i);
				count++;
			}
			if(count%10==0) {
				p.println();
			}
		}
        System.out.println("��ӡ��ϣ���ǰ���鿴��");
        input.close();
        p.close();
	}

}
