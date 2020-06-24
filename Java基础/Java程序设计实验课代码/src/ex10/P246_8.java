package ex10;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class P246_8 {
    public static final String fileName = "src/ex10/data3.txt";
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("请输入一个整数，将其范围内的素数打印到data3.txt中");
        Scanner input =new Scanner(System.in);
        PrintStream p = new PrintStream(fileName);
        int n = input.nextInt();
        p.println("    "+n+" 以内的素数有：");
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
        System.out.println("打印完毕！请前往查看！");
        input.close();
        p.close();
	}

}
