package ex01;
/**
 * @content:阅读该程序，并在相应方法及语句上进行注释
 * @author:04191315何翔
 * @time:2020年4月12日下午1:55:49
 */
public class LoveDemo
 {//打印图形上半部分，分为两个空格三角形+两个星号三角形
   int HighLevel(int wide) {
	int i = 0, j = 0, k = 0, t = 0, m = 0, n = 0, count = 1;
	m = (wide - 4) / 2;
	do {
		count++;
		m -= 4;
	} while (m > 4);
	if ((wide - 4) % 2 == 0)
	{
		n = 2 + 4 * (count - 1);
		m--;
	} else
		n = 1 + 4 * (count - 1);

	for (i = 0; i < count; i++) {
		for (j = (count - i) * 2; j > 0; j--)
			System.out.print(" ");
		for (k = 0; k < m; k++)
			System.out.print("*");
		for (t = 0; t < n; t++)
			System.out.print(" ");
		for (k = 0; k < m; k++)
			System.out.print("*");
		m += 4;
		n -= 4;
		System.out.print("\n");
	}

	return 0;
}

int LowLevel(int wide) {
	//打印下半部分，是一个倒三角形；
	int i = 0, j = 0, k = 0;
	int high = 0, tmp = wide;
	do
	{
		high++;
		tmp -= 4;
	} while (tmp > 4);
	high += 1;

	for (i = 0; i < high; i++) {
		for (j = 0; j < 2 * i; j++)
			System.out.print(" ");
		for (k = wide - 4 * i; k > 0; k--)
			System.out.print("*");
		System.out.print("\n");
	}
	return 0;
}

public static void main(String[] args) {
	System.out.println("\tI love you (｡♥ᴗ♥｡) ");//打印语句
	int wide = 30;//声明变量并赋值
	LoveDemo one = new LoveDemo();//创建对象
	one.HighLevel(wide);//传递参数并调用方法
	one.LowLevel(wide);//传递参数并调用方法
}
}
