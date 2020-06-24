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
		System.out.println("请输入一个整数n，并随机生成n个0~100之间的双精度浮点数");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
        num = new Double[n];
        byte sum = 0;
        for (int i = 0; i < n; i++) {
			num[i] = (Math.random()*1000)%101;
			sum += num[i].byteValue();
		}
        PrintStream p =new PrintStream(fileName);
        p.println("\tdata4.txt的字节数为："+sum);
        for (int i = 0; i < num.length; i++) {
        	  p.print(num[i]);
		}
        System.out.println("已打印在data4.txt，请查看！");
        input.close();
        p.close();
	}
	public static void output2() throws IOException {
        int count = 0;
        PrintStream p =new PrintStream(fileName);
        p.println("\tdata4.txt的字节数为："+readdata4());
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
