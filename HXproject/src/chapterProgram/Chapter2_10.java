package chapterProgram;
import java.util.Scanner;
/**
 * 
 * @content:找出一个区间内的素数
 * @author:何翔
 * @time:2020年2月20日下午8:23:02
 */
public class Chapter2_10 {
	private static Scanner input;

	public static void main(String[] args) {
		int start = 0, end = 0,newline = 0,count = 0;
		input = new Scanner(System.in);
		System.out.println("系统将帮您找出您规划的区间中的素数，下面请按指令进行：");
		System.out.println("输入起始区间数：");
		start = input.nextInt();
		System.out.println("请输入终止区间数：");
		end = input.nextInt();
		System.out.println(start + "~" + end + "之间的素数有：");
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
		System.out.println("\n\n"+ start + "~" + end + "之间共有个" + count + "素数");
	}
}

