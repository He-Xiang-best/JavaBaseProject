package ex10_old;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class P246_10 {
	public static final String fileName = "src/ex10/data4.txt";
	public static int i =0;
	public static Double[] num = null;
	public static void main(String[] args) throws IOException {
		output();
//		readdata4();
//        output2();
	}

	
	public static void output() throws IOException {
		System.out.println("������һ������n�����������n��0~100֮���˫���ȸ�����");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
        num = new Double[n];
        byte sum = 0;
        for (int i = 0; i < n; i++) {
			num[i] = (Math.random()*1000)%101;
			sum += num[i].byteValue();
		}
        PrintStream p =new PrintStream(fileName);
        p.println("\tdata4.txt���ֽ���Ϊ��"+sum);
        for (int i = 0; i < num.length; i++) {
        	  p.print(num[i]);
		}
        System.out.println("�Ѵ�ӡ��data4.txt����鿴��");
        input.close();
        p.close();
	}
	public static void output2() throws IOException {
        int count = 0;
        PrintStream p =new PrintStream(fileName);
        p.println("\tdata4.txt���ֽ���Ϊ��"+readdata4());
        for (int i = 0; i < num.length; i++) {
        	  p.print("\t"+num[i]+"\t");
        	  count++;
        	  if(count%4==0) {
        		  p.println();
        	  }
		}
        p.close();
	}
	public static int readdata4() throws IOException {
		BufferedInputStream data4 = new BufferedInputStream(new FileInputStream(fileName));
//        while((data4.read())!=-1) {
//        	i++;
//        }
        byte[] b = new byte[data4.available()];
        data4.read(b);
        data4.close();
        return b.length;
	}
}
